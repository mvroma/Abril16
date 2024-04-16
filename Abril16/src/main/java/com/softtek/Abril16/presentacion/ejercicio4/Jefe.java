package com.softtek.Abril16.presentacion.ejercicio4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
public class Jefe implements Empleado{
    private IInforme informe;

    public Jefe(IInforme informe) {
        this.informe = informe;
    }

    public Jefe() {

    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    @Override
    public String getTareas() {
        return "Trabajo del jefe";
    }
}
