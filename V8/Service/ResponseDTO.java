package com.MaksDenysov.V8.Service;

import com.MaksDenysov.V8.Controller.Tool;

public class ResponseDTO {

    String name;
    Integer id;

    Tool steck;

    Pet_Enum pet;

    public Tool getSteck() {
        return steck;
    }

    public void setSteck(Tool steck) {
        this.steck = steck;
    }

    public Pet_Enum getPet() {
        return pet;
    }

    public void setPet(Pet_Enum pet) {
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
