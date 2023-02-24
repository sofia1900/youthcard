package com.iesam.youthcard.data;

import com.iesam.youthcard.data.local.PromocionFileLocalDataSource;
import com.iesam.youthcard.domains.PromocionRepository;
import com.iesam.youthcard.domains.models.Promocion;

import java.util.List;

public class PromocionDataRepository implements PromocionRepository {
    private PromocionFileLocalDataSource fileLocalDataSource = PromocionFileLocalDataSource.getInstance();
    public PromocionDataRepository (PromocionFileLocalDataSource fileLocalDataSource){
        this.fileLocalDataSource = fileLocalDataSource;
    }

    @Override
    public void add(Promocion promocion) {
        fileLocalDataSource.save(promocion);
    }

    @Override
    public Promocion getById(String id) {
        return fileLocalDataSource.findById(id);
    }

    @Override
    public List<Promocion> findAll() {
        return fileLocalDataSource.findAll();
    }
}
