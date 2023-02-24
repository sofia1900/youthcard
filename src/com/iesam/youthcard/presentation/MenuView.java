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
            System.out.println("3. Crear una promocion");
            System.out.println("4. Listar promociones");
            System.out.println("5. Salir");
            opc = scanner.nextInt();

            switch (opc){
                case 1:
                    newEmpresa();
                    break;
                case 2:
                    listEmpresas();
                    break;
                case 3:
                    newPromocion();
                    break;
                case 4:
                    listPromocion();
                    break;
            }
        } while (opc < 5);
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

}
