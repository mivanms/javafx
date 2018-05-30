package com.inditex.locm.jfxtext.gui;

import org.springframework.beans.factory.annotation.Autowired;

import com.inditex.locm.jfxtext.model.MessageModel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class PopupPresentation extends Modal {

    public PopupPresentation(ScreensConfig config) {
        super(config);
    }

    @Autowired
    private MessageModel model;

    @FXML
    TextField messageTf;

    @FXML
    void initialize() {
        messageTf.setText(model.getMessage());
    }

    @FXML
    void clickedOk(ActionEvent event) {
        dialog.close();
    }

    @FXML
    void onApply(ActionEvent event) {
        model.setMessage(messageTf.getText());
    }
}
