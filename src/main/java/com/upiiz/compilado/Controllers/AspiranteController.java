package com.upiiz.compilado.Controllers;

import com.upiiz.compilado.Models.Aspirante;
import com.upiiz.compilado.Services.AspiranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AspiranteController {

    @Autowired
    public AspiranteService service;

    @GetMapping("/simple")
    public String verPagina() {
        return "simple";
    }
    @ResponseBody
    @GetMapping("/api/aspirantes")
    public List<Aspirante> listarAspirantes(){
        return service.getAll();
    }
}