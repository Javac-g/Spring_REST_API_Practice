package com.MaksDenysov.V2.Controller;


import com.MaksDenysov.V2.Service.RequestDTO;
import com.MaksDenysov.V2.Service.Serv;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/DB")
public class Contr {

    private Serv serv;

    @GetMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO addData(@RequestBody RequestDTO requestDTO){

        return serv.create(requestDTO);

    }



}
