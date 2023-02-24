package com.iesam.youthcard.domains;

import com.iesam.youthcard.domains.models.Empresa;

import java.util.List;

public interface EmpresaRepository {
    public void addEmpresa (Empresa empresa);
    public List<Empresa> listEmpresa();
}
