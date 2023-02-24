package com.iesam.youthcard.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.youthcard.domains.models.Empresa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EmpresaFileLocalDataSource {
    private static EmpresaFileLocalDataSource instance = null;
    private EmpresaFileLocalDataSource(){};

    private String nameFile = "empresas.txt";

    private Gson gson = new Gson();

    private final Type typeAlumnList = new TypeToken<ArrayList<Empresa>>() {
    }.getType();

    //Metodo SAVE
    public void save(Empresa empresa) {
        List<Empresa> empresas = findAll();
        empresas.add(empresa);
        saveToFile(empresas);
    }

    public void saveList(List<Empresa> empresas) {
        saveToFile(empresas);
    }

    private void saveToFile(List<Empresa> empresas) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(empresas));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }

    //METODO FIND_BY_ID
    public Empresa findById(String id) {
        List<Empresa> empresas = findAll();
        for (Empresa empresa : empresas) {
            if (Objects.equals(empresa.getId(), id)) {
                return empresa;
            }
        }
        return null;
    }

    //METODO FIND_ALL
    public List<Empresa> findAll() {
        try {
            File myObj = new File(nameFile);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeAlumnList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        }
        return new ArrayList<Empresa>();
    }

    public static EmpresaFileLocalDataSource getInstance(){
        if (instance == null){
            instance = new EmpresaFileLocalDataSource();
        }

        return instance;
    }
}
