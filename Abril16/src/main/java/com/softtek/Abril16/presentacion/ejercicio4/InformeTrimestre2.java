package com.softtek.Abril16.presentacion.ejercicio4;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
public class InformeTrimestre2 implements IInforme{
    @Override
    public String getInforme() {
        return "Informe trimsestre 2";
    }
}
