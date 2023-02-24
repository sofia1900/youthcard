package com.iesam.youthcard.domains;

import com.iesam.youthcard.domains.models.Promocion;

import java.util.List;

public interface PromocionRepository {
    public void add (Promocion promocion);
    public Promocion getById (String id);
    public List<Promocion> findAll ();
}
