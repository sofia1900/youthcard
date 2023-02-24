package com.iesam.youthcard.data;

import com.iesam.youthcard.data.local.EmpresaFileLocalDataSource;
import com.iesam.youthcard.domains.EmpresaRepository;
import com.iesam.youthcard.domains.models.Empresa;

import java.util.List;

public class EmpresaDataRepository implements EmpresaRepository {

    private EmpresaFileLocalDataSource empresaFileLocalDataSource = EmpresaFileLocalDataSource.getInstance();

    public EmpresaDataRepository (EmpresaFileLocalDataSource  empresaFileLocalDataSource){
        this.empresaFileLocalDataSource = empresaFileLocalDataSource;
    }

    @Override
    public void addEmpresa(Empresa empresa) {
        empresaFileLocalDataSource.save(empresa);
    }

    @Override
    public List<Empresa> listEmpresa() {
        return empresaFileLocalDataSource.findAll();
    }
}
