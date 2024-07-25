package com.example.springwiring.example6;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*

if you want to observe the behaviour of this circule dependency the remove comment blocks in following class.

Relying upon circular references is discouraged and they are prohibited by default.
Update your application to remove the dependency cycle between beans.

A circular dependency (figure 7 in resources) is a situation in which, to create a bean (let’s
name it Bean A), Spring needs to inject another bean that doesn’t exist yet (Bean B).
But Bean B also requests a dependency to Bean A. So, to create Bean B, Spring needs
first to have Bean A. Spring is now in a deadlock. It cannot create Bean A because it
needs Bean B, and it cannot create Bean B because it needs Bean A.
 */

@Component
public class City {

    private String name;

//    @Autowired
//    private Country country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Country getCountry() {
//        return country;
//    }
//
//    public void setCountry(Country country) {
////        this.country = country;
//    }

    @PostConstruct
    public void init(){
        this.name="Lahore";
    }
}
