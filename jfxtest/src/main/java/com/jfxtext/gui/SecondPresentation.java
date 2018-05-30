package com.jfxtext.gui;

import java.util.Observable;
import java.util.Observer;

import org.springframework.beans.factory.annotation.Autowired;

import com.jfxtext.model.MessageModel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SecondPresentation extends Presentation {

    public SecondPresentation(ScreensConfig config) {
        super(config);
    }

    @Autowired
    private MessageModel model;

    @FXML
    TextField messageTf;

    @FXML
    void initialize() {
        messageTf.setText(model.getMessage());

        model.addObserver(new Observer() {
            public void update(Observable o, Object arg) {
                messageTf.setText(model.getMessage());
            }
        });
    }

    @FXML
    void onApply(ActionEvent event) {
        model.setMessage(messageTf.getText());
    }

    @FXML
    void prevView(ActionEvent event) {
        config.loadFirst();
    }

    @FXML
    void openPopup(ActionEvent event) {
        config.loadPopup();
    }


}
