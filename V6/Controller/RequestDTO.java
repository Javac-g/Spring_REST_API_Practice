package com.MaksDenysov.V6.Controller;


import java.util.ArrayList;
import java.util.List;

public class RequestDTO {

    String name;

    String work;

    List<Car> cardata = new ArrayList<>();

    Tool tool;

    public List<Car> getCardata() {
        return cardata;
    }

    public void setCardata(List<Car> cardata) {
        this.cardata = cardata;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

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
}
