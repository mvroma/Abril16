package com.softtek.Abril16.presentacion.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
@AllArgsConstructor
@Data
public class Saludo {
    public String saludar(){
        return "Bienvenido!";
    }

}

