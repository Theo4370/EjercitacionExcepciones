package com.company;

import java.util.ArrayList;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        // Ejercicio 1
        try {
            Integer unNumero = null;
            Integer suma;
            suma = unNumero + 5;
            System.out.printf("" + suma);


        } catch (Exception e) {
            System.out.println("Aca paso algo, EJ1");
            e.printStackTrace();
        }

        //Ejercicio 2
        try {
            ArrayList<String> listaAnimales = new ArrayList<>();
            listaAnimales.add(1, "Pato");
            listaAnimales.add(2, "Perro");
            listaAnimales.add(3, "Gato");

            System.out.printf(listaAnimales.get(3));

        } catch (Exception e) {
            System.out.println("Acá pasó otra cosa, Ej2");
            e.printStackTrace();
        }

        //Ejercicio 3
        try {
            ArrayList<String> listaAnimales = null;
            listaAnimales.add(1, "Pato");
            listaAnimales.add(2, "Perro");
            listaAnimales.add(3, "Gato");

            System.out.printf(listaAnimales.get(2));

        } catch (Exception e) {
            System.out.println("Acá pasó otra cosa, Ej3");
            e.printStackTrace();
        }


    }
}
