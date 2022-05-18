package com.MaksDenysov.V6.Config;

import com.MaksDenysov.V6.Controller.Control;
import com.MaksDenysov.V6.Services.Services;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigurationFactory {

    @Bean
    public Services servicesBean(){

        return new Services();

    }
    @Bean
    public Control controlBean(){

        return new Control(servicesBean());

    }


}
