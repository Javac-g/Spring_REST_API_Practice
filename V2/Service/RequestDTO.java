package com.MaksDenysov.V2.Service;

import com.MaksDenysov.V2.Controller.Pet;

public class RequestDTO {

    public RequestDTO() {
    }

    String name;
    Integer id;

    Pet pet;

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
