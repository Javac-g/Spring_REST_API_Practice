package com.MaksDenysov.V4.Config;

import com.MaksDenysov.V4.Controller.Contr;
import com.MaksDenysov.V4.Service.Serv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigurationFactory {

    @Bean
    Contr controllerBean(){

        return new Contr(serviceBean());

    }

    @Bean
    Serv serviceBean(){

        return new Serv();

    }





}
