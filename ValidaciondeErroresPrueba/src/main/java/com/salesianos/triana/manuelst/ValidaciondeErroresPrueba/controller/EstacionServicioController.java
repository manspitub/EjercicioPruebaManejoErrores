package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.controller;

import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.EstacionServicioRepository;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.error.excepciones.SingleEntityNotFoundException;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.model.EstacionServicio;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.services.EstacionServicioService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@Controller
@RestController
@RequiredArgsConstructor

public class EstacionServicioController {

    private final EstacionServicioRepository estacionServicioRepository;
    private final EstacionServicioService service;

    @GetMapping("/estacion")
    public ResponseEntity<?> estacionesServicio ()  {
        List<EstacionServicio> estaciones = estacionServicioRepository.findAll();

        if (estaciones.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No hay estaciones Resgistradas");
        } else {
            return ResponseEntity.ok(estaciones);
        }

    }

    @GetMapping("/estacion/{id}")
    public ResponseEntity<?> findEstacion(@PathVariable Long id){
        EstacionServicio estacionServicio = estacionServicioRepository.findById(id).orElseThrow(() -> new SingleEntityNotFoundException(id.toString(), EstacionServicio.class));

        return ResponseEntity.ok(estacionServicio);
    }

    @PostMapping("/")
    public ResponseEntity<?> crearEstacion(@Valid @RequestBody EstacionServicio nuevo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(estacionServicioRepository.save(nuevo));


    }

}
