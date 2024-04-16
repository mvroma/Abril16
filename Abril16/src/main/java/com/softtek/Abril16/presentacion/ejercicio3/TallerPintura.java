package com.softtek.Abril16.presentacion.ejercicio3;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class TallerPintura implements ITaller{

    @Override
    public String reparar(Coche1 coche) {
        String reparacion = "Pintura del coche con matricula: '" + coche.getMatricula();
        return reparacion;
    }
}
