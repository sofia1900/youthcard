package com.iesam.youthcard.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.youthcard.domains.models.Compra;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CompraFileLocalDataSource {
    private static CompraFileLocalDataSource instance = null;
    private CompraFileLocalDataSource(){};

    private String nameFile = "compras.txt";

    private Gson gson = new Gson();

    private final Type typeAlumnList = new TypeToken<ArrayList<Compra>>() {
    }.getType();

    //Metodo SAVE
    public void save(Compra compra) {
        List<Compra> compras = findAll();
        compras.add(compra);
        saveToFile(compras);
    }

    public void saveList(List<Compra> compras) {
        saveToFile(compras);
    }

    private void saveToFile(List<Compra> compras) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(compras));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }

    //METODO FIND_BY_ID
    public Compra findById(String id) {
        List<Compra> compras = findAll();
        for (Compra compra : compras) {
            if (Objects.equals(compra.getId(), id)) {
                return compra;
            }
        }
        return null;
    }

    //METODO FIND_ALL
    public List<Compra> findAll() {
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
        return new ArrayList<Compra>();
    }

    public static CompraFileLocalDataSource getInstance(){
        if (instance == null){
            instance = new CompraFileLocalDataSource();
        }

        return instance;
    }
}
