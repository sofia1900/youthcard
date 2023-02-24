package com.iesam.youthcard.presentation;

import com.iesam.youthcard.data.UsuarioDataRepository;
import com.iesam.youthcard.data.local.UsuarioFileLocalDataSource;
import com.iesam.youthcard.domains.models.Usuario;
import com.iesam.youthcard.domains.useCase.GetUsuarioUseCase;

public class GetUsuarioForm {
    public Usuario getUsuario(String nif){
        GetUsuarioUseCase getUsuarioUseCase = new GetUsuarioUseCase(new UsuarioDataRepository(UsuarioFileLocalDataSource.getInstance()));
        return getUsuarioUseCase.execute(nif);
    }
}
