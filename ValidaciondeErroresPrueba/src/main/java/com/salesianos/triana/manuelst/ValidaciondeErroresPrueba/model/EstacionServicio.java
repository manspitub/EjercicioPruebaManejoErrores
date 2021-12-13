package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.context.annotation.Description;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class EstacionServicio {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @NonNull
    private String nombre;


    private String marca;

    @NonNull
    private String latitud;

    @NonNull
    private String longitud;

    private boolean tieneAutolavado;

    @Min(0)
    @NonNull
    private float precioGasoilNormal;

    @Min(0)
    @NonNull
    private float precioGasolina95Octanos;

    @Min(0)
    @NonNull
    private float precioGasoilEspecial;

    @Min(0)
    @NonNull
    private float precioGasolina98;

    @Lob
    @NonNull
    private String servicios;

    @JsonFormat(pattern = "ddMMyyyy")
    private LocalDateTime fechaApertura;





}
