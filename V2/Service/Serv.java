package com.MaksDenysov.V2.Service;

import com.MaksDenysov.V2.Controller.ResponseDTO;

import java.util.ArrayList;
import java.util.List;

public class Serv {

    List<ResponseDTO> datalist = new ArrayList<>();


    public void create(RequestDTO requestDTO){

        ResponseDTO user = new ResponseDTO();

        user.setName(requestDTO.getName());

        user.setAge(requestDTO.getAge());

        user.setPet(requestDTO.getPet());

        datalist.add(user);



    }



}
