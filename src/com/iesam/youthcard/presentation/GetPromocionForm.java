package com.iesam.youthcard.presentation;


import com.iesam.youthcard.data.PromocionDataRepository;
import com.iesam.youthcard.data.local.PromocionFileLocalDataSource;
import com.iesam.youthcard.domains.models.Promocion;
import com.iesam.youthcard.domains.useCase.GetPromocionUseCase;

public class GetPromocionForm {
    public Promocion getPromocion(String id){
        GetPromocionUseCase getPromocionUseCase = new GetPromocionUseCase(new PromocionDataRepository(PromocionFileLocalDataSource.getInstance()));
        return getPromocionUseCase.execute(id);
    }
}
