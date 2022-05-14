package com.MaksDenysov.V2.Config;


import com.MaksDenysov.V2.Controller.Contr;
import com.MaksDenysov.V2.Service.Serv;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigurationFactory {


    public Contr controllerBean(){

        return new Contr();

    }

    public Serv serviceBean(){

        return new Serv();

    }


}
