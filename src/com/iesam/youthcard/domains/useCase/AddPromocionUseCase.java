package com.iesam.youthcard.domains.useCase;

import com.iesam.youthcard.domains.PromocionRepository;
import com.iesam.youthcard.domains.models.Promocion;

public class AddPromocionUseCase {
    private PromocionRepository promocionRepository;
    public AddPromocionUseCase (PromocionRepository promocionRepository){
        this.promocionRepository = promocionRepository;
    }

    public void execute (Promocion promocion){
        promocionRepository.add(promocion);
    }

}
