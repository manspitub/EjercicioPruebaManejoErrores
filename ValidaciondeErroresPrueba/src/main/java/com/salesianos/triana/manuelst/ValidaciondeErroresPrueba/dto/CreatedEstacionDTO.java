package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.dto;

import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.anotaciones.FechaRegistroValueMatch;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.anotaciones.FieldsValueMatch;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.anotaciones.UbicacionPatternValueMatch;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.validadores.anotaciones.UniqueName;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Lob;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Builder
@Getter @Setter


@UbicacionPatternValueMatch(
        ubicacionPatternField = "ubicacion",
        message = "El patrón de latitud/longitud esta mal"
)
@FieldsValueMatch(
        fieldMatch = "ubicacion",
        message = "Las ubicaciones no deben coincidir"
)
@FechaRegistroValueMatch(
        fechaAperturaField = "fechaApertura",
        message = "La fecha no debería ser anterior a la de registro o la actual"
)



public class CreatedEstacionDTO {

    @NotNull(message = "La estacion debe tener un nombre")
    @NotBlank(message = "El nombre no debe quedarse en blanco")
    @UniqueName
    private String nombre;


    private String marca;

    private String ubicacion;

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

}
