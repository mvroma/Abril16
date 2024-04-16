package com.softtek.Abril16.presentacion.ejercicio2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Coche implements IVehiculo {
    @Value("5")
    private int deposito;


    @Override
    public String moverse() {
        if (deposito > 0) {
            return "El coche se está moviendo ...";
        } else {

            return "Hay que echar gasolina";
        }
    }
}