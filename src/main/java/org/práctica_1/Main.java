package org.práctica_1;
package estadistica;

import java.util.List;

public class Estadistica {

    public static double calcularMedia(List<Double> datos) {
        if (datos.isEmpty()) {
            throw new IllegalArgumentException("El conjunto de datos está vacío");
        }
        double suma = 0;
        for (double num : datos) {
            suma += num;
        }
        return suma / datos.size();
    }

    public class Main {
        public static void main(String[] args) {

            System.out.printf("Hello and welcome!");

            for (int i = 1; i <= 5; i++) {

                System.out.println("i = " + i);
            }
        }
    }

