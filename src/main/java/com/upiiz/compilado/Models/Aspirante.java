package com.upiiz.compilado.Models;

public class Aspirante {
    private Long id;
    private String nombre;
    private String correo;
    private String carrera;

    // Constructor
    public Aspirante(Long id, String nombre, String correo, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
    }

    // Getters
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public String getCarrera() { return carrera; }
}