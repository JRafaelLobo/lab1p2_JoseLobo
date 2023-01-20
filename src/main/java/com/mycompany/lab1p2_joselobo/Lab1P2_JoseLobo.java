package com.mycompany.lab1p2_joselobo;

import java.text.ParseException;
import java.util.Scanner;

public class Lab1P2_JoseLobo {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        int opcion;
        do {
            opcion = Menu();
            switch (opcion) {
                case 1 -> {
                    Torres T = new Torres();
                    T.EjecutarTorres();
                }//case 1
                case 2 -> {
                    Ejercicio2 E = new Ejercicio2();
                    E.EjecutarEjercicio();
                }//case 2
                case 3 -> {
                    Sumatoria S = new Sumatoria();
                    System.out.println(S.EjecutarSumatoria());
                }//case 3
                case 4 -> {
                    System.out.println("Saliendo..");
                }//case 4
                default -> {
                    System.out.println("Opcion Invalida");
                }//default
            }//opcion
        } while (opcion != 4);
    }//main

    public static int Menu() {
        System.out.println("Menu");
        System.out.println("--------------------------");
        System.out.println("1-->Torres de Hanói");
        System.out.println("2-->Ejercicio 2");
        System.out.println("3-->Sumatoria");
        System.out.println("4-->Salir");
        System.out.println("--------------------------");
        System.out.println("Ingrese la opcion: ");
        int opcion = leer.nextInt();
        return opcion;
    }//Menu
}//class
