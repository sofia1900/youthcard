package com.iesam.youthcard.presentation;

import java.util.Scanner;

public class MenuView {
    public void init(){
        Scanner scanner = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Introduce la opcion deseada");
            System.out.println("1. Crear una empresa");
            System.out.println("2. Listar empresas");
            System.out.println("3. Crear un usuario");
            System.out.println("4. Listar usuarios");
            System.out.println("5. Crear una promocion");
            System.out.println("6. Listar promociones");
            System.out.println("7. Salir");
            opc = scanner.nextInt();

            switch (opc){
                case 1:
                    newEmpresa();
                    break;
                case 2:
                    listEmpresas();
                    break;
                case 3:
                    newUsuario();
                    break;
                case 4:
                    listUsuarios();
                    break;
                case 5:
                    newPromocion();
                    break;
                case 6:
                    listPromocion();
                    break;
            }
        } while (opc < 7);
    }

    public void newPromocion (){
        NewPromocionForm newPromocionForm = new NewPromocionForm();
        newPromocionForm.createNewPromocion();
    }

    public void listPromocion(){
        ListPromocionForm listPromocionForm = new ListPromocionForm();
        listPromocionForm.printListPromocion();
    }

    public void newEmpresa(){
        NewEmpresaForm newEmpresaForm = new NewEmpresaForm();
        newEmpresaForm.newEmpresa();
    }

    public void listEmpresas(){
        ListEmpresaForm listEmpresaForm = new ListEmpresaForm();
        listEmpresaForm.printEmpresas();
    }

    public void newUsuario(){
        NewUsuarioForm newUsuarioForm = new NewUsuarioForm();
        newUsuarioForm.createNewUsuario();
    }
    public void listUsuarios(){
        ListUsuarioForm listUsuarioForm = new ListUsuarioForm();
        listUsuarioForm.printListUsuario();
    }
}
