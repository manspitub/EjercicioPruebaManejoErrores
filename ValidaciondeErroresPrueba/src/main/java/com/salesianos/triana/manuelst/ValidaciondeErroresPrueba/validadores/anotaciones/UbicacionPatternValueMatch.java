package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.anotaciones;

import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.validacion.UbicacionPatternValueMacthValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UbicacionPatternValueMacthValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)


public @interface UbicacionPatternValueMatch {

    String message() default "La ubicacion no tiene longitud o latitud correspondientes";
    Class <?> [] groups() default {};
    Class <? extends Payload> [] payload() default {};

    String ubicacionPatternField();

}
