package clases;

import clientes.Main;

import java.util.List;

public class Clientes extends Empresas{
    private String nombre;
    private String telefono;
    private String direccion;
    private List<Producto> productos;
	private String nombre2;
	private String producto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String setNombre1(String nombre) {
        return this.nombre = nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String setTelefono1(String telefono) {
        return this.telefono = telefono;
    }	
        
   
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String setDireccion1(String direccion) {
        return this.direccion = direccion;
    }
   
    
    public List<Producto> getProductos() {
        return productos;
    }

	public String setProductos(String nombre2) {
		return this.nombre2 = nombre2;
	}
	
	public String getProducto() {
		return nombre2;
	}


	
   
}
