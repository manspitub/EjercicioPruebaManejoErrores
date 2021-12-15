package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.error.excepciones;

public class ListEntityNotFoundException extends EntityNotFoundException{

    public ListEntityNotFoundException(Class clase){
        super(String.format("No se pudieron encontrar elementos del tipo %s", clase));
    }

}
