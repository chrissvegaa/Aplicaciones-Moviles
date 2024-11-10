package com.example.numeritos;

public class Metodos {

    String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
    String[] decenas = {"diez", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
    String[] especiales = {"", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
    String[] centenas = {"", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};

    public String convertir(int numero) {
        if (numero == 0) {
            return "cero";
        } else
            if (numero == 10) {
                return "diez";
        } else
            if (numero == 100) {
                return "cien";
        } else
            if (numero == 10000) {
                return "diez mil";
        } else {
            return convertirMillar(numero);
        }
    }

    private String convertirUnidad(int numero) {
        return unidades[numero];
    }

    private String convertirDecena(int numero) {
        if (numero < 10)
            return convertirUnidad(numero);
         else
            if (numero == 10)
                return "diez";
            else
                if (numero < 20)
                    return especiales[numero - 10];
                else
                    if (numero == 20)
                        return "veinte";
                     else
                        if (numero < 30) {
                            return "veinti" + convertirUnidad(numero % 10);
                        } else {
                            int unidad = numero % 10;
                            String decenaStr = decenas[numero / 10];

                            if (unidad == 0) {
                                return decenaStr;

                            } else {
                                return decenaStr + " y " + convertirUnidad(unidad);
                            }
                        }
    }

    private String convertirCentena(int numero) {
        if (numero < 100) {
            return convertirDecena(numero);

        } else
            if (numero == 100) {
                return "cien";
            } else {
                int decenasYUnidades = numero % 100;
                int indiceCentena = numero / 100;
                String centenaStr = centenas[indiceCentena];

                if (decenasYUnidades == 0) {
                    return centenaStr;

                } else {
                    return centenaStr + " " + convertirDecena(decenasYUnidades);
                }
        }
    }

    private String convertirMillar(int numero) {
        if (numero < 1000) {
            return convertirCentena(numero);

        } else {
            int centenasRestantes = numero % 1000; //253
            int miles = numero / 1000; //3.253 -> 3
            String milesStr;

            if (miles == 10) {
                milesStr = "diez mil";

            } else
                if (miles % 10 == 0) { //120000 -> 120 /10 -> 12 - 0
                    milesStr = convertirCentena(miles) + " mil";
                } else
                    if (miles % 10 == 1 && miles > 20) { //141563 -> 141 -> 14.1 - 1
                        milesStr = convertirCentena(miles).replace("uno", "un") + " mil";

                    }
                    else
                        milesStr = (miles == 1 ? "mil" : convertirCentena(miles) + " mil");

            if (centenasRestantes == 0) {
                return milesStr;

            } else {
                return milesStr + " " + convertirCentena(centenasRestantes);
            }
        }
    }
}
