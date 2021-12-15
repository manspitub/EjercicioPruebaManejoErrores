package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Lob;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDateTime;
@Builder
@Getter @Setter
public class CreatedEstacionDTO {
    @NotNull(message = "{estacion.nombre.null}")
    @NotBlank(message = "{estacion.nombre.blank}")
    private String nombre;



    private String marca;

    @NotNull(message = "{estacion.ubicacion.null}")
    private String ubicacion;

    private boolean tieneAutolavado=false;

    @Min(value=0, message="{estacion.precioGasoilNormal.min}")
    @NotNull(message = "{estacion.precioGasoilNormal.null}")
    private float precioGasoilNormal;

    @Min(value=0, message="{estacion.precioGasolina95Octanos.min}")
    @NotNull(message = "{estacion.precioGasolina95Octanos.null}")
    private double precioGasolina95Octanos;

    @Min(value=0, message="{estacion.precioGasoilEspecial.min}")
    private float precioGasoilEspecial;

    @Min(value=0, message="{estacion.precioGasolina98.min}")
    private float precioGasolina98;

    @Lob
    private String servicios;

    @Past
    private LocalDateTime fechaApertura;

    private LocalDateTime fechaRegistro;

    @NotNull(message = "Debe tener latitud")
    private String latitud;

    @NotNull(message = "Debe tener longitud")
    private String longitud;

}
