package com.softtek.Abril16.presentacion.ejercicio4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Secretario implements Empleado{
    private IInforme informe;
    private Empleado tareas;
    private String empresa;
    private String email ;

    public Secretario(String empresa, String email) {
        this.empresa = empresa;
        this.email = email;
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    @Override
    public String getTareas() {
        return tareas.getTareas();
    }


    public void setInforme(IInforme informe){
        this.informe = informe;
    }


}