package com.mycompany.lab1p2_joselobo;

import java.util.Scanner;

public class Sumatoria {

    public double EjecutarSumatoria() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese k: ");
        int k = leer.nextInt();
        double temp = 4 * Sumatoria(0, k);
        return temp;
    }//EjecutarSumatoria

    public double Sumatoria(int n, int k) {
        if (n == k) {
            return (Math.pow(-1, n)) / (2 * n + 1);
        } else {
            return (Math.pow(-1, n)) / (2 * n + 1) + Sumatoria(n + 1, k);
        }
    }//Sumatoria
}
