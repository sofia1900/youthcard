package com.iesam.youthcard.presentation;

import com.iesam.youthcard.data.PromocionDataRepository;
import com.iesam.youthcard.data.local.PromocionFileLocalDataSource;
import com.iesam.youthcard.domains.models.Promocion;
import com.iesam.youthcard.domains.useCase.AddPromocionUseCase;

import java.util.Scanner;

public class NewPromocionForm {

    public void createNewPromocion (){
        Promocion promocion = promocionForm();
        savePromocion(promocion);
    }

    public Promocion promocionForm (){
        Scanner scanner = new Scanner(System.in);
        Promocion promocion = new Promocion();

        System.out.println("Introduce el id:");
        promocion.setId(scanner.nextLine());
        System.out.println("Introduce el titulo:");
        promocion.setTitulo(scanner.nextLine());
        System.out.println("Introduce la descripcion:");
        promocion.setDescripcion(scanner.nextLine());
        System.out.println("Introduce el descuento:");
        promocion.setDescuento(scanner.nextInt());

        return promocion;
    }

    public void savePromocion (Promocion promocion){
        AddPromocionUseCase addPromocionUseCase = new AddPromocionUseCase(new PromocionDataRepository(PromocionFileLocalDataSource.getInstance()));
        addPromocionUseCase.execute(promocion);
    }
}
