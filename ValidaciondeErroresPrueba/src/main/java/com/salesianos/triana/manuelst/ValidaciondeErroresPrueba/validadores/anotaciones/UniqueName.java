package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.anotaciones;

import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.validacion.UniqueNameValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueNameValidator.class)
@Documented
public @interface UniqueName {

    String message() default "El nombre de la estacion debe ser único";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
