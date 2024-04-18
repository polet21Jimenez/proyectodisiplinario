package com.itandegui.bufetabogados.models;

import java.util.ArrayList;
import java.util.Locale;

public class Casos {
    private String nombrecaso;
    private String tipocaso;
    private String nombreabogado;
    private String informacion;
    ArrayList<Casos> casos = new ArrayList();

    public Casos(String nombreCaso, String tipoCaso, String nombreAbogado, String informacion) {
        this.nombrecaso = nombreCaso;
        this.tipocaso = tipoCaso;
        this.nombreabogado = nombreAbogado;
        this.informacion = informacion;
    }


    public String getNombrecaso() {
        return nombrecaso;
    }

    public String getTipocaso() {
        return tipocaso;
    }

    public String getNombreabogado() {
        return nombreabogado;
    }

    public String getInformacion() {
        return informacion;
    }

    public ArrayList<Casos> getCasos() {
        return casos;
    }

    public Locale stream() {
    return stream();}

    public void add(Casos caso) {
        caso.add(caso);
    }
    public static Usuarios getUsuarios() {
        return getUsuarios();
    }
}