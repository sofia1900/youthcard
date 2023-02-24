package com.iesam.youthcard.domains.useCase;

import com.iesam.youthcard.domains.UsuarioRepository;
import com.iesam.youthcard.domains.models.Usuario;


public class GetUsuarioUseCase {
    private UsuarioRepository usuarioRepository;

    public GetUsuarioUseCase(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario execute(String nif) {
        return usuarioRepository.getUsuario(nif);
    }
}