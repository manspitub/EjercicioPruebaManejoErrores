package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba;

import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.dto.CreatedEstacionDTO;
import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.model.EstacionServicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstacionServicioRepository extends JpaRepository<EstacionServicio, Long> {


    boolean existsByNombre(String nombre);
}