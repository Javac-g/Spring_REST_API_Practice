package com.MaksDenysov.V3.Controller;

import com.MaksDenysov.V3.Service.SkillsResultEnum;

public class ResponseDTO {
    String name;
    Integer id;

    Pet pet;

    SkillsResultEnum skillsResultEnum;

    public SkillsResultEnum getSkillsResultEnum() {

        return skillsResultEnum;
    }

    public void setSkillsResultEnum(SkillsResultEnum skillsResultEnum) {
        this.skillsResultEnum = skillsResultEnum;
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
