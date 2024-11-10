package com.example.combosdinamicos;

import java.util.ArrayList;

public class DatosAlcaldias {

    private ArrayList<Alcaldia> listaAlcaldias;

    public DatosAlcaldias() {
        listaAlcaldias = new ArrayList<>();

        ArrayList<String> Selecciona = new ArrayList<>();
        Selecciona.add("Selecciona");

        // Crear las colonias para cada alcaldía
        ArrayList<String> coloniasMiguelHidalgo = new ArrayList<>();
        coloniasMiguelHidalgo.add("Selecciona");
        coloniasMiguelHidalgo.add("Polanco");
        coloniasMiguelHidalgo.add("Lomas de Chapultepec");
        coloniasMiguelHidalgo.add("Tacubaya");
        coloniasMiguelHidalgo.add("Anáhuac");
        coloniasMiguelHidalgo.add("San Miguel Chapultepec");
        coloniasMiguelHidalgo.add("Pensil");

        ArrayList<String> coloniasCuauhtemoc = new ArrayList<>();
        coloniasCuauhtemoc.add("Selecciona");
        coloniasCuauhtemoc.add("Centro");
        coloniasCuauhtemoc.add("Roma");
        coloniasCuauhtemoc.add("Condesa");
        coloniasCuauhtemoc.add("Doctores");
        coloniasCuauhtemoc.add("Santa María la Ribera");
        coloniasCuauhtemoc.add("Juárez");

        ArrayList<String> coloniasBenitoJuarez = new ArrayList<>();
        coloniasBenitoJuarez.add("Selecciona");
        coloniasBenitoJuarez.add("Del Valle");
        coloniasBenitoJuarez.add("Nápoles");
        coloniasBenitoJuarez.add("Narvarte");
        coloniasBenitoJuarez.add("Portales");
        coloniasBenitoJuarez.add("Santa Cruz Atoyac");
        coloniasBenitoJuarez.add("Mixcoac");

        ArrayList<String> coloniasCoyoacan = new ArrayList<>();
        coloniasCoyoacan.add("Selecciona");
        coloniasCoyoacan.add("Coyoacán Centro");
        coloniasCoyoacan.add("Villa de Cortés");
        coloniasCoyoacan.add("Del Carmen");
        coloniasCoyoacan.add("Pedregal de Santo Domingo");
        coloniasCoyoacan.add("Santa Catarina");
        coloniasCoyoacan.add("La Candelaria");

        ArrayList<String> coloniasIztapalapa = new ArrayList<>();
        coloniasIztapalapa.add("Selecciona");
        coloniasIztapalapa.add("Santa Cruz Meyehualco");
        coloniasIztapalapa.add("San Lorenzo Tezonco");
        coloniasIztapalapa.add("Los Ángeles");
        coloniasIztapalapa.add("Lomas Estrella");
        coloniasIztapalapa.add("El Vergel");
        coloniasIztapalapa.add("Culhuacán");

        // Crear los objetos Alcaldia y añadirlos a la lista
        listaAlcaldias.add(new Alcaldia("Selecciona", Selecciona));
        listaAlcaldias.add(new Alcaldia("Miguel Hidalgo", coloniasMiguelHidalgo));
        listaAlcaldias.add(new Alcaldia("Cuauhtémoc", coloniasCuauhtemoc));
        listaAlcaldias.add(new Alcaldia("Benito Juárez", coloniasBenitoJuarez));
        listaAlcaldias.add(new Alcaldia("Coyoacán", coloniasCoyoacan));
        listaAlcaldias.add(new Alcaldia("Iztapalapa", coloniasIztapalapa));
    }

    public ArrayList<Alcaldia> getListaAlcaldias() {
        return listaAlcaldias;
    }
}

