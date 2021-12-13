package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

public class GetEstacionServicioDto {


    private String nombre;


    private String marca;


    private String latitud;


    private String longitud;

    private boolean tieneAutolavado;


    private float precioGasoilNormal;


    private float precioGasolina95Octanos;

    private float precioGasoilEspecial;


    private float precioGasolina98;


    private String servicios;


    private LocalDateTime fechaApertura;

}
