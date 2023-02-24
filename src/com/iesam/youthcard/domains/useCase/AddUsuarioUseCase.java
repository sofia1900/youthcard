package com.iesam.youthcard.domains.useCase;

import com.iesam.youthcard.domains.UsuarioRepository;
import com.iesam.youthcard.domains.models.Usuario;

public class AddUsuarioUseCase {
    private UsuarioRepository usuarioRepository;
    public AddUsuarioUseCase (UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public void execute (Usuario usuario){
        usuarioRepository.addUsuario(usuario);
    }
}
