package com.MaksDenysov.V6.Services;

import com.MaksDenysov.V6.Controller.Car;
import com.MaksDenysov.V6.Controller.Tool;

import java.util.ArrayList;
import java.util.List;

public class ResponseDTO {

    String name;

    String work;

    CarEnum carEnum;

    Tool tool;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public CarEnum getCarEnum() {
        return carEnum;
    }

    public void setCarEnum(CarEnum carEnum) {
        this.carEnum = carEnum;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}
