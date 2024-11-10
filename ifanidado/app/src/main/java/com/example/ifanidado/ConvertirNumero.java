package com.example.ifanidado;

public class ConvertirNumero {

    public String convertir(int number) {
        if (number > 0) {
            if (number == 1) {
                return "Uno";
            } else if (number == 2) {
                if (number > 1) {
                    return "Dos";
                }
            } else if (number == 3) {
                if (number > 2) {
                    return "Tres";
                }
            } else if (number == 4) {
                if (number > 3) {
                    return "Cuatro";
                }
            } else if (number == 5) {
                if (number > 4) {
                    return "Cinco";
                }
            } else if (number == 6) {
                if (number > 5) {
                    return "Seis";
                }
            } else if (number == 7) {
                if (number > 6) {
                    return "Siete";
                }
            } else if (number == 8) {
                if (number > 7) {
                    return "Ocho";
                }
            } else if (number == 9) {
                if (number > 8) {
                    return "Nueve";
                }
            } else if (number == 10) {
                if (number > 9) {
                    return "Diez";
                }
            } else if (number == 11) {
                if (number > 10) {
                    return "Once";
                }
            } else if (number == 12) {
                if (number > 11) {
                    return "Doce";
                }
            } else if (number == 13) {
                if (number > 12) {
                    return "Trece";
                }
            } else if (number == 14) {
                if (number > 13) {
                    return "Catorce";
                }
            } else if (number == 15) {
                if (number > 14) {
                    return "Quince";
                }
            } else {
                return "Número fuera de rango";
            }
        } else {
            return "Número no válido";
        }
        return "Número fuera de rango. Ingresa un número entre 1 y 15.";
    }
}
