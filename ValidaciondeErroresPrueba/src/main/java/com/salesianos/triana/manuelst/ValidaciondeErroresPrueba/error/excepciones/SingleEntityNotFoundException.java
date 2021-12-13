package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.error.excepciones;

public class SingleEntityNotFoundException extends RuntimeException{

    public SingleEntityNotFoundException(String id, Class clase){
        super(String.format("No se pudo encontrar una entidad del tipo %s con ID %s", clase.getName(), id));
    }
}
