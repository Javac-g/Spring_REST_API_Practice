package com.MaksDenysov.V8.Service;

import com.fasterxml.jackson.core.io.DataOutputAsStream;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Services {


    List<ResponseDTO> datalist = new ArrayList<>();


    public String print(String str){

        return str;

    }

    public void logger(String filename,ResponseDTO user){

        byte[] bytes = ("\nName: " + user.getName() +"\nId: " + user.getId()).getBytes();

        ByteArrayOutputStream b = new ByteArrayOutputStream();


        try(DataOutputStream d = new DataOutputStream(new FileOutputStream(filename + ".dat",true));

            FileOutputStream f = new FileOutputStream(filename + ".txt" , true)) {

            b.write(bytes);

            b.writeTo(f);

            d.writeUTF("\nName: " + user.getName() +"\nId: " + user.getId() );

        }catch (IOException e){
            e.printStackTrace();
        }

    }


}
