package com.MaksDenysov.V2.Service;

import com.MaksDenysov.V2.Controller.Pet;

public class RequestDTO {

    String name;
    Integer age;

    Pet pet;
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
