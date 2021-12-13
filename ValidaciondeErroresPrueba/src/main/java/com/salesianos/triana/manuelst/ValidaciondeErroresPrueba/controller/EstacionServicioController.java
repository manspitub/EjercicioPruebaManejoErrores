package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.controller;

import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.EstacionServicioRepository;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.dto.GetEstacionServicioDto;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.error.excepciones.SingleEntityNotFoundException;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.model.EstacionServicio;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.services.EstacionServicioService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
@RestController
@RequiredArgsConstructor

public class EstacionServicioController {

    private final EstacionServicioRepository estacionServicioRepository;
    private final EstacionServicioService estacionServicioService;

    @GetMapping("/estacion")
    public ResponseEntity<?> estacionesServicio ()  {
        List<EstacionServicio> estaciones = estacionServicioRepository.findAll();

        if (estaciones.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No hay estaciones Resgistradas");
        } else {
            return ResponseEntity.ok(estaciones);
        }

    }

    public ResponseEntity<?> findEstacion(@PathVariable Long id){
        EstacionServicio estacionServicio = estacionServicioRepository.findById(id).orElseThrow(() -> new SingleEntityNotFoundException(id.toString(), EstacionServicio.class));

        return ResponseEntity.ok(estacionServicio);
    }

    public ResponseEntity<?> crearEstacion(@RequestBody GetEstacionServicioDto nuevo) {
        if (nuevo)


    }

}
