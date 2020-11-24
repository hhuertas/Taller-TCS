package com.tcs.tallerListas.beans;

public class Estudiante {

    private String identificacion;
    private String nombre;
    private String edad;
    private String repite;
    private String grado;

    public Estudiante(String identificacion, String nombre, String edad, String repite, String grado) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.repite = repite;
        this.grado = grado;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getRepite() {
        return repite;
    }

    public void setRepite(String repite) {
        this.repite = repite;
    }

}
