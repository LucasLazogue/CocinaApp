package com.example.cocinaapp.Logica.clases;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Usuario {
    private String nickname;
    private String password;
    private String email;
    private String nombre;
    private Calendar fechaRegistro;
    private Calendar fechaNacimiento;
    private List<Receta> recetas;

    public Usuario(String nickname, String password, String email, Calendar fechaRegistro) {
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.fechaRegistro = fechaRegistro;
        this.recetas = new ArrayList<Receta>();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Receta> getRecetas() {
        return recetas;
    }

    public void addReceta(Receta receta) {
        this.recetas.add(receta);
    }
}
