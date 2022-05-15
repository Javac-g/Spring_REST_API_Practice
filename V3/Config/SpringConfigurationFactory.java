package com.MaksDenysov.V3.Config;


import com.MaksDenysov.V3.Controller.Control;
import com.MaksDenysov.V3.Service.Serv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigurationFactory {


    @Bean
    public Serv beanServ(){

        return new Serv();

    }

    @Bean
    public Control beanControl(){

        return new Control(beanServ());

    }


}
