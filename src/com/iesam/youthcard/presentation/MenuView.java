package com.iesam.youthcard.presentation;

import java.util.Scanner;

public class MenuView {
    public void init(){
        Scanner scanner = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Introduce la opcion deseada");
            System.out.println("1. Crear una promocion");
            System.out.println("2. Listar promociones");
            System.out.println("3. Salir");
            opc = scanner.nextInt();

            switch (opc){
                case 1:
                    newPromocion();
                    break;
                case 2:
                    listPromocion();
                    break;
            }
        } while (opc < 3);
    }

    public void newPromocion (){
        NewPromocionForm newPromocionForm = new NewPromocionForm();
        newPromocionForm.createNewPromocion();
    }

    public void listPromocion(){
        ListPromocionForm listPromocionForm = new ListPromocionForm();
        listPromocionForm.printListPromocion();
    }

}
