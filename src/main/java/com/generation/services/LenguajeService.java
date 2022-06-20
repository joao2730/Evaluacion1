package com.generation.services;

import com.generation.models.Lenguaje;
import com.generation.repositories.LenguajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.validation.Valid;
import java.util.List;

@Service
public class LenguajeService {
    @Autowired
    LenguajeRepository lenguajeRepository;

    public void guardarLenguaje(@Valid Lenguaje lenguaje) {
        lenguajeRepository.save(lenguaje);
    }

}
