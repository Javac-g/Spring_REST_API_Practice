package com.MaksDenysov.V8.Controller;

import java.util.ArrayList;
import java.util.List;

public class RequestDTO {
    String name;
    Integer id;

    List<Pet> petList = new ArrayList<>();

    Tool steck;

    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    public Tool getSteck() {
        return steck;
    }

    public void setSteck(Tool steck) {
        this.steck = steck;
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
