package com.example.cocinaapp.Logica.clases;

public class Ingrediente {
    private String nombre;
    private Unidad unidad;

    public Ingrediente(String nombre, Unidad unidad) {
        this.nombre = nombre;
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }
}
