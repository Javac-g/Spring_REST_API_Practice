package com.MaksDenysov.Controller;


import com.MaksDenysov.Service.Serv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/app")
@Controller
public class Contr {

    @Autowired
    private Serv serv;


    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    @ResponseBody
    String getHello(){

        return serv.first();

    }
    @GetMapping("/name")
    @ResponseBody
    String getInfo(@RequestParam String name){
        return serv.third(name);
    }

    @RequestMapping(value = "/sum",method = RequestMethod.POST)
    @ResponseBody
    String getSum(@RequestParam int a, @RequestParam int b, @RequestBody String body){

        return serv.second(a+b, body);

    }









}
