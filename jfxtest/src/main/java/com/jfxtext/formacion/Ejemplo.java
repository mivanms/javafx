/**
 * Ejemplo.java 15-feb-2017
 *
 * Copyright 2017 INDITEX.
 * Departamento de Sistemas
 */
package com.inditex.locm.jfxtext.formacion;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

/**
 * The Class Ejemplo.
 *
 * @author <a href="ReneBL@servicioexterno.inditex.com">Rene Balay Lorenzo</a>
 */
public class Ejemplo extends VBox implements Initializable {

    // CUANDO SE USE LA APROXIMACION FXML-CONTROLADOR, SE DEBE DEJAR DE EXTENDER A VBOX Y ESTABLECERLO COMO RAIZ EN EL
    // FXML

    @FXML
    private TextField placeholderNombre;
    @FXML
    private TextField placeholderPassword;
    @FXML
    private Label labelSaludo;

    @FXML
    private Button saludarButton;

    private EjemploDelegate delegate;

    public Ejemplo() {
        // COMPONENTE CUSTOM (COMENTAR O ELIMINAR EL CONSTRUCTOR POR DEFECTO PARA FXML-CONTROLADOR)
        final FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EjemploView.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    public void initialize(final URL location, final ResourceBundle resources) {
        // this.labelSaludo.textProperty().bind(this.placeholderNombre.textProperty());
    }

    public void setDelegate(final EjemploDelegate delegate) {
        this.delegate = delegate;
    }

    /**
     * On saludar button clicked.
     *
     * @param event
     *            event
     */
    @FXML
    void onSaludarButtonClicked(final MouseEvent event) {
        this.labelSaludo.setText("Hola " + this.placeholderNombre.getText());

        if (this.delegate != null) {
            this.delegate.onSaludarClicked(event);
        }
    }

}
