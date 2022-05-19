package com.MaksDenysov.V7.Config;

import com.MaksDenysov.V7.Controller.ControLLer;
import com.MaksDenysov.V7.Service.Services;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigurationFactory {

    @Bean

   public Services servicesBean(){

        return new Services();
   }

   @Bean
   public ControLLer controLLerBean(){

       return new ControLLer(servicesBean());

   }
}
