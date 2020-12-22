package com.example.cocinaapp.Logica.clases;

import java.util.ArrayList;
import java.util.List;

public class Receta {
    private String nombre;
    private Ingrediente[] ingredientes;
    private String descripcion;
    private List<Paso> pasos;
    private Dificultad dificultad;
    private int tiempoEjecucion;
    private int foto;
    private int video;
    private List<Comentario> comentarios;
    private int mediaPuntuacion;
    private List<Integer> puntuaciones;


    public Receta(){};

    public Receta(String nombre, Ingrediente[] ingredientes, String descripcion, Paso[] pasos, Dificultad dificultad, int tiempoEjecucion) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.descripcion = descripcion;
        this.pasos = new ArrayList<Paso>();
        this.dificultad = dificultad;
        this.tiempoEjecucion = tiempoEjecucion;
        this.comentarios = new ArrayList<Comentario>();
        this.puntuaciones = new ArrayList<Integer>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Paso> getPasos() {
        return pasos;
    }

    public void addPaso(Paso paso){
        this.pasos.add(paso);
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public int getTiempoEjecucion() {
        return tiempoEjecucion;
    }

    public void setTiempoEjecucion(int tiempoEjecucion) {
        this.tiempoEjecucion = tiempoEjecucion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public void setPasos(List<Paso> pasos) {
        this.pasos = pasos;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void addComentario(Comentario comentario) {
        this.comentarios.add(comentario);
    }

    public int getMediaPuntuacion() {
        return mediaPuntuacion;
    }

    public void addPuntuacion(int puntuacion) {
        this.puntuaciones.add(puntuacion);
    }
}
