package com.MaksDenysov.V2.Service;

import com.MaksDenysov.V2.Controller.ResponseDTO;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class Serv {

    public List<ResponseDTO> datalist = new ArrayList<>();

    public String printMessage(String msg){

        return (msg);

    }

    public void log(ResponseDTO responseDTO){

            String path = "datalog.dat";

            try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(path,true))){

                dataOutputStream.writeUTF("\nName: " + responseDTO.getName());

                dataOutputStream.writeUTF("\nId: "  + responseDTO.getId());

            }catch (IOException e){

                e.printStackTrace();

            }

            try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream(path))){

                dataInputStream.readUTF();

            }catch (IOException e){
                e.printStackTrace();

            }


    }
    public void logTwo(ResponseDTO responseDTO){

        byte[] name =("\nName: " + responseDTO.getName()).getBytes();

        byte[] id = ("\nId: "+responseDTO.getId()).getBytes(); ;

        String path = "log.txt";

        ByteArrayOutputStream b = new ByteArrayOutputStream();

        ByteArrayOutputStream C = new ByteArrayOutputStream();

        try{

            b.write(name);

            C.write(id);

        }catch (IOException e){
            e.printStackTrace();
        }


        try(FileOutputStream f = new FileOutputStream(path,true)) {

            b.writeTo(f);

            C.writeTo(f);

        } catch (IOException e) {

            throw new RuntimeException(e);
        }


    }
    public ResponseDTO create(RequestDTO requestDTO){

        ResponseDTO responseDTO = new ResponseDTO();

        responseDTO.setName(requestDTO.getName());

        responseDTO.setId(requestDTO.getId());

        responseDTO.setPet(requestDTO.getPet());

        log(responseDTO);

        logTwo(responseDTO);

        datalist.add(responseDTO);

        return responseDTO;

    }

    public ResponseDTO find(Integer id){

        for(ResponseDTO search: datalist){

            if(search.getId().equals(id)){

                return search;

            }

        }
        return null;


    }

    public ResponseDTO update(Integer id, RequestDTO requestDTO){

        ResponseDTO dataUP = find(id);

        if( dataUP != null){

            dataUP.setName(requestDTO.getName());

            dataUP.setId(requestDTO.getId());

            return dataUP;

        }

        return null;

    }

    public Integer delete(Integer id){

        int indextoremove = -1;

        for (int i = 0 ; i < datalist.size(); i++){

            if(datalist.get(i).getId().equals(id)){

                indextoremove = i;

            }

        }
        if(indextoremove != -1){

            datalist.remove(indextoremove);

        }
        return indextoremove;


    }

}
