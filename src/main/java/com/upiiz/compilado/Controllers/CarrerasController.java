package com.upiiz.compilado.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarrerasController {
    @GetMapping("/Carreras")
    public String Carreras() {
        return "Carreras";
    }
}
