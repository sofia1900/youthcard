package com.iesam.youthcard.presentation;

import com.iesam.youthcard.data.UsuarioDataRepository;
import com.iesam.youthcard.data.local.UsuarioFileLocalDataSource;
import com.iesam.youthcard.domains.models.Usuario;
import com.iesam.youthcard.domains.useCase.GetUsuarioUseCase;

import java.util.Scanner;

public class GetUsuarioForm {
    public Usuario getUsuario(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nif del usuario");
        String nif = scanner.nextLine();


        GetUsuarioUseCase getUsuarioUseCase = new GetUsuarioUseCase(new UsuarioDataRepository(UsuarioFileLocalDataSource.getInstance()));
        return getUsuarioUseCase.execute(nif);
    }
}
