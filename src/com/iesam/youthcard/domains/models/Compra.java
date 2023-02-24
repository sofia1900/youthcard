package com.iesam.youthcard.domains.models;

import com.google.gson.Gson;
import com.iesam.youthcard.domains.PromocionRepository;

public class Compra {
    private String id;
    private String fechaCompra;
    private Usuario usuario;
    private Promocion promocion;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    @Override
    public String toString (){
        return new Gson().toJson(this);
    }
}
