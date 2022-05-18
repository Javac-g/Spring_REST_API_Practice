package com.MaksDenysov.V6.Services;

import com.MaksDenysov.V6.Controller.Car;
import com.MaksDenysov.V6.Controller.RequestDTO;

import java.util.ArrayList;
import java.util.List;

public class Services {

    List<ResponseDTO> bd = new ArrayList<>();
    public ResponseDTO create(RequestDTO json){
        ResponseDTO user = new ResponseDTO();

        user.setName(json.getName());
        user.setWork(json.getWork());
        user.setTool(json.getTool());

        for (Car c: json.getCardata()){
            switch (c.getBrand()){
                case "junior":
                    user.setCarEnum(CarEnum.BMV);
                    break;
                case "middle":
                    user.setCarEnum(CarEnum.AUDI);
                    break;
                case "senior":
                    user.setCarEnum(CarEnum.PORSHE);
                    break;
            }
        }

        bd.add(user);

        return user;


    }
    public ResponseDTO read(Integer id){

        for (ResponseDTO fUser: bd){

            if (fUser.getId().equals(id)){

                return fUser;

            }

        }

        return null;

    }




    //File end
}
