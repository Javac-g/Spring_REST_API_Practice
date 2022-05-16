package com.MaksDenysov.V4.Service;

import com.MaksDenysov.V4.Controller.RequestDTO;
import com.MaksDenysov.V4.Controller.Skill;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Serv {

    List<ResponseDTO> datalist = new ArrayList<>();

    public String print(String msg){

        return msg;

    }
    public void LogText(ResponseDTO R){

        byte[] name = ("\nName: " + R.getName()).getBytes();
        byte[] id = ("\nId: " + R.getId()).getBytes();
        byte[] position = ("\nPosition: " + R.getPosition()).getBytes();
        byte[] salary = ("\nSalary: " + R.getSalary()).getBytes();

        ByteArrayOutputStream B = new ByteArrayOutputStream();
        try{

            B.write(name);

            B.write(position);

            B.write(id);

            B.write(salary);

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

        try(FileOutputStream F = new FileOutputStream("/textlog.txt")) {

            B.writeTo(F);

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

    }

    public ResponseDTO create(RequestDTO json){

        ResponseDTO person = new ResponseDTO();

        person.setName(json.getName());

        person.setPosition(json.getPosition());

        person.setId(json.getId());

        person.setSalary(json.getSalary());

        for(Skill skill: json.getSkilldata()){

            switch (skill.getBackend()){

                case"spring":

                    person.setSkillResultEnum(SkillResultEnum.GOOD);

                case "php":

                    person.setSkillResultEnum(SkillResultEnum.NORMAL);

                case "js":

                    person.setSkillResultEnum(SkillResultEnum.WEAK);

            }
        }

        datalist.add(person);
        return person;


    }
    public ResponseDTO read(Integer id){

        for (ResponseDTO search: datalist){

            if (search.getId().equals(id)){

                return search;

            }

        }

        return null;
    }

    public ResponseDTO update(Integer id, RequestDTO update){

        ResponseDTO updatedPerson = read(id);

        if(updatedPerson != null){

            updatedPerson.setName(update.getName());

            updatedPerson.setPosition(update.getPosition());

            updatedPerson.setSalary(update.getSalary());

            updatedPerson.setId(update.getId());

            return updatedPerson;

        }
        return null;

    }

    public Integer delete(Integer id){

        int index = -1;

        for (int i = 0; i < datalist.size(); i++){

            if(datalist.get(i).getId().equals(id)){

                index = i;

            }
        }
        if (index != -1){
            datalist.remove(index);
            return index;
        }


        return null;

    }


























}
