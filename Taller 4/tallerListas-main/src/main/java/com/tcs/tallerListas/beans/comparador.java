package com.tcs.tallerListas.beans;

import java.util.Comparator;

public class comparador implements Comparator <Estudiante>{

    @Override
    public int compare(Estudiante grado1, Estudiante grado2) {

        return grado1.getGrado().compareTo(grado2.getGrado());
    }
}
