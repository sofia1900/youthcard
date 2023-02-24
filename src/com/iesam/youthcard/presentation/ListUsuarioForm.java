package com.iesam.youthcard.presentation;

import com.iesam.youthcard.data.UsuarioDataRepository;
import com.iesam.youthcard.data.local.UsuarioFileLocalDataSource;
import com.iesam.youthcard.domains.models.Usuario;
import com.iesam.youthcard.domains.useCase.ListUsuarioUseCase;

import java.util.List;

public class ListUsuarioForm {
    public void printListUsuario (){
        List<Usuario> usuarios = listUsuario();
        for (Usuario usuario : usuarios){
            System.out.println(usuarios);
        }
    }

    public List<Usuario> listUsuario (){
        ListUsuarioUseCase listUsuarioUseCase = new ListUsuarioUseCase (new UsuarioDataRepository(UsuarioFileLocalDataSource.getInstance()));
        return listUsuarioUseCase.execute();
    }
}
