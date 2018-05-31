package com.jfxtext.gui;

import org.springframework.beans.factory.annotation.Autowired;

import com.jfxtext.model.dto.TipoVehiculoDTO;
import com.jfxtext.service.interfaces.TipoVehiculoService;
import com.jfxtext.util.Constantes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class AltaVehiculo extends Modal {

    public AltaVehiculo(ScreensConfig config) {
        super(config);
    }

    @Autowired(required = false)
    private TipoVehiculoService tipoVehiculoService;

    @FXML
    ChoiceBox cmbTipoVehiculo;
    
    @FXML
    TextArea descripcion;

    @FXML
    TextField matricula;
    
    @FXML
    void initialize() {
    	loadCmbTpVh();
    }

    @FXML
    void cancelarAltaVehiculo(ActionEvent event) {
        dialog.close();
    }

    @FXML
    void crearVehiculo(ActionEvent event) {
//        model.setMessage(messageTf.getText()); 
    	System.out.println(((TipoVehiculoDTO)cmbTipoVehiculo.getSelectionModel().getSelectedItem()).getId());
    	System.out.println(descripcion);
    	System.out.println(matricula);
    	 dialog.close();
    }
    
    @FXML
    void validateMatricula(KeyEvent key) {
        if (matricula.getText().length() > Constantes.MAX_LENGTH) {
            String s = matricula.getText().substring(0, Constantes.MAX_LENGTH);
            matricula.setText(s);
        }
        matricula.positionCaret( matricula.getText().length());
    }

    private void loadCmbTpVh(){
        ObservableList obList = FXCollections.observableList(tipoVehiculoService.getTiposVehiculos());
        cmbTipoVehiculo.setItems(obList);
    }
}
