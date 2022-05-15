package com.MaksDenysov.V3.Service;

import com.MaksDenysov.V3.Controller.ResponseDTO;
import com.MaksDenysov.V3.Controller.Skill;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Serv {

    List<ResponseDTO> datalist = new ArrayList<>();

    public String print(String msg){

        return msg;

    }

    public ResponseDTO create(RequestDTO requestDTO){

        ResponseDTO responseDTO = new ResponseDTO();

        responseDTO.setName(requestDTO.getName());

        responseDTO.setId(requestDTO.getId());

        responseDTO.setPet(requestDTO.getPet());

        datalist.add(responseDTO);

        logOne(responseDTO);

        logTwo(responseDTO);

        for (Skill skl: requestDTO.getSkilldata()){
            if(skl.getValues().equals("100")){

                responseDTO.setSkillsResultEnum(SkillsResultEnum.PERFECT);
            }else if(skl.getValues().equals("90")){

                responseDTO.setSkillsResultEnum(SkillsResultEnum.GOOD);
            }
            else if(skl.getValues().equals("80")){

                responseDTO.setSkillsResultEnum(SkillsResultEnum.NORMAL);
            }else if(skl.getValues().equals("70")){

                responseDTO.setSkillsResultEnum(SkillsResultEnum.WEAK);
            }
            else if(skl.getValues().equals("60")){

                responseDTO.setSkillsResultEnum(SkillsResultEnum.BAD);
            }
        }

        return  responseDTO;

    }

    public ResponseDTO read(Integer id){

        for (ResponseDTO search: datalist){

            if(search.getId().equals(id)){

                return search;

            }
        }
        return null;

    }

    public ResponseDTO update(Integer id, RequestDTO requestDTO){
        ResponseDTO responseDTO = read(id);

        if (responseDTO != null){
            responseDTO.setName(requestDTO.getName());
            responseDTO.setId(requestDTO.getId());
            responseDTO.setPet(requestDTO.getPet());
            return responseDTO;
        }
        return null;


    }
    public Integer delete(Integer id){

        int indextoremove = -1;

        for (int i = 0; i < datalist.size();i++){

            if (datalist.get(i).getId().equals(id)) {

                indextoremove = i;

            }
        }
        if (indextoremove != -1){

            datalist.remove(indextoremove);

            return indextoremove;

        }
        return null;


    }

    public void logOne(ResponseDTO responseDTO){

        byte[] name = ("\nName: " + responseDTO.getName()).getBytes();

        byte[] id = ("\nId: " + responseDTO.getId()).getBytes();

        ByteArrayOutputStream one = new ByteArrayOutputStream();

        ByteArrayOutputStream two = new ByteArrayOutputStream();

        try {

            one.write(name);

            two.write(id);

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

        try (FileOutputStream f = new FileOutputStream("log.txt")){

            one.writeTo(f);

            two.writeTo(f);

        } catch (IOException e) {

            throw new RuntimeException(e);

        }


    }

    public void logTwo(ResponseDTO responseDTO){

        try(DataOutputStream D = new DataOutputStream( new FileOutputStream("log.dat",true))){

            D.writeUTF("Name: " + responseDTO.getName());

            D.writeUTF("ID: " + responseDTO.getId());


        } catch (IOException e) {

            throw new RuntimeException(e);
        }


    }


}
