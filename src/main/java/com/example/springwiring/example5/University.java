package com.example.springwiring.example5;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class University {

    private String name;
    private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    @Autowired
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
    @PostConstruct
    public void init(){
        this.name="Rice University";
    }

}
