package com.example.springwiring.example5;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Department {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void init(){
        this.name="History";
    }
}
