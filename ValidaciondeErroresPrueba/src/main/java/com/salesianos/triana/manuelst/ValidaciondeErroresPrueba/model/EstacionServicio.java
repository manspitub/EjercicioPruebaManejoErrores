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


    private String nombre;


    private String marca;

    private String ubicacion;

    private boolean tieneAutolavado;


    private float precioGasoilNormal;


    private float precioGasolina95Octanos;


    private float precioGasoilEspecial;


    private float precioGasolina98;


    private String servicios;


    private LocalDateTime fechaApertura;


    private LocalDateTime fechaRegistro;





}
