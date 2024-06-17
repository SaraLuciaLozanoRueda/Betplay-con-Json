package com.example.refactor2.data;

import com.example.refactor2.equipos.Equipos;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Core {
    public static final String File = "liga.json";
    public List<Equipos> equipos;
    public Gson gson;

    public Core() {
        gson = new GsonBuilder().setPrettyPrinting().create();
        equipos = upload();
    }

    public List<Equipos> upload() {
        try (Reader reader = new FileReader(File)) {
            Type listType = new TypeToken<ArrayList<Equipos>>() {
            }.getType();
            return gson.fromJson(reader, listType);
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void saveEquipos() {
        try (Writer writer = new FileWriter(File)) {
            gson.toJson(equipos, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void create(Equipos nombreEquipo) {
        equipos.add(nombreEquipo);
        saveEquipos();
    }

    public void update(Equipos equipoActualizado) {
        List<Equipos> equiposFromJson = upload();

        for (int i = 0; i < equiposFromJson.size(); i++) {
            Equipos equipo = equiposFromJson.get(i);
            if (equipo.getNombreEquipo().equals(equipoActualizado.getNombreEquipo())) {
                equiposFromJson.set(i, equipoActualizado);
                try (Writer writer = new FileWriter(File)) {
                    gson.toJson(equiposFromJson, writer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return;
            }
        }
        System.out.println("No se encontró el equipo para actualizar: " + equipoActualizado.getNombreEquipo());
    }

    public List<Equipos> getEquipos() {
        return equipos;
    }

}
