package com.capacitacion.excepciones.procesos;

public class CustomException extends Exception {

    public static final long serialVersionUID = 700L;

    public CustomException(String causa, Throwable  tipofalla){
        super(causa, tipofalla);
    }

}
