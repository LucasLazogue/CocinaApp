package com.example.cocinaapp.Logica.clases;

public class Comentario {
    private String comentario;
    private int puntuacion;

    public Comentario(String comentario) {
        this.comentario = comentario;
    }

    public Comentario(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Comentario(String comentario, int puntuacion) {
        this.comentario = comentario;
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
