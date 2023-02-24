package com.iesam.youthcard.domains.useCase;

import com.iesam.youthcard.domains.UsuarioRepository;
import com.iesam.youthcard.domains.models.Usuario;

import java.util.List;

public class ListUsuarioUseCase {

    private UsuarioRepository usuarioRepository;
    public ListUsuarioUseCase (UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> execute (){
        return usuarioRepository.listUsuario();
    }
}
