package com.alexbozzini.coffeenote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class CoffeenoteApplication {

    @PostConstruct
    public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
    }

    public static void main(String[] args) {
        SpringApplication.run(CoffeenoteApplication.class, args);
    }

}
