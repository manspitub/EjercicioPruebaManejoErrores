package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.simple.anotaciones;

import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.simple.validadores.PasswordsMatchValidator;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = PasswordsMatchValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PasswordsMatch {

    String message() default "Las contraseñas introducidas no coinciden";
    Class <?> [] groups() default {};
    Class <? extends Payload> [] payload() default {};

    String passwordField();
    String verifyPasswordField();

}

