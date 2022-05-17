package com.MaksDenysov.V5.Service;

import com.MaksDenysov.V5.Controller.RequestDTO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Services {

    List<ResponseDTO> datalist = new ArrayList<>();
    public String printMessage(String msg){

        return msg;

    }

    public void textLog(String filename,ResponseDTO responseDTO){

        byte[] bytes = ("\nName: " + responseDTO.getName() +
                        "\nPosition: " + responseDTO.getPosition() +
                        "\nAge: " + responseDTO.getAge() +
                        "\nId: " + responseDTO.getId()).getBytes();

        ByteArrayOutputStream b = new ByteArrayOutputStream();

        try {

            b.write(bytes);

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

        try(FileOutputStream F = new FileOutputStream(filename,true)){

            b.writeTo(F);

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

    }

    public void dataLog(String filename,ResponseDTO responseDTO){

        try(DataOutputStream d = new DataOutputStream(new FileOutputStream(filename, true))){

            d.writeUTF("Name: " + responseDTO.getName());

            d.writeUTF("Position: " + responseDTO.getPosition());

            d.writeUTF("Age: " + responseDTO.getAge());

            d.writeUTF("Id: " + responseDTO.getId());



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public ResponseDTO create(RequestDTO requestDTO){

        ResponseDTO newUser = new ResponseDTO();

        newUser.setName(requestDTO.getName());

        newUser.setPosition(requestDTO.getPosition());

        newUser.setAge(requestDTO.getAge());

        newUser.setId(requestDTO.getId());

        datalist.add(newUser);

        textLog("Created.txt",newUser);

        dataLog("Created.dat",newUser);

        return newUser;

    }

    public ResponseDTO read(Integer id){

        for (ResponseDTO user: datalist){

            if (user.getId().equals(id)){

                textLog("Search.txt",user);
                dataLog("search.dat",user);

                return user;

            };

        }

        return null;


    }
    public ResponseDTO update(Integer id,RequestDTO income){

        ResponseDTO updated = read(id);

        if(updated != null){

            updated.setName(income.getName());

            updated.setPosition(income.getPosition());

            updated.setId(income.getId());

            updated.setAge(income.getAge());

            textLog("Updated.txt" ,updated);
            dataLog("Updated.dat",updated);

            return updated;

        }

        return null;


    }


}
