package com.softtek.Abril16.presentacion.ejercicio5;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class Cliente {
    //Atributos
    @Value("Federico")
    private String nombre;
    @Value("55463331H")
    private String NIF;
}