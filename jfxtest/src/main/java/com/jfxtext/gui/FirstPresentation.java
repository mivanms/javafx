package com.jfxtext.gui;

import org.springframework.beans.factory.annotation.Autowired;

import com.jfxtext.model.LanguageModel.Language;
import com.locm.jfxtext.control.LanguageController;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

public class FirstPresentation extends Presentation {

    public FirstPresentation(ScreensConfig config) {
        super(config);
    }

    @FXML
    RadioButton engRadio, romRadio, esRadio;
    @FXML
    ToggleGroup langGroup;

    @Autowired
    private LanguageController langCtr;

    @FXML
    void nextView(ActionEvent event) {
        config.loadSecond();
    }

    @FXML
    void initialize() {
        if (Language.RO.equals(langCtr.getLanguage())) {
            engRadio.setSelected(false);
            esRadio.setSelected(false);
            romRadio.setSelected(true);
        }
        if (Language.ES.equals(langCtr.getLanguage())) {
            engRadio.setSelected(false);
            esRadio.setSelected(true);
            romRadio.setSelected(false);
        }
        if (Language.EN.equals(langCtr.getLanguage())) {
            engRadio.setSelected(true);
            esRadio.setSelected(false);
            romRadio.setSelected(false);
        }
        langGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                changeLanguage();
            }
        });
    }

    private void changeLanguage() {
        if (engRadio.isSelected())
            langCtr.toEnglish();
        else
        	 if (esRadio.isSelected())
                 langCtr.toSpanish();
             else
            langCtr.toRomanian();
    }
}
