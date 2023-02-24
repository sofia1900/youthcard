package com.iesam.youthcard.data;

import com.iesam.youthcard.data.local.UsuarioFileLocalDataSource;
import com.iesam.youthcard.domains.UsuarioRepository;
import com.iesam.youthcard.domains.models.Usuario;

import java.util.List;

public class UsuarioDataRepository implements UsuarioRepository {
    private UsuarioFileLocalDataSource usuarioFileLocalDataSource = UsuarioFileLocalDataSource.getInstance();

    public UsuarioDataRepository (UsuarioFileLocalDataSource usuarioFileLocalDataSource){
        this.usuarioFileLocalDataSource = usuarioFileLocalDataSource;
    }

    @Override
    public void addUsuario(Usuario usuario) {
        usuarioFileLocalDataSource.save(usuario);
    }

    @Override
    public List<Usuario> listUsuario() {
        return usuarioFileLocalDataSource.findAll();
    }

    @Override
    public Usuario getUsuario(String nif) {
        return usuarioFileLocalDataSource.findById(nif);
    }
}
