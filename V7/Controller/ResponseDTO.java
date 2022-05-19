package com.MaksDenysov.V7.Controller;

import com.MaksDenysov.V7.Service.Pet_Enum;

import java.util.ArrayList;
import java.util.List;

public class ResponseDTO {


    String name;
    String position;

    Integer age;
    Integer id;

    Car car;

    Pet_Enum pet;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Pet_Enum getPet() {
        return pet;
    }

    public void setPet(Pet_Enum pet) {
        this.pet = pet;
    }
}
