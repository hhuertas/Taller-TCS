package Clases;

public class CapacidadEndedudamiento {

    Integer ingresosTotales;

    Integer gastosFijos;

    Integer gastoVaribales;

    final double POR_FIJO = 0.35;

    public CapacidadEndedudamiento(Integer ingresosTotales,Integer gastosFijos,Integer gastoVaribales ){
        this.ingresosTotales=ingresosTotales;
        this.gastosFijos=gastosFijos;
        this.gastoVaribales=gastoVaribales;
    }

    //Metodo set
    public void SetingresosTotales(Integer ingresosTotales) {
        this.ingresosTotales=ingresosTotales;
    }

    public void SetgastosFijos(Integer gastosFijos) {
        this.gastosFijos=gastosFijos;
    }

    public void SetgastoVaribales(Integer gastoVaribales) {
        this.gastoVaribales=gastoVaribales;
    }

    //Metodo get
    public Integer GetingresosTotales() {
        return ingresosTotales;
    }

    public Integer GetgastosFijos() {
        return gastosFijos;
    }

    public Integer GetgastoVaribales() {
        return gastoVaribales;
    }

    public String getCapacidadEndeudamiento() {

        return String.valueOf((ingresosTotales - (gastosFijos + gastoVaribales))*POR_FIJO);

    }

}