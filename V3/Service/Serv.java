package com.MaksDenysov.V3.Service;

import com.MaksDenysov.V3.Controller.ResponseDTO;

import java.util.ArrayList;
import java.util.List;

public class Serv {

    List<ResponseDTO> datalist = new ArrayList<>();

    public String print(String msg){

        return msg;

    }

    public ResponseDTO create(RequestDTO requestDTO){

        ResponseDTO responseDTO = new ResponseDTO();

        responseDTO.setName(requestDTO.getName());

        responseDTO.setId(requestDTO.getId());

        responseDTO.setPet(requestDTO.getPet());

        datalist.add(responseDTO);

        return  responseDTO;

    }




}
