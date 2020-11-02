package com.company;

import Clases.CapacidadEndedudamiento;

import Clases.Mensajes;
//import javafx.scene.input.KeyCode;

import java.util.Scanner;


public class Main {

    //Recuerda que aca empieza todo

    public static void main(String[] args) {

        //Con este objeto de la clase Scanner puedes capturar informacion por consola cada ves que lo uses

        // recuerda cerrar el flujo de consulta cada ves lo uses sobre para que los uses in.close()

        int ingMesuales=0;
        int ingFijos=0;
        int gastoVariable=0;
        String valor;
        Scanner in = new Scanner(System.in);
        //Instancia de los mensaje a mostrar
        Mensajes msg = new Mensajes();


        String entrada = "SI";
        String valido1 ="NO";
        String valido2 ="NO";
        String valido3 ="NO";
        String rsp="";
        String Flag ="0";

        while (entrada.equals("SI")) {

            //Recupero primer valor
            while (valido1.equals("NO")) {
                System.out.println(msg.mensaje1);
                valor = in.nextLine().trim();

                //Valido si es numerico
                if (isNumeric(valor) == true) {
                    ingMesuales = Integer.valueOf(valor);
                    valido1 = "SI";
                } else {
                    System.out.println(msg.mensajeError + "." +msg.mensajeContinuar);
                    rsp = in.nextLine().trim().toUpperCase();
                    if ((rsp.equals("S"))){
                        valido1 ="NO";
                    }else {
                        valido1 = "SI";
                        entrada = "SI";
                        Flag = "1";
                        break;
                    }
                }

            }

            if (Flag == "1"){
                break;
            }

            //Recupero segundo valor
            while (valido1.equals("SI") && valido2.equals("NO")){
                    System.out.println(msg.mensaje2);
                    valor = in.nextLine().trim();

                    //Valido si es numerico
                    if (isNumeric(valor) == true) {
                        ingFijos = Integer.valueOf(valor);
                        valido2 = "SI";
                    } else {
                        System.out.println(msg.mensajeError + "." +msg.mensajeContinuar);
                        rsp = in.nextLine().trim().toUpperCase();
                        if ((rsp.equals("S"))){
                            valido2 = "NO";
                        }else{
                            valido2 = "SI";
                            entrada = "SI";
                            Flag = "1";
                            break;
                        }
                    }
            }

            if (Flag == "1"){
                break;
            }

            //Recupero tercer valor
            while (valido1.equals("SI") && valido2.equals("SI") && valido3.equals("NO")) {
                    System.out.println(msg.mensaje3);
                    valor = in.nextLine().trim();

                    //Valido si es numerico
                    if (isNumeric(valor) == true) {
                        gastoVariable = Integer.valueOf(valor);
                        valido3 = "SI";
                    } else {
                        System.out.println(msg.mensajeError + "." +msg.mensajeContinuar);
                        rsp = in.nextLine().trim().toUpperCase();
                        if ((rsp.equals("S"))){
                            valido3 = "NO";
                        }else{
                            valido2 = "SI";
                            entrada = "SI";
                            Flag = "1";
                            break;
                        }
                    }
            }

            if (Flag == "1"){
                break;
            }

            //Esto te dara la primera entrada al proceso de solicitar los datos para instancir nuestro objeto

            if ((valido1 == "SI") && (valido2 == "SI") && (valido3 == "SI")){
                CapacidadEndedudamiento datos =new CapacidadEndedudamiento(ingMesuales,ingFijos,gastoVariable);
                System.out.println(msg.mensajeFinal + " " + datos.getCapacidadEndeudamiento());
                entrada = "NO";
            }	

        }

    }

    public static boolean isNumeric(String value) {

        // implementa un bloque try catch aca
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

}