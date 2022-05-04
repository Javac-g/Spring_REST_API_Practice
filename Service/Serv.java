package com.MaksDenysov.Service;

import com.MaksDenysov.Controller.ResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Serv {

    public List<ResponseDTO> datalist = new ArrayList<>();
    public String first(){

        return "Your app working well";

    }
    public String second(int a, String body){
        return body + ": " + a ;
    }

    public String third(String name){
        return "Hello, your name is: " + name;
    }

    public ResponseDTO forth(RequestDTO requestDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setName("Person name is: " + requestDTO.getName());
        responseDTO.setPosition("Person position is: " + requestDTO.getPosition());
        responseDTO.setId(requestDTO.getId());
        datalist.add(responseDTO);
        return responseDTO;

    }
    public ResponseDTO five(Integer id){

        for(ResponseDTO serch: datalist){
            if(serch.getId().equals(id)){
                return serch;
            }
        }

        return null;
    }
}
