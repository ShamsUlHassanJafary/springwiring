package com.example.springwiring.example3;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Engine {

    private String name;
    private Integer horsePower;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }

    @PostConstruct
    public void init(){
        this.name="Loco-Motive";
        this.horsePower=1200;
    }
}
