package com.softtek.Abril16.presentacion.ejercicio4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class MainEj4 implements CommandLineRunner {
    @Autowired
    private Director director;
    /*@Autowired
    private Jefe jefe;
    @Autowired
    private Secretario secretario;*/


    public static void main(String[] args) {

        SpringApplication.run(MainEj4.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println(director.getTareas() + director.getInforme());
    }
}
