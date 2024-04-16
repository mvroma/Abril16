package com.softtek.Abril16.presentacion.ejercicio3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SeguroCoche {
    @Autowired
    private ITaller taller;
    private String aseguradora;

    public String reparar(Coche1 coche1){
        return taller.reparar(coche1);
    }
}