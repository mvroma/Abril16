package com.softtek.Abril16.presentacion.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class MainEj3 implements CommandLineRunner{
    @Autowired
    private SeguroCoche taller;
    Coche1 coche = new Coche1("1234ab","seat");

    public static void main(String[] args) {

        SpringApplication.run(MainEj3.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(taller.reparar(coche));
    }
}
