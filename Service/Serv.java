package com.MaksDenysov.Service;

import org.springframework.stereotype.Service;

@Service
public class Serv {


    public String first(){

        return "Your app working well";

    }
    public String second(int a, String body){
        return body + a ;
    }

    public String third(String name){
        return "Hello, your name is: " + name;
    }


}
