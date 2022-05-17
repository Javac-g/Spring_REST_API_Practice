package com.MaksDenysov.V5.Service;

import java.io.*;

public class Services {

    public String printMessage(String msg){

        return msg;

    }

    public void textLog(ResponseDTO responseDTO){

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

        try(FileOutputStream F = new FileOutputStream("V5_Text_Log.txt",true)){

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


}
