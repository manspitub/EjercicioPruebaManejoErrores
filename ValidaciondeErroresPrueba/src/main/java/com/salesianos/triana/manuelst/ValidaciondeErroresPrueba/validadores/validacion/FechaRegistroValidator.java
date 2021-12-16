package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.validacion;

import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.anotaciones.FechaRegistroValueMatch;
import org.springframework.beans.PropertyAccessorFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDateTime;

public class FechaRegistroValidator implements ConstraintValidator<FechaRegistroValueMatch, Object> {


    private String fechaAperturaField;

    @Override
    public void initialize(FechaRegistroValueMatch constraintAnnotation) {
        fechaAperturaField = constraintAnnotation.fechaAperturaField();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {

        LocalDateTime fechaApertura = (LocalDateTime) PropertyAccessorFactory.forBeanPropertyAccess(o).getPropertyValue(fechaAperturaField);

        if (LocalDateTime.now().isAfter(fechaApertura) || LocalDateTime.now().equals(fechaApertura)){
            return true;
        } else {
            return false;
        }

    }
}
