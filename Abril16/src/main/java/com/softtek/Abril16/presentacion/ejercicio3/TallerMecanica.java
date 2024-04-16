package com.softtek.Abril16.presentacion.ejercicio3;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
@NoArgsConstructor
public class TallerMecanica implements ITaller{

    @Override
    public String reparar(Coche1 coche) {
        String reparacion = "Reparación del coche con matrícula: '\'" + coche.getMatricula();
        return reparacion;
    }
}
