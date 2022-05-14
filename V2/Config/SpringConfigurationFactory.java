package com.MaksDenysov.V2.Config;


import com.MaksDenysov.V2.Controller.Contr;
import com.MaksDenysov.V2.Service.Serv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigurationFactory {

    @Bean
    public Contr controllerBean(){

        return new Contr(serviceBean());

    }
    @Bean
    public Serv serviceBean(){

        return new Serv();

    }


}
