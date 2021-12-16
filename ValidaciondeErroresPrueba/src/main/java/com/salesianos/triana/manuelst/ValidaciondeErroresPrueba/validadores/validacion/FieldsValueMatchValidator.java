package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.validacion;

import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.EstacionServicioRepository;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.anotaciones.FieldsValueMatch;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FieldsValueMatchValidator implements ConstraintValidator<FieldsValueMatch, Object> {


    private String fieldMatch;

    @Autowired
    private EstacionServicioRepository estacionServicioRepository;

    @Override
    public void initialize(FieldsValueMatch constraintAnnotation) {

        this.fieldMatch = constraintAnnotation.fieldMatch();

    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {

        String campo = (String) PropertyAccessorFactory.forBeanPropertyAccess(value).getPropertyValue(fieldMatch);

        return StringUtils.hasText(campo) && !estacionServicioRepository.existsByUbicacion(campo);
    }
}
