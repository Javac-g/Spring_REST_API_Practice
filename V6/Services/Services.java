package com.MaksDenysov.V6.Services;

import com.MaksDenysov.V6.Controller.Car;
import com.MaksDenysov.V6.Controller.RequestDTO;
import com.fasterxml.jackson.core.io.DataOutputAsStream;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Services {

    List<ResponseDTO> bd = new ArrayList<>();

    public String print(String msg){

        return msg;

    }
    public void logger(String filename,ResponseDTO data){

        byte[] bytes = ("\nName: " + data.getName() + "\nWork: " + data.getWork() + "\nId: " + data.getId()).getBytes();

        ByteArrayOutputStream b = new ByteArrayOutputStream();

        try{

            b.write(bytes);

        }catch (IOException e){
            e.printStackTrace();
        }
        try(FileOutputStream F = new FileOutputStream(filename + ".txt",true);
            DataOutputStream D = new DataOutputStream(new FileOutputStream(filename + ".dat",true))){

            b.writeTo(F);

            D.writeUTF("\nName: " + data.getName());

            D.writeUTF("\nWork: " + data.getWork());

            D.writeUTF("\nId: " + data.getId());

        }catch (IOException e){

            e.printStackTrace();

        }




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

        logger("Created(6)",user);

        return user;


    }
    public ResponseDTO read(Integer id){

        for (ResponseDTO fUser: bd){

            if (fUser.getId().equals(id)){

                logger("Finded(6)",fUser);

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

            logger("Updated(6)",upUser);

            return upUser;

        }
        return null;

    }
    public Integer delete(Integer id){

        int indx = -1;

        for (int i = 0; i < bd.size();i++){

            if(bd.get(i).getId().equals(id)){

                indx = i;
                logger("Deleted(6)",bd.get(indx));

            }

        }

        if (indx != -1){

            bd.remove(indx);

        }

        return indx;

    }




    //File end
}
