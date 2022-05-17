package com.MaksDenysov.V5.Controller;

import com.MaksDenysov.V5.Service.ResponseDTO;
import com.MaksDenysov.V5.Service.Services;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/crysalis")
public class Controll {


    private Services services;

    public Controll(Services services) {
        this.services = services;
    }


    @PostMapping(value = "/a", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO add(@RequestBody RequestDTO requestDTO){

        return services.create(requestDTO);

    }


}
