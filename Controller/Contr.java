package com.MaksDenysov.Controller;


import com.MaksDenysov.Service.Serv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("/app")
@Controller
public class Contr {

    @Autowired
    private Serv serv;


    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    String getHello(){

        return serv.first();

    }







}
