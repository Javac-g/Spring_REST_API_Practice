package com.MaksDenysov.Controller;


import com.MaksDenysov.Service.Serv;
import com.MaksDenysov.Service.RequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/app")
@Controller
public class Contr {

    @Autowired
    private Serv serv;


    @PostMapping(value = "/addData", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO processData(@RequestBody RequestDTO userDTO){

       return serv.forth(userDTO);

    }
    @PostMapping(value = "/getData" ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO returnData(@RequestParam Integer id){

        return serv.five(id);

    }




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
