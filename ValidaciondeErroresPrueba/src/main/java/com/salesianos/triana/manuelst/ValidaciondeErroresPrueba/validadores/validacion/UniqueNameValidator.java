package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.validacion;

import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.EstacionServicioRepository;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.anotaciones.UniqueName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueNameValidator implements ConstraintValidator<UniqueName, String> {
    @Autowired
    private EstacionServicioRepository repositorio;

    @Override
    public void initialize(UniqueName constraintAnnotation) { }

    @Override
    public boolean isValid(String nombre, ConstraintValidatorContext context) {
        return StringUtils.hasText(nombre) && !repositorio.existsByNombre(nombre);
    }
}
