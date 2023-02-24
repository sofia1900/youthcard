package com.iesam.youthcard.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.youthcard.domains.models.Usuario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class UsuarioFileLocalDataSource {
    private static UsuarioFileLocalDataSource instance = null;
    private UsuarioFileLocalDataSource(){};

    private String nameFile = "usuarios.txt";

    private Gson gson = new Gson();

    private final Type typeAlumnList = new TypeToken<ArrayList<Usuario>>() {
    }.getType();

    //Metodo SAVE
    public void save(Usuario usuario) {
        List<Usuario> usuarios = findAll();
        usuarios.add(usuario);
        saveToFile(usuarios);
    }

    public void saveList(List<Usuario> usuarios) {
        saveToFile(usuarios);
    }

    private void saveToFile(List<Usuario> usuarios) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(usuarios));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }

    //METODO FIND_BY_ID
    public Usuario findById(String id) {
        List<Usuario> usuarios = findAll();
        for (Usuario usuario : usuarios) {
            if (Objects.equals(usuario.getNif(), id)) {
                return usuario;
            }
        }
        return null;
    }

    //METODO FIND_ALL
    public List<Usuario> findAll() {
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
        return new ArrayList<Usuario>();
    }



    public static UsuarioFileLocalDataSource getInstance(){
        if (instance == null){
            instance = new UsuarioFileLocalDataSource();
        }

        return instance;
    }
}
