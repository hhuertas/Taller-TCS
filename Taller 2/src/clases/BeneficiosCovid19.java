package clases;

public class BeneficiosCovid19 {
    //Debe ser el numero entero aleatorio puedes usar la funcion ramdom para esto
    private String id;
    private String nombre;
    private Float valorSubsidio;
    private Double idCliente;

    //Completar clase
    public void setId(String id) {
        this.id=id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValorSubsidio(float valorSubsidio) {
        this.valorSubsidio = valorSubsidio;
    }

    public Double getId() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public Float getValorSubsidio() {
        return valorSubsidio;
    }

    public double valorRandom(){
        return Math.random();
    }

    //Implementar un metodo que retorne el mejor beneficio comparando los valores de todos los beneficios
    public Float getMejorbeneficios(){
        return Float.valueOf(valorSubsidio);
    }
}
