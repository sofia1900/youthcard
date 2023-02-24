package com.iesam.youthcard.domains.useCase;

import com.iesam.youthcard.domains.EmpresaRepository;
import com.iesam.youthcard.domains.models.Empresa;

public class AddEmpresaUseCase {
    private EmpresaRepository empresaRepository;
    public AddEmpresaUseCase (EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    public void execute (Empresa empresa){
        empresaRepository.addEmpresa(empresa);
    }
}
