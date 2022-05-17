package com.MaksDenysov.V5.Controller;

import com.MaksDenysov.V5.Service.ResponseDTO;
import com.MaksDenysov.V5.Service.Services;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/f", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO find(@RequestParam Integer id){

        return services.read(id);

    }

    @PutMapping(value = "/u",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO update(@RequestParam Integer id, @RequestBody RequestDTO requestDTO){

        return services.update(id, requestDTO);

    }

    @DeleteMapping(value = "/d",produces = MediaType.APPLICATION_JSON_VALUE)
    public String delete(@RequestParam Integer id){

        return services.printMessage("Was deleted person №-") + services.delete(id);

    }
}
