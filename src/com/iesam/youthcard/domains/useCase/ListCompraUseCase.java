package com.iesam.youthcard.domains.useCase;

import com.iesam.youthcard.domains.CompraRepository;
import com.iesam.youthcard.domains.models.Compra;

import java.util.List;

public class ListCompraUseCase {
    private CompraRepository compraRepository;

    public ListCompraUseCase(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    public List<Compra> execute() {
        return compraRepository.listCompra();
    }
}