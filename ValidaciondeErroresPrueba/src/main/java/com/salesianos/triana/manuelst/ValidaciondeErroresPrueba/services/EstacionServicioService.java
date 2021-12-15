package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.services;

import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.EstacionServicioRepository;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.dto.CreatedEstacionDTO;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.model.EstacionServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
@RequiredArgsConstructor
public class EstacionServicioService {
    private final EstacionServicioRepository repo;

    public EstacionServicio save(CreatedEstacionDTO createdEstacionDTO){
        return repo.save(EstacionServicio.builder()
                .nombre(createdEstacionDTO.getNombre())
                .servicios(createdEstacionDTO.getServicios())
                .fechaApertura(createdEstacionDTO.getFechaApertura())
                .fechaRegistro(LocalDateTime.now())
                .marca(createdEstacionDTO.getMarca())
                .precioGasoilEspecial(createdEstacionDTO.getPrecioGasoilEspecial())
                .precioGasoilNormal(createdEstacionDTO.getPrecioGasoilNormal())
                .precioGasolina98(createdEstacionDTO.getPrecioGasolina98())
                .tieneAutolavado(createdEstacionDTO.isTieneAutolavado())
                .longitud(createdEstacionDTO.getLongitud())
                .latitud(createdEstacionDTO.getLatitud())
                .build());
    }
}
