package com.MaksDenysov.V4.Controller;

import com.MaksDenysov.V4.Service.ResponseDTO;
import com.MaksDenysov.V4.Service.Serv;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/V4")
public class Contr {

    public Contr(Serv serv) {
        this.serv = serv;
    }

    private Serv serv;

    @PostMapping(value = "/a",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO add(@RequestBody RequestDTO requestDTO){

        return   serv.create(requestDTO);

    }

































}
