package com.example.cocinaapp.Logica.controllers;

import com.example.cocinaapp.Logica.clases.Receta;

import java.util.ArrayList;
import java.util.List;

public class ManejadorRecetas {
    private static ManejadorRecetas instance = null;
    private List<Receta> recetas;

    public ManejadorRecetas(){
        this.recetas = new ArrayList<Receta>();
    }

    public static ManejadorRecetas getInstance() {
        if (instance == null)
            instance = new ManejadorRecetas();
        return instance;
    }

    public void addReceta(Receta receta){
        this.recetas.add(receta);
    }

}
