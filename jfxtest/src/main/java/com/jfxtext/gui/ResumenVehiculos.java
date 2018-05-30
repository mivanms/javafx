package com.jfxtext.gui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ResumenVehiculos extends Presentation {

    @FXML
    private Button btnSalir;
    
    public ResumenVehiculos(ScreensConfig config) {
        super(config);
    }

    @FXML
    void initialize() {

    }

    
    @FXML
    void altaVehiculo(final ActionEvent event) {
    	config.loadAltaVehiculo();    }
    
    @FXML
    void clickedSalir(final ActionEvent event) {
    	config.closeResumenVehiculos();
    }
}
