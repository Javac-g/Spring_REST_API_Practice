package com.MaksDenysov.V4.Service;

import com.MaksDenysov.V4.Controller.RequestDTO;

import java.util.ArrayList;
import java.util.List;

public class Serv {

    List<ResponseDTO> datalist = new ArrayList<>();

    public String print(String msg){

        return msg;

    }

    public ResponseDTO create(RequestDTO json){

        ResponseDTO person = new ResponseDTO();

        person.setName(json.getName());

        person.setPosition(json.getPosition());

        person.setId(json.getId());

        person.setSalary(json.getSalary());


        datalist.add(person);
        return person;


    }
    public ResponseDTO read(Integer id){

        for (ResponseDTO search: datalist){

            if (search.getId().equals(id)){

                return search;

            }

        }

        return null;

    }



























}
