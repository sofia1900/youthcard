package com.iesam.youthcard.presentation;

import com.iesam.youthcard.data.CompraDataRepository;
import com.iesam.youthcard.data.local.CompraFileLocalDataSource;
import com.iesam.youthcard.domains.models.Compra;
import com.iesam.youthcard.domains.useCase.ListCompraUseCase;

import java.util.List;

public class ListCompraForm {
    public void printCompra(){
        List<Compra> compras = listCompras();
        for (Compra compra : compras){
            System.out.println(compra);
        }
    }

    public List<Compra> listCompras(){
        ListCompraUseCase listCompraUseCase = new ListCompraUseCase(new CompraDataRepository(CompraFileLocalDataSource.getInstance()));
        return listCompraUseCase.execute();
    }
}
