package com.iesam.youthcard.domains;

import com.iesam.youthcard.domains.models.Compra;

import java.util.List;

public interface CompraRepository {
    public void addCompra (Compra compra);
    public List<Compra> listCompra ();
}
