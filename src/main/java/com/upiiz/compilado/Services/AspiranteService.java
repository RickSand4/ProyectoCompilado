package com.upiiz.compilado.Services;

import com.upiiz.compilado.Models.Aspirante;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AspiranteService {
    public List<Aspirante> getAll() {
        return Arrays.asList(
                new Aspirante(1L, "Ana López", "ana@gmail.com", "Sistemas"),
                new Aspirante(2L, "Luis Pérez", "luis@hotmail.com", "Industrial"),
                new Aspirante(3L, "Carlos Ruiz", "carlos@yahoo.com", "Electrónica")
        );
    }
}
