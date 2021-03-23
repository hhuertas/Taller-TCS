package lab;

public class Busqueda {

    int dato,inf,sup,mitad,i,resultado;
    boolean flag;
    static Integer[] arreglo = { 2, 5, 9, 58, 36, 78, 84 };


    static Integer clave = 78;



    public int secuencial() {

        int resultado = -1;



        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] == clave) {

                resultado = i;

                break;

            }

        }



        return resultado;

    }



    /**

     * Suponiendo que la lista está almacenada como un array, los índices de la lista son: bajo = 0

     y alto = n-1 y n es el número de elementos del array, los pasos a seguir:

     1. Calcular el índice del punto central del array central = (bajo + alto)/2 (división entera)

     2. Comparar el valor de este elemento central con la clave:

     a. Si a[central] < clave, la nueva sublista de búsqueda tiene por valores extremos de

     su rango bajo = central+1..alto.

     b. Si clave < a[central], la nueva sublista de búsqueda tiene por valores extremos de su

     rango bajo..central-1.

     El algoritmo se termina bien porque se ha encontrado la clave o porque el valor de bajo excede

     a alto y el algoritmo devuelve el indicador de fallo de -1 (búsqueda no encontrada).

     * @return

     */

    public int binaria() {

        flag=false;

        //busqueda binaria
        inf=0;
        sup=7;
        i= 0;

        mitad=(inf+sup)/2;

        while (inf<=sup && i<7){
            if (arreglo[mitad] ==clave){
                resultado = 1;
                flag=true;
                break;
            }

            if(arreglo[mitad]>clave){
                sup=mitad;
                mitad= (inf+sup)/2;
            }

            if(arreglo[mitad]<clave){
                inf = mitad;
                mitad= (inf+sup)/2;
            }
            i++;

        }

        if (flag == true){
            resultado = 1;
        }else{
            resultado = -1;
        }

        return resultado;

    }



    public static void main(String[] args) {

        Busqueda busqueda = new Busqueda();



        int posicion = busqueda.binaria();



        if(posicion == -1) {

            System.out.println("Valor no encontrado");

        }else {

            System.out.println("El valor clave " + clave + " encontrado en posicion " + busqueda.mitad);

        }



    }

}