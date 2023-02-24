package com.iesam.youthcard.presentation;

import com.iesam.youthcard.data.EmpresaDataRepository;
import com.iesam.youthcard.data.local.EmpresaFileLocalDataSource;
import com.iesam.youthcard.domains.models.Empresa;
import com.iesam.youthcard.domains.useCase.ListEmpresaUseCase;

import java.util.List;

public class ListEmpresaForm {
    public void printEmpresas (){
        List<Empresa> empresas = listEmpresas();
        for (Empresa empresa : empresas){
            System.out.println(empresa);
        }
    }

    public List<Empresa> listEmpresas (){
        ListEmpresaUseCase listEmpresaUseCase = new ListEmpresaUseCase(new EmpresaDataRepository(EmpresaFileLocalDataSource.getInstance()));
        return listEmpresaUseCase.execute();
    }
}
