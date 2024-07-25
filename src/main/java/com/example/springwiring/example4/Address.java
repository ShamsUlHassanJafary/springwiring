package com.example.springwiring.example4;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Address {

    private String province;
    private String city;
    private String colony;
    private String street;
    private String houseNumber;


    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", colony='" + colony + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                '}';
    }

    @PostConstruct
    public void init(){
        this.province="Punjab";
        this.city= "Lahore";
        this.colony="Wapda Town";
        this.street= "2";
        this.houseNumber="10";
    }
}
