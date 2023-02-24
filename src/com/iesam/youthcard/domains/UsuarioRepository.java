package com.iesam.youthcard.domains;

import com.iesam.youthcard.domains.models.Usuario;

import java.util.List;

public interface UsuarioRepository {
    public void addUsuario (Usuario usuario);
    public List<Usuario> listUsuario ();
    public Usuario getUsuario (String nif);
}
