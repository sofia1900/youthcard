package com.iesam.youthcard.domains.useCase;

import com.iesam.youthcard.domains.EmpresaRepository;
import com.iesam.youthcard.domains.models.Empresa;

import java.util.List;

public class ListEmpresaUseCase {
    private EmpresaRepository empresaRepository;
    public ListEmpresaUseCase (EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    public List<Empresa> execute (){
        return empresaRepository.listEmpresa();
    }
}
