package com.MaksDenysov.V6.Controller;

import com.MaksDenysov.V6.Services.ResponseDTO;
import com.MaksDenysov.V6.Services.Services;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/personal")
public class Control {
    private Services services;
    public Control(Services services) {

        this.services = services;

    }
    @PostMapping(value = "/a" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO add(@RequestBody RequestDTO json){

        return services.create(json);

    }
    @GetMapping(value = "/f" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO find(@RequestParam Integer id){

        return services.read(id);

    }

    @PutMapping(value = "/u",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO update(@RequestParam Integer id,@RequestBody RequestDTO json){

        return services.update(id, json);

    }

    @DeleteMapping(value = "/d",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String delete(@RequestParam Integer id){

        return services.print("Was deleted worker №") + services.delete(id);

    }




}
