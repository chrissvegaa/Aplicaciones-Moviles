package com.example.myapplication;

import java.util.ArrayList;

public class Numeritos {

    ArrayList<String> operaciones;
    protected double numero1;
    protected double numero2;

    public Numeritos(){
        operaciones = new ArrayList<String>();
        operacion();
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void operacion(){
        operaciones.add("Suma");
        operaciones.add("Resta");
        operaciones.add("Multiplicación");
        operaciones.add("División");
    }

    public ArrayList<String> getOperacion() {
        return operaciones;
    }

    public double sumita(int numero1, int numero2){
        return numero1+numero2;
    }
    public double restita(int numero1, int numero2){
        return numero1-numero2;
    }
    public double multiplicacionsita(int numero1, int numero2){
        return numero1*numero2;
    }
    public double divisionsita(int numero1, int numero2){
        return numero1/numero2;
    }
}
