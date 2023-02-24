package com.iesam.youthcard.domains.useCase;

import com.iesam.youthcard.domains.CompraRepository;
import com.iesam.youthcard.domains.models.Compra;

public class AddCompraUseCase {
    private CompraRepository compraRepository;

    public AddCompraUseCase(CompraRepository compraRepository){
        this.compraRepository = compraRepository;
    }

    public void execute (Compra compra){
        compraRepository.addCompra(compra);
    }
}
