package com.softtek.Abril16.presentacion.ejercicio2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Conductor {
    @Autowired
    private IVehiculo vehiculo;

    public String conducir(){
        return vehiculo.moverse();
    }

    public String reparar() {
        return "El coche está listo para ser reparado";
    }
}
