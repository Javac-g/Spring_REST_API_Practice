package com.MaksDenysov.V6.Services;

import com.MaksDenysov.V6.Controller.Car;
import com.MaksDenysov.V6.Controller.RequestDTO;

import java.util.ArrayList;
import java.util.List;

public class Services {

    List<ResponseDTO> bd = new ArrayList<>();

    public String print(String msg){

        return msg;

    }
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

    public ResponseDTO update(Integer id,RequestDTO requestDTO){
        ResponseDTO upUser = read(id);

        if(upUser != null){

            upUser.setName(requestDTO.getName());

            upUser.setWork(requestDTO.getWork());

            upUser.setId(requestDTO.getId());

        }
        return null;

    }
    public Integer delete(Integer id){

        int indx = -1;

        for (int i = 0; i < bd.size();i++){

            if(bd.get(i).getId().equals(id)){

                indx = i;

            }

        }

        if (indx != -1){

            bd.remove(indx);

        }

        return indx;

    }




    //File end
}
