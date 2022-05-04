package com.MaksDenysov.Service;

import com.MaksDenysov.Controller.Expirience;
import com.MaksDenysov.Controller.Skills;

import java.util.ArrayList;
import java.util.List;

public class RequestDTO {

    String name;
    String position;
    Integer id;

    Skills skills;

    List<Expirience> expirienceList =new ArrayList<>();


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
