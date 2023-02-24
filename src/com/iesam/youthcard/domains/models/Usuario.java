package com.iesam.youthcard.domains.models;

import com.google.gson.Gson;

public class Usuario {
    private String nif;
    private String nombre;
    private String apellidos;
    private String direccion;

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString (){
        return new Gson().toJson(this);
    }
}
