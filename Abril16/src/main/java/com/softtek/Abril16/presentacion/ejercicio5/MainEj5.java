package com.softtek.Abril16.presentacion.ejercicio5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainEj5 implements CommandLineRunner {

    @Autowired
    private ClienteDao c1;

    public static void main(String[] args) {

        SpringApplication.run(MainEj5.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        // Cliente cliente = new Cliente();


        //Cliente clienteInsertado = c1.insertar(cliente);


        System.out.println("Cliente insertado: " + c1);
    }
}