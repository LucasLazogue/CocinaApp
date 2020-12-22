package com.example.cocinaapp.Logica.controllers;

import com.example.cocinaapp.Logica.clases.Usuario;

import java.util.HashMap;
import java.util.Map;

public class ManejadorUsuarios {
    private static ManejadorUsuarios instance = null;
    private Map<String, Usuario> usuarios;

    public ManejadorUsuarios(){
        this.usuarios = new HashMap<String, Usuario>();
    }

    public static ManejadorUsuarios getInstance() {
        if (instance == null)
            instance = new ManejadorUsuarios();
        return instance;
    }

    public void addUsuario(Usuario usuario){
        this.usuarios.put(usuario.getNickname(), usuario);
    }

    public Usuario getUsuario(String nick){
        return this.usuarios.get(nick);
    }
}
