package com.MaksDenysov.V3.Controller;


import com.MaksDenysov.V3.Service.RequestDTO;
import com.MaksDenysov.V3.Service.Serv;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/f",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO findData(@RequestParam Integer id){

        return service.read(id);

    }

    @PutMapping(value = "/u",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO updateData(@RequestParam Integer id, @RequestBody RequestDTO requestDTO){

        return service.update(id, requestDTO);

    }

    @DeleteMapping(value = "/d",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String deleteData(@RequestParam Integer id){

       return service.print("Was deleted person № ") + service.delete(id);

    }






}
