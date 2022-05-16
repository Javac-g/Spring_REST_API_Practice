package com.MaksDenysov.V4.Controller;

import java.util.ArrayList;
import java.util.List;

public class RequestDTO {

    String name;

    String position;

    Integer salary;

    Integer id;

    Pet pet;

    List<Skill> skilldata; // = new ArrayList<>();

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
