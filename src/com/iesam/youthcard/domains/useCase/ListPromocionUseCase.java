package com.iesam.youthcard.domains.useCase;

import com.iesam.youthcard.domains.PromocionRepository;
import com.iesam.youthcard.domains.models.Promocion;

import java.util.List;

public class ListPromocionUseCase {
    private PromocionRepository promocionRepository;
    public ListPromocionUseCase (PromocionRepository promocionRepository){
        this.promocionRepository = promocionRepository;
    }

    public List<Promocion> execute (){
        return promocionRepository.findAll();
    }
}
