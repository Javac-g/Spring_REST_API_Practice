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

    public ResponseDTO read(Integer id){

        for (ResponseDTO search: datalist){

            if(search.getId().equals(id)){

                return search;

            }
        }
        return null;

    }

    public ResponseDTO update(Integer id, RequestDTO requestDTO){
        ResponseDTO responseDTO = read(id);

        if (responseDTO != null){
            responseDTO.setName(requestDTO.getName());
            responseDTO.setId(requestDTO.getId());
            responseDTO.setPet(requestDTO.getPet());
            return responseDTO;
        }
        return null;


    }
    public Integer delete(Integer id){

        int indextoremove = -1;

        for (int i = 0; i < datalist.size();i++){

            if (datalist.get(i).getId().equals(id)) {

                indextoremove = i;

            }
        }
        if (indextoremove != -1){

            datalist.remove(indextoremove);

            return indextoremove;

        }
        return null;


    }




}
