package com.itandegui.bufetabogados.models;

import java.util.ArrayList;

public class Usuarios {
    private int telefono;
    private String nombre;
    private int clave;
    private String tipoUsuario;
    ArrayList<Pasante> pasantes = new ArrayList();
    ArrayList<Abogado> abogados = new ArrayList();

    public Usuarios(int telefono, String nombre, int clave, String tipoUsuario) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.clave = clave;
        this.tipoUsuario = tipoUsuario;
    }



    public int getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getClave() {
        return clave;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public ArrayList<Pasante> getPasantes() {
        return pasantes;
    }

    public ArrayList<Abogado> getAbogados() {
        return abogados;
    }

}