package com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.dto;

import com.salesianos.triana.manuelst.ValidaciondeErroresPrueba.model.EstacionServicio;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class EstacionServicioDtoConverter {

    private final ModelMapper modelMapper;

   public GetEstacionServicioDto convertToDto(EstacionServicio estacionServicio){
       return modelMapper.map(estacionServicio, GetEstacionServicioDto.class);
   }

}
