package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.anotaciones;

import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.validacion.FieldsValueMatchValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = FieldsValueMatchValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldsValueMatch {
    String message() default "No deben coincidir el atributo con uno ya registrado en la base de datos";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};


    String fieldMatch();

    @Target({ ElementType.TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        FieldsValueMatch[] value();
    }
}
