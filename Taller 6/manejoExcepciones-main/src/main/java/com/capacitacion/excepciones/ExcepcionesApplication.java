package com.capacitacion.excepciones;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.OverlappingFileLockException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import com.capacitacion.excepciones.procesos.CustomException;
import com.capacitacion.excepciones.procesos.clientes;

import com.capacitacion.excepciones.procesos.ProcesarDatos;


public class ExcepcionesApplication extends Throwable {


    public static void main(String[] args) throws IOException {

        caso1();
        caso2();
        caso3();
        caso4();
        caso5();


    }

    public static void caso1() {

        // cree una instancia de la clase ProcesarDatos y use el metodo division.
        //envie   los valores ("48", "0") - division por cero
        //en el metodo division capture e identifique la excepcion que se genera (no la excepcion general de java Exception) e imprima en consola  desde  el catch StackTrace,Cause,Message;
        // haga lo mismo para los valores ("15.8", "30")
        ProcesarDatos datos1 = new ProcesarDatos();
        try {
            datos1.division("48", "0");
        } catch (ArithmeticException a) {
            a.printStackTrace(System.out);
            System.out.println("El error es para el caso 1 valores (\"48\", \"0\") -->mensaje :" + a.getMessage());
            System.out.println("El error es para el caso 1 valores (\"48\", \"0\") -->causa :" + a.getCause());

        }

        try {
            datos1.division("15.8", "30");
        } catch (NumberFormatException b) {
            b.printStackTrace(System.out);
            System.out.println("El error es para el caso 1 valores (\"15.8\", \"30\") -->mensaje : " + b.getMessage());
            System.out.println("El error es para el caso 1 valores (\"15.8\", \"30\") -->causa : " + b.getCause());
        }

    }

    public static void caso2() {

        //cree una instancia de la clase ProcesarDatos y use el metodo division. y use metodo arreglo
        //envie al metodo arry de string  de 3 valores para que se genere una excepcion.
        //capture e identifique la excepcion que se genera (no la excepcion general de java Exception) e imprima en consola   StackTrace,Cause,Message del error;
        ProcesarDatos datos2 = new ProcesarDatos();
        String[] valor = {"45", "23", "11"};

        try {
            datos2.arreglo(valor);
        } catch (IndexOutOfBoundsException c) {
            c.printStackTrace(System.out);
            System.out.println("El error es para el caso 2 -->mensaje : " + c.getMessage());
            System.out.println("El error es para el caso 2 -->causa : " + c.getCause());
        }

    }

    public static void caso3() {

        ProcesarDatos datos3 = new ProcesarDatos();
        String fechas = "2020/11/24";

        try {
            datos3.fecha(fechas);
        } catch (Throwable exc) {
            exc.printStackTrace(System.out);
            System.out.println("El error es para el caso 3 -->mensaje : " + exc.getMessage());
            System.out.println("El error es para el caso 3 -->causa : " + exc.getCause());
        }


    }

    public static void caso4() {
        //manejo de excepciones personalizadas

        ProcesarDatos datos4 = new ProcesarDatos();
        String ruta = "C:\\Taller 6\\manejoExcepciones-main\\src\\main\\java\\com\\capacitacion\\excepciones\\datos\\data.txt";

        try {
            datos4.buscarArchivo(ruta);
        } catch (CustomException h) {
            System.out.println("El error es para el caso 4 --> mensaje : " + h.getMessage());
            h.printStackTrace(System.out);
        }


    }

    public static void caso5() {
        //manejo de cierre de  objetos en lectura y escritura de arhivos
        ProcesarDatos datos5 = new ProcesarDatos();

        String ruta = "C:\\Taller 6\\manejoExcepciones-main\\src\\main\\java\\com\\capacitacion\\excepciones\\datos\\data.txt";

        try {
            datos5.leerArchivo(ruta);
        } catch (IndexOutOfBoundsException a) {
            a.printStackTrace(System.out);
            System.out.println("El error es para el caso 5 --> mensaje: " + a.getMessage());
            System.out.println("El error es para el caso 5 --> mensaje: " + a.getCause());
        } catch (OverlappingFileLockException e) {
            e.printStackTrace(System.out);
            System.out.println("El error es para el caso 5 --> mensaje: " + e.getMessage());
            System.out.println("El error es para el caso 5 --> casusa : " + e.getCause());
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("El error es para el caso 5 --> mensaje: " + e.getMessage());
            System.out.println("El error es para el caso 5 --> casusa : " + e.getCause());
        } finally {
            System.out.println("Culminacion del caso 5");
        }


    }


}
