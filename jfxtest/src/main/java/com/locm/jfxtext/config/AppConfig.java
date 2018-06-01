package com.locm.jfxtext.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.jfxtext.gui.ScreensConfig;
import com.jfxtext.model.LanguageModel;
import com.jfxtext.model.MessageModel;
import com.jfxtext.model.mapper.TipoVehiculoMapper;
import com.jfxtext.model.persistence.dao.TipoVehiculoDao;
import com.jfxtext.service.impl.TipoVehiculoServiceImpl;
import com.jfxtext.service.interfaces.TipoVehiculoService;
import com.locm.jfxtext.control.LanguageController;

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
     
    @Bean
    TipoVehiculoService tipoVehiculoService() {
        return new TipoVehiculoServiceImpl();
    }
    
    @Bean
    TipoVehiculoDao tipoVehiculoDao() {
        return new TipoVehiculoDao();
    }
    
    @Bean
    TipoVehiculoMapper tipoVehiculoMapper() {
        return new TipoVehiculoMapper();
    }
}