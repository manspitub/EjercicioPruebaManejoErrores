package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.context.annotation.Description;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstacionServicio {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull(message = "La estacion debe tener un nombre")
    private String nombre;


    private String marca;

    @NotNull(message = "Debe tener latitud")
    private String latitud;

    @NotNull(message = "Debe tener longitud")
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
    @Builder.Default
    private String servicios;

    @JsonFormat(pattern = "ddMMyyyy")
    private LocalDateTime fechaApertura;





}
