package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.anotaciones.UniqueName;
import jdk.jfr.Timestamp;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.context.annotation.Description;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
public class EstacionServicio {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull(message = "La estacion debe tener un nombre")
    @UniqueName(message = "Debe ser unico")
    private String nombre;


    private String marca;

    @NotBlank(message = "{estacionServicio.latitud.blank}")
    private String latitud;

    @NotNull(message = "Debe tener longitud")
    private String longitud;

    private boolean tieneAutolavado;

    @Min(0)
    @NonNull
    private float precioGasoilNormal;

    @Min(value = 0, message = "no debe ser menor a cero")
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

    @Past
    private LocalDateTime fechaApertura;


    private LocalDateTime fechaRegistro;





}
