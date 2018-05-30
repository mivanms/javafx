/**
 * EjemploTest.java 15-feb-2017
 *
 * Copyright 2017 INDITEX.
 * Departamento de Sistemas
 */
package com.inditex.locm.jfxtext.formacion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The Class EjemploTest.
 *
 * @author <a href="ReneBL@servicioexterno.inditex.com">Rene Balay Lorenzo</a>
 */
public class EjemploTest extends Application {

    /**
     * {@inheritDoc}
     */
    @Override
    public void start(final Stage primaryStage) throws Exception {

        // FXML-CONTROLADOR PURO
        // VBox vbox = (VBox) FXMLLoader.load(getClass().getResource("EjemploView.fxml"));

    	primaryStage.setTitle("Login");
        // COMPONENTE CUSTOM
        final Scene scene = new Scene(new Ejemplo());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Metodo Main.
     *
     * @param args
     *            argumentos de entrada
     */
    public static void main(final String[] args) {
        launch(args);
    }

}
