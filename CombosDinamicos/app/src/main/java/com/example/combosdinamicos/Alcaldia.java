package com.example.combosdinamicos;

import java.util.ArrayList;

public class Alcaldia {

    private String nombre;
    private ArrayList<String> colonias;

    public Alcaldia(String nombre, ArrayList<String> colonias) {
        this.nombre = nombre;
        this.colonias = colonias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getColonias() {
        return colonias;
    }

    public void setColonias(ArrayList<String> colonias) {
        this.colonias = colonias;
    }
}
