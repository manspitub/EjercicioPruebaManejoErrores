package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.validacion;

import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.anotaciones.UbicacionPatternValueMatch;
import org.springframework.beans.PropertyAccessorFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.regex.Pattern;

public class UbicacionPatternValueMacthValidator implements ConstraintValidator<UbicacionPatternValueMatch, Object> {

    private String ubicacionField;

    @Override
    public void initialize(UbicacionPatternValueMatch constraintAnnotation) {
        ubicacionField = constraintAnnotation.ubicacionPatternField();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        String ubicacion= (String) PropertyAccessorFactory.forBeanPropertyAccess(o).getPropertyValue(ubicacionField);
        String lonMatchAndLatMatch = "^([-+]?\\d{1,2}[.]\\d+),\\s*([-+]?\\d{1,3}[.]\\d+)$";

        return Pattern.matches(lonMatchAndLatMatch,ubicacion);
    }
}
