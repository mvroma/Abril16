package com.softtek.Abril16.presentacion.ejercicio1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@SpringBootConfiguration
public class MainEj1 implements CommandLineRunner {

    @Autowired
    private Saludo saludo;

    public static void main(String[] args) {
        SpringApplication.run(MainEj1.class, args);
        }

    @Override
    public void run(String... args) throws Exception { System.out.println(saludo.saludar());

    }
}

