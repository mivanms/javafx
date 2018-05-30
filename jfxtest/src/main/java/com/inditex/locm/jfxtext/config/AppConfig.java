package com.inditex.locm.jfxtext.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.inditex.locm.jfxtext.control.LanguageController;
import com.inditex.locm.jfxtext.gui.ScreensConfig;
import com.inditex.locm.jfxtext.model.LanguageModel;
import com.inditex.locm.jfxtext.model.MessageModel;

@Configuration
@Import(ScreensConfig.class)
public class AppConfig {
 
    @Bean
    LanguageModel languageModel() {
        return new LanguageModel();
    }
     
    @Bean
    LanguageController languageController() {
        return new LanguageController(languageModel());
    }
 
    @Bean
    MessageModel messageModel() {
        return new MessageModel();
    }
}