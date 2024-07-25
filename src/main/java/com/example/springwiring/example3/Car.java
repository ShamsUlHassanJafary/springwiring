package com.example.springwiring.example3;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private String modelName;
    private String modelYear;

    // Using @Autowired to inject the values through the class fields
    @Autowired
    private Engine engine;


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", modelYear='" + modelYear + '\'' +
                ", engine=" + engine +
                '}';
    }

    @PostConstruct
    public void init(){
        this.modelName = "Toyota Crola";
        this.modelYear = "2022";
    }
}
