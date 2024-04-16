package com.softtek.Abril16.presentacion.ejercicio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class MainEj2 implements CommandLineRunner{
    @Autowired
    private Conductor c1;

    public static void main(String[] args) {

        SpringApplication.run(MainEj2.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(c1.conducir());

    }
}