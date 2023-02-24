package com.iesam.youthcard.presentation;


import com.iesam.youthcard.data.PromocionDataRepository;
import com.iesam.youthcard.data.local.PromocionFileLocalDataSource;
import com.iesam.youthcard.domains.models.Promocion;
import com.iesam.youthcard.domains.useCase.GetPromocionUseCase;

import java.util.Scanner;

public class GetPromocionForm {
    public Promocion getPromocion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el id de la promacion");
        String id = scanner.nextLine();

        GetPromocionUseCase getPromocionUseCase = new GetPromocionUseCase(new PromocionDataRepository(PromocionFileLocalDataSource.getInstance()));
        return getPromocionUseCase.execute(id);
    }
}
