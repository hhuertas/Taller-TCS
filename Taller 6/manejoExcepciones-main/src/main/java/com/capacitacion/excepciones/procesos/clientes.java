package com.capacitacion.excepciones.procesos;

public class clientes {

    public String nombre;
    public String profesion;
    public String estado;

    public clientes(String nombre, String estado, String profesion) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
