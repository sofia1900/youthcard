package com.iesam.youthcard.presentation;
import com.iesam.youthcard.data.CompraDataRepository;
import com.iesam.youthcard.data.local.CompraFileLocalDataSource;
import com.iesam.youthcard.domains.models.Compra;
import com.iesam.youthcard.domains.models.Promocion;
import com.iesam.youthcard.domains.models.Usuario;
import com.iesam.youthcard.domains.useCase.AddCompraUseCase;


import java.util.Scanner;

public class NewCompraForm {

    public void addNewCompra (){
        Compra compra = newCompra();
        saveNewCompra(compra);
    }

    public void saveNewCompra (Compra compra){
        AddCompraUseCase addCompraUseCase = new AddCompraUseCase(new CompraDataRepository(CompraFileLocalDataSource.getInstance()));
        addCompraUseCase.execute(compra);
    }
    public Compra newCompra (){
        Scanner scanner = new Scanner(System.in);
        Compra compra = new Compra();

        System.out.println("Introduce el id");
        compra.setId(scanner.nextLine());
        System.out.println("Introduce la fecha de la compra");
        compra.setFechaCompra(scanner.nextLine());
        compra.setUsuario(getUserByNif());;
        compra.setPromocion(getPromocionById());

        return compra;
    }

    public Usuario getUserByNif (){
        GetUsuarioForm getUsuarioForm = new GetUsuarioForm();
        return getUsuarioForm.getUsuario();
    }

    public Promocion getPromocionById (){
        GetPromocionForm getPromocionForm = new GetPromocionForm();
        return getPromocionForm.getPromocion();
    }

}
