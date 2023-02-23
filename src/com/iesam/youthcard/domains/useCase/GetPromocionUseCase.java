package com.iesam.youthcard.domains.useCase;

import com.iesam.youthcard.domains.PromocionRepository;
import com.iesam.youthcard.domains.models.Promocion;

public class GetPromocionUseCase {

    private PromocionRepository promocionRepository;
    public GetPromocionUseCase (PromocionRepository promocionRepository){
        this.promocionRepository = promocionRepository;
    }

    public Promocion execute (String id){
        return promocionRepository.getById(id);
    }

}
