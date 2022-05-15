package com.MaksDenysov.V3.Controller;


import com.MaksDenysov.V3.Service.RequestDTO;
import com.MaksDenysov.V3.Service.Serv;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/person")
public class Control {

    public Control(Serv service) {

        this.service = service;
    }

    private Serv service;

    @PostMapping(value = "/a" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO addData(@RequestBody RequestDTO requestDTO){

        return service.create(requestDTO);
    }






}
