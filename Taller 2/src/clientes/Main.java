package clientes;

import clases.BeneficiosCovid19;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code her

        BeneficiosCovid19 datos = new BeneficiosCovid19();

        //Lista 1
        List<String> lista1 = new ArrayList<String>();
        lista1.add("id " + getIdBeneficio());
        lista1.add("Juan");
        lista1.add("Beneficiados que perdieron su trabajo por COVID19");
        lista1.add("150000");
        Integer valor1 = Integer.parseInt(lista1.get(3));

        //Lista 2
        List<String> lista2 = new ArrayList<String>();
        lista2.add("id " + getIdBeneficio());
        lista2.add("Juan");
        lista2.add("Beneficios para persona tercera edad dagnificados COVID");
        lista2.add("200000");
        Integer valor2 = Integer.parseInt(lista2.get(3));

        if (valor1 > valor2) {
            datos.setValorSubsidio(valor1);
            System.out.println("Mejor beneficio es " + datos.getValorSubsidio());
            
            for (int i= 0;i<lista2.size();i++){
              

                System.out.println("\n"+lista1.get(i));
                
            }
            
        }
        else{
            datos.setValorSubsidio(valor2);
            System.out.println("Mejor beneficio es " + datos.getValorSubsidio());
            
            for (int i= 0;i<lista2.size();i++){
                
                System.out.println("\n" + lista2.get(i));
               
            }
        }

    }

    private static String getIdBeneficio(){
        //La Clase Math tiene varios metodos que te ayudaran
        return String.valueOf(Math.random());
    }
}
