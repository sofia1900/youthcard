package com.iesam.youthcard.domains.models;

import com.google.gson.Gson;

public class Empresa {
    private String id;
    private String nombre;
    private String cif;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    @Override
    public String toString (){
        return new Gson().toJson(this);
    }
}
