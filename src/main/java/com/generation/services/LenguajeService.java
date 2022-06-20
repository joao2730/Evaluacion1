package com.generation.services;

import com.generation.models.Lenguaje;
import com.generation.repositories.LenguajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
public class LenguajeService {
    @Autowired
    LenguajeRepository lenguajeRepository;

    public void guardarLenguaje(@Validated Lenguaje lenguaje) {
        lenguajeRepository.save(lenguaje);
    }

}
