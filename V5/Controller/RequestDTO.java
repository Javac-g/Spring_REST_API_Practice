package com.MaksDenysov.V5.Controller;

import java.util.ArrayList;
import java.util.List;

public class RequestDTO {
    String name;
    String position;
    Integer age;
    Integer id;
    Integer one,two;
    boolean have_friends;

    Tools tools;

    List<Pet> petList = new ArrayList<>();

    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    public Tools getTools() {
        return tools;
    }

    public void setTools(Tools tools) {
        this.tools = tools;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean getHave_friends() {
        return have_friends;
    }

    public void setHave_friends(boolean have_friends) {
        this.have_friends = have_friends;
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
