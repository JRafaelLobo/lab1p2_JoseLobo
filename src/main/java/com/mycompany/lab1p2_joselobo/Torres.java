package com.mycompany.lab1p2_joselobo;

import java.util.Scanner;

public class Torres {
    public int pasos;

    public void EjecutarTorres() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese n");
        int n = leer.nextInt();
        pasos=0;
        honoi(n, 1, 2, 3);
    }

    public void honoi(int n, int origen, int auxiliar, int destino) {
        if (n == 1) {
            pasos++;
            System.out.println(pasos+". mover disco " + n + " de " + origen + " a " + destino);
            return;
        } else {
            honoi(n - 1, origen, destino, auxiliar);
        }//else
        pasos++;
        System.out.println(pasos+". mover disco " + n + " de " + origen + " a " + destino);
        honoi(n - 1, auxiliar, origen, destino);
    }//honoi
}//torres
