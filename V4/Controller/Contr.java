package com.MaksDenysov.V4.Controller;

import com.MaksDenysov.V4.Service.ResponseDTO;
import com.MaksDenysov.V4.Service.Serv;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/f",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO find(@RequestParam Integer id){

        return serv.read(id);

    }
    @PostMapping(value = "/u",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO update(@RequestParam Integer id, @RequestBody RequestDTO requestDTO){

        return serv.update(id, requestDTO);

    }
    @DeleteMapping(value = "/d",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String delete(@RequestParam Integer id){

        return serv.print("Deleted person № ") + serv.delete(id);

    }

































}
