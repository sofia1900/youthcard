package com.iesam.youthcard.data;

import com.iesam.youthcard.data.local.CompraFileLocalDataSource;
import com.iesam.youthcard.domains.CompraRepository;
import com.iesam.youthcard.domains.models.Compra;

import java.util.List;

public class CompraDataRepository implements CompraRepository {

    private CompraFileLocalDataSource compraFileLocalDataSource = CompraFileLocalDataSource.getInstance();
    public CompraDataRepository (CompraFileLocalDataSource compraFileLocalDataSource){
        this.compraFileLocalDataSource = compraFileLocalDataSource;
    }
    @Override
    public void addCompra(Compra compra) {
        compraFileLocalDataSource.save(compra);
    }

    @Override
    public List<Compra> listCompra() {
        return compraFileLocalDataSource.findAll();
    }
}
