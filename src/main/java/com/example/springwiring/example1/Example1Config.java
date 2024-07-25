package com.example.springwiring.example1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Example1Config {

    // Wiring the beans using a direct method call between the @Bean methods
    @Bean(value = "koko")
    public Parrot parrot(){
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean(value = "person1")
    public Person person(){
        Person person = new Person();
        person.setName("Shams");
        person.setParrot(parrot());
        return person;
    }

    // Question when we uses parrot(), app will create an instance of Parrot class or inject already created object
    // which is present in spring context container ?

    // Ans: it injects object which is already present in spring context container

    // figure 1-5 in resources are related to example 1
}
