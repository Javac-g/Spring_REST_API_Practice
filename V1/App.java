package com.MaksDenysov.V1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 


@EnableTransactionManagement 
public class App {

    public static void main(String...args){


        SpringApplication.run(App.class,args);


    }
}
