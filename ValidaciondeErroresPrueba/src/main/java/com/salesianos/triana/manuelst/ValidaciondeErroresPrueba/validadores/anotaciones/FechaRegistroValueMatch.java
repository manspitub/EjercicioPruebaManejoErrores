package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.anotaciones;

import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.validacion.FechaRegistroValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = FechaRegistroValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface FechaRegistroValueMatch {

    String message() default "La fecha de apertura no puede ser posterior a la fecha de registro";
    Class <?> [] groups() default {};
    Class <? extends Payload> [] payload() default {};

    String fechaAperturaField();

}
