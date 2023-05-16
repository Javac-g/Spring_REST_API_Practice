package com.MaksDenysov.V1.Controller;


import com.MaksDenysov.V1.Service.Serv;
import com.MaksDenysov.V1.Service.RequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/mygirstapp")
@Controller
public class Contr {

    @Autowired
    private Serv sererv;


    @PostMapping(value = "/addData", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO processData(@RequestBody RequestDTO userDTO){

       return serv.create(userDTO);

    }
    @GetMapping(value = "/getAllData" ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO returnData(@RequestParam Integer id){

        return serv.find(id);


    }
    @PutMapping(value = "/updateAllData" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseDTO updateData(@RequestBody RequestDTO update,@RequestParam Integer id){

        return serv.update(update,id);

    }
    @DeleteMapping(value = "/deleteAllData",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String deleteData(@RequestParam Integer id){

        return String.format("Person №: %d was deleted", serv.delete(id));

    }




}
