package com.MaksDenysov.V7.Controller;

import com.MaksDenysov.V7.Service.Services;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/7")
public class ControLLer {

    Services make;

    public ControLLer(Services make) {
        this.make = make;
    }
    @PostMapping(value = "/a",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO add(@RequestBody RequestDTO requestDTO){

        return make.Create(requestDTO);

    }
    @GetMapping(value = "/f",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO find(@RequestParam Integer id){

        return make.Read(id);
    }
    @PutMapping(value = "/u",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO update(@RequestParam Integer id,@RequestBody RequestDTO requestDTO ){

        return make.Update(id, requestDTO);
    }

    @DeleteMapping (value = "/d",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String delete(@RequestParam Integer id) {

        return make.print("Was deleted person N ") + make.delete(id);
    }
}
