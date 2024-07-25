package com.example.springwiring.example2;

import com.example.springwiring.example1.Parrot;
import com.example.springwiring.example1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Example2Config {

    // figure 6 in resources are present this concept

    // Wiring the beans using the @Bean annotated method’s parameters
    @Bean(value = "miko")
    public Parrot parrot(){
        Parrot parrot = new Parrot();
        parrot.setName("Miko");
        return  parrot;
    }

    @Bean(value = "person2")
    public Person person(Parrot miko){ // Wiring the beans using the @Bean annotated method’s parameters
        Person person = new Person();
        person.setName("Shams");
        person.setParrot(miko);
        return person;
    }
}
