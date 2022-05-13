package com.MaksDenysov.V2.Service;

import com.MaksDenysov.V2.Controller.ResponseDTO;

import java.util.ArrayList;
import java.util.List;

public class Serv {

    List<ResponseDTO> datalist = new ArrayList<>();


    public void create(RequestDTO requestDTO){

        ResponseDTO user = new ResponseDTO();

        user.setName(requestDTO.getName());

        user.setId(requestDTO.getId());

        user.setPet(requestDTO.getPet());

        datalist.add(user);



    }

    public ResponseDTO find(Integer id){

        for(ResponseDTO search: datalist){

            if(search.getId().equals(id)){

                return search;

            }

        }
        return null;


    }

    public ResponseDTO update(Integer id, RequestDTO requestDTO){

        ResponseDTO dataUP = find(id);

        if( dataUP != null){

            dataUP.setName(requestDTO.getName());

            dataUP.setId(requestDTO.getId());

            return dataUP;

        }

        return null;

    }



}
