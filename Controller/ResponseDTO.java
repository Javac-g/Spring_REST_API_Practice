package com.MaksDenysov.Controller;

import com.MaksDenysov.Service.ExpResultEnum;

public class ResponseDTO {

    private ExpResultEnum expResult;
    private String name;
    private String position;
    private Integer id;

    private Skills skills;


    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public ExpResultEnum getExpResult() {
        return expResult;
    }

    public void setExpResult(ExpResultEnum expResult) {
        this.expResult = expResult;
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
