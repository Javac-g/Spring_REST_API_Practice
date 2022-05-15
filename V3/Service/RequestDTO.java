package com.MaksDenysov.V3.Service;

import com.MaksDenysov.V3.Controller.Pet;
import com.MaksDenysov.V3.Controller.Skill;

import java.util.ArrayList;
import java.util.List;

public class RequestDTO {


    String name;
    Integer id;

    Pet pet;

    List<Skill> skilldata  = new ArrayList<>();

    public List<Skill> getSkilldata() {
        return skilldata;
    }

    public void setSkilldata(List<Skill> skilldata) {
        this.skilldata = skilldata;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
