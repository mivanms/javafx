package com.inditex.locm.jfxtext.gui;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.inditex.locm.jfxtext.config.AppConfig;
import com.inditex.locm.jfxtext.model.LanguageModel;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

@Service
public class Main extends Application {

//    private static final Logger logger = LogManager.getLogManager().getLogger(Main.class.getName());
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
//        logger.info("Starting application");

        Platform.setImplicitExit(true);

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ScreensConfig screens = context.getBean(ScreensConfig.class);
        LanguageModel lang = context.getBean(LanguageModel.class);

        screens.setLangModel(lang);
        screens.setPrimaryStage(stage);
        screens.showMainScreen();
//        screens.loadFirst();
        screens.loadResumenVehiculos();
    }
}
