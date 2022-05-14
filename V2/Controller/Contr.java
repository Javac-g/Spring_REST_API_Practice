package com.MaksDenysov.V2.Controller;


import com.MaksDenysov.V2.Service.RequestDTO;
import com.MaksDenysov.V2.Service.Serv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/Data")

public class Contr {


    private Serv serv;

    @PostMapping(value = "/addData", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO addData(@RequestBody RequestDTO requestDTO){

        return serv.create(requestDTO);

    }

    @GetMapping(value = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO findData(@RequestParam Integer id){

        return serv.find(id);
    }
    @PutMapping(value = "/update" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO updateData(@RequestParam Integer id, @RequestBody RequestDTO requestDTO){

        return serv.update(id, requestDTO);

    }
    @DeleteMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String deleteData(@RequestParam Integer id){

        return "Was deleted N - " + serv.delete(id);

    }



}
