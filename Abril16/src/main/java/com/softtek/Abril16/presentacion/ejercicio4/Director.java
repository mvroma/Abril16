package com.softtek.Abril16.presentacion.ejercicio4;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
public class Director implements Empleado {
    @Autowired
    private IInforme informe;


    public Director(IInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    @Override
    public String getTareas() {
        return "Tareas del Director";
    }
}