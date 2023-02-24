package com.iesam.youthcard.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.youthcard.domains.models.Promocion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PromocionFileLocalDataSource {
    private static PromocionFileLocalDataSource instance = null;

    private PromocionFileLocalDataSource() {}

    private String nameFile = "promociones.txt";

    private Gson gson = new Gson();

    private final Type typeAlumnList = new TypeToken<ArrayList<Promocion>>() {
    }.getType();

    //Metodo SAVE
    public void save(Promocion promocion) {
        List<Promocion> promociones = findAll();
        promociones.add(promocion);
        saveToFile(promociones);
    }

    public void saveList(List<Promocion> promociones) {
        saveToFile(promociones);
    }

    private void saveToFile(List<Promocion> promociones) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(promociones));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }

    //METODO FIND_BY_ID
    public Promocion findById(String id) {
        List<Promocion> promociones = findAll();
        for (Promocion promocion : promociones) {
            if (Objects.equals(promocion.getId(), id)) {
                return promocion;
            }
        }
        return null;
    }

    //METODO FIND_ALL
    public List<Promocion> findAll() {
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
        return new ArrayList<Promocion>();
    }


    public static PromocionFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new PromocionFileLocalDataSource();
        }
        return instance;
    }
}
