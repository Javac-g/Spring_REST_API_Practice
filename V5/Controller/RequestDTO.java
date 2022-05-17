package com.MaksDenysov.V5.Controller;

public class RequestDTO {
    String name;
    String position;
    Integer age;
    Integer id;
    boolean have_friends;

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

    public boolean isHave_friends() {
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
