package com.iesam.youthcard.presentation;


import com.iesam.youthcard.data.UsuarioDataRepository;
import com.iesam.youthcard.data.local.UsuarioFileLocalDataSource;
import com.iesam.youthcard.domains.models.Usuario;
import com.iesam.youthcard.domains.useCase.AddUsuarioUseCase;

import java.util.Scanner;

public class NewUsuarioForm {
    public void createNewUsuario (){
        Usuario usuario = usuarioForm();
        saveUsuario(usuario);
    }

    public Usuario usuarioForm (){
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("Introduce el nif:");
        usuario.setNif(scanner.nextLine());
        System.out.println("Introduce el nombre:");
        usuario.setNombre(scanner.nextLine());
        System.out.println("Introduce los apellidos:");
        usuario.setApellidos(scanner.nextLine());
        System.out.println("Introduce la direccion:");
        usuario.setDireccion(scanner.nextLine());

        return usuario;
    }

    public void saveUsuario (Usuario usuario){
        AddUsuarioUseCase addUsuarioUseCase = new AddUsuarioUseCase(new UsuarioDataRepository(UsuarioFileLocalDataSource.getInstance()));
        addUsuarioUseCase.execute(usuario);
    }
}
