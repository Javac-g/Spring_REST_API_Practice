package com.MaksDenysov.V7.Service;

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

}




