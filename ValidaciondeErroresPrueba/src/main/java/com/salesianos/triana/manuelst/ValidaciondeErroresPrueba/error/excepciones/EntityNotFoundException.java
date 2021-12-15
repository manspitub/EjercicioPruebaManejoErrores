package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.error.excepciones;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(String mensaje){
        super(mensaje);
    }
}
