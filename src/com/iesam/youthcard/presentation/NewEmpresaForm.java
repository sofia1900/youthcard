package com.iesam.youthcard.presentation;

import com.iesam.youthcard.data.EmpresaDataRepository;
import com.iesam.youthcard.data.local.EmpresaFileLocalDataSource;
import com.iesam.youthcard.domains.models.Empresa;
import com.iesam.youthcard.domains.useCase.AddEmpresaUseCase;

import java.util.Scanner;

public class NewEmpresaForm {

    public void newEmpresa (){
        Empresa empresa = createNewEmpresa();
        saveEmpresa(empresa);
    }

    public Empresa createNewEmpresa (){
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el id");
        empresa.setId(scanner.nextLine());
        System.out.println("Introduce el nombre");
        empresa.setNombre(scanner.nextLine());
        System.out.println("Introduce el cif");
        empresa.setCif(scanner.nextLine());

        return empresa;
    }
    public void saveEmpresa(Empresa empresa){
        AddEmpresaUseCase addEmpresaUseCase = new AddEmpresaUseCase(new EmpresaDataRepository(EmpresaFileLocalDataSource.getInstance()));
        addEmpresaUseCase.execute(empresa);
    }
}
