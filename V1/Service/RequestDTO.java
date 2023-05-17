package com.MaksDenysov.V1.Service;

import com.MaksDenysov.V1.Controller.Expirience;
import com.MaksDenysov.V1.Controller.Skills;

import java.util.ArrayList;
import java.util.List;

public class RequestDTO {

    private String name;
    private String position;
    private Integer id;

    private Skills skills;

    private List<Expirience> expirienceList =new ArrayList<>();

    public RequestDTO(){}
    
    public RequestDTO(String name,String position, Integer id){
        this.name = sssname;
        this.position = position;
        this.id = id;
    }
    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public List<Expirience> getExpirienceList() {
        return expirienceList;
    }

    public void setExpirienceList(List<Expirience> expirienceList) {
        this.expirienceList = expirienceList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
