package com.MaksDenysov.Controller;


import com.MaksDenysov.Service.Serv;
import com.MaksDenysov.Service.RequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/app")
@Controller
public class Contr {

    @Autowired
    private Serv serv;


    @PostMapping(value = "/addData", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO processData(@RequestBody RequestDTO userDTO){

       return serv.create(userDTO);

    }
    @PostMapping(value = "/getData" ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO returnData(@RequestParam Integer id){

        return serv.find(id);


    }
    @PutMapping(value = "/updateData" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO updateData(@RequestBody RequestDTO update,@RequestParam Integer id){

        return serv.update(update,id);

    }
    @DeleteMapping(value = "/deleteData",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String deleteData(@RequestParam Integer id){

        return "Was deleted person №: " + serv.delete(id);

    }




}
