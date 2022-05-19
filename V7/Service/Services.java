package com.MaksDenysov.V7.Service;

import com.MaksDenysov.V7.Controller.Pet;
import com.MaksDenysov.V7.Controller.RequestDTO;
import com.MaksDenysov.V7.Controller.ResponseDTO;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Services {

    List<ResponseDTO> datalist = new ArrayList<>();

    public String print(String msg){

        return msg;

    }
    public void log(String filename,ResponseDTO user){

        byte[] bytes = ("\nName: "+ user.getName() + "\nPosition: " + user.getPosition() + "\nAge: " + user.getAge() + "\nId: " + user.getId()).getBytes();

        ByteArrayOutputStream b = new ByteArrayOutputStream();
        try {

            b.write(bytes);

        }catch (IOException e){

            e.printStackTrace();
        }
        try(DataOutputStream d = new DataOutputStream( new FileOutputStream(filename+".dat",true));

            FileOutputStream F = new FileOutputStream(filename+".txt",true)){

            b.writeTo(F);

            d.writeUTF("\nName: " + user.getName() + "\nPosition: " + user.getPosition() + "\nAge: " + user.getAge() + "\nId: " + user.getId());

        }catch (IOException e){
            e.printStackTrace();
        }


    }


    public ResponseDTO E(ResponseDTO user,RequestDTO re){
        for (Pet x : re.getPets()){

            switch (x.getName()){

                case "mur" :

                    user.setPet(Pet_Enum.CAT);

                    break;

                case "bark" :

                    user.setPet(Pet_Enum.DOG);

                    break;

                case "" :

                    user.setPet(Pet_Enum.FISH);

                    break;

            }

        }


        return user;

    }
    // View layer Methods ends , start Model methods


    public ResponseDTO Create(RequestDTO userData){

        ResponseDTO user = new ResponseDTO();

        user.setName(userData.getName());

        user.setPosition(userData.getPosition());

        user.setAge(userData.getAge());

        user.setId(userData.getId());

        user.setCar(userData.getCar());

        E(user,userData);

        log("add",user);

        datalist.add(user);

        return user;

    }

    public ResponseDTO Read(Integer id ){

        for (ResponseDTO res: datalist){

            if (res.getId().equals(id)){

                log("find",res);

                return res;
            }
        }
        return null;

    }

    public ResponseDTO Update(Integer id,RequestDTO requestDTO){

        ResponseDTO up = Read(id);

        if (up != null){

            up.setName(requestDTO.getName());

            up.setPosition(requestDTO.getPosition());

            up.setId(requestDTO.getId());

            up.setAge(requestDTO.getAge());

            log("update",up);

            return up;
        }

        return null;

    }

    public Integer delete(Integer id){
        int indexToRem = -1;

        for (int c = 0 ; c < datalist.size(); c++){
            if (datalist.get(c).getId().equals(id)){

                indexToRem = c;

            }
        }
        if (indexToRem != -1){
            datalist.remove(indexToRem);
            return indexToRem;
        }


        return null;
    }
}//Cass ends here




