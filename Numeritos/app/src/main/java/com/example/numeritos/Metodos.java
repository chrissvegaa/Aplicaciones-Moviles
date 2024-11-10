package com.example.numeritos;

public class Metodos {

    String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
    String[] decenas = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
    String[] especiales = {"", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
    String[] centenas = {"", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};

    public String convertir(int numero) {
        if (numero == 0) {
            return "cero";
        }
        if (numero == 100) {
            return "cien";
        }

        return convertirMillar(numero);
    }

    private String convertirUnidad(int numero) {
        return unidades[numero];
    }

    private String convertirDecena(int numero) {
        if(numero == 10){
            return "diez";
        }
        else {
            if (numero < 10) {
                return convertirUnidad(numero);
            } else if (numero < 20) {
                return especiales[numero - 10];
            } else {
                //35
                int unidad = numero % 10; //-> 5
                String decenaStr = decenas[numero / 10];// 35/10 -> 3.5
                if (unidad == 0) {
                    return decenaStr; //En la posicion 3 esta treinta
                } else {
                    if (numero < 30 && numero > 20) {
                        return "veinti" + convertirUnidad(unidad);
                    } else {
                        return decenaStr + " y " + convertirUnidad(unidad); // treinta y cinco
                    }
                }
            }
        }
    }

    private String convertirCentena(int numero) {
        if (numero < 100) {
            return convertirDecena(numero);
        } else {
            // 755
            int decenasYUnidades = numero % 100;//55
            int ind = numero / 100;
            String centenaStr = centenas[ind]; //7.55 -> 7
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
            //2560
            int centenasRestantes = numero % 1000; //560
            int miles = numero / 1000; // 2
            String milesStr = miles == 1 ? "mil" : convertirCentena(miles) + " mil"; //2 mil

            if (miles == 100) {
                milesStr = "cien mil";
            }

            if (centenasRestantes == 0) {
                return milesStr;
            } else if(centenasRestantes == 121 || centenasRestantes == 221 || centenasRestantes == 321 || centenasRestantes == 421
            || centenasRestantes == 521 || centenasRestantes == 621 || centenasRestantes == 721 || centenasRestantes == 821 || centenasRestantes == 921){
                return milesStr;

            } else {
                return milesStr + " " + convertirCentena(centenasRestantes); // 2 mil 56
            }
        }
    }
}
