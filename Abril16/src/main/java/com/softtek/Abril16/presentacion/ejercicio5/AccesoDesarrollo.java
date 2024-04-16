package com.softtek.Abril16.presentacion.ejercicio5;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data
@Component
@Primary
public class AccesoDesarrollo implements IDAO {

    @Override
    public Cliente insertar(Cliente cliente1) {
        return null;
    }
}