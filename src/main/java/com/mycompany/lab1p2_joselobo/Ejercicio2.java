package com.mycompany.lab1p2_joselobo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio2 {

    public Scanner leer = new Scanner(System.in);

    public void EjecutarEjercicio() throws ParseException {
        System.out.println("Ingrese su String");
        String ingresado = leer.next();
        String[] CadenaIngresado = ingresado.split(",");

        Date Fecha;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < CadenaIngresado.length; i++) {
            test(CadenaIngresado[i]);
        }
    }//ejecutarEjercicio

    public void test(String Cadena) throws ParseException {
        Date Fecha;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Fecha = df.parse(Cadena);

        String[] test = Cadena.split("/");
        System.out.println(Fecha);

    }
}//ejercicio 2
