package com.iesam.youthcard.presentation;

import com.iesam.youthcard.data.PromocionDataRepository;
import com.iesam.youthcard.data.local.PromocionFileLocalDataSource;
import com.iesam.youthcard.domains.models.Promocion;
import com.iesam.youthcard.domains.useCase.ListPromocionUseCase;

import java.util.List;

public class ListPromocionForm {
    public void printListPromocion (){
        List<Promocion> promociones = listPromocion();
        for (Promocion promocion : promociones){
            System.out.println(promocion);
        }
    }

    public List<Promocion> listPromocion (){
        ListPromocionUseCase listPromocionForm = new ListPromocionUseCase (new PromocionDataRepository(PromocionFileLocalDataSource.getInstance()));
        return listPromocionForm.execute();
    }
}
