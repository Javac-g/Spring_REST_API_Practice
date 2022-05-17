package com.MaksDenysov.V5.Config;

import com.MaksDenysov.V5.Controller.Controll;
import com.MaksDenysov.V5.Service.Services;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigurationFactory {

    @Bean
    public Services serverBean(){

        return new Services();

    }


    @Bean
    public Controll controllBean(){

        return new Controll(serverBean());

    }


}
