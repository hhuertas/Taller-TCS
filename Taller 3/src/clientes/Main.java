package clientes;

import clases.Clientes;
import clases.Producto;

import java.util.ArrayList;
import java.util.Scanner;


import javax.swing.*;

public class Main {



    public static void main(String[] args) {

        ArrayList<Clientes> vectorCliente = new ArrayList<Clientes>();
        ArrayList<Producto> vectorProducto = new ArrayList<Producto>();
       //ArrayList<Producto> vectorProducto = new ArrayList<Producto>();

        String menu =
                        "         --> 1 Agregar cliente\n" +
                        "         --> 2 Editar cliente\n" +
                        "         --> 3 Eliminar cliente\n" +
                        "         --> 4 Agregar productos\n" +
                        "         --> 5 Consultar clientes con documento y tipo de documento \n" +
                        "         --> 0 salir de la aplicacion";
       
       
        Object [] documentos ={"CEDULA","CEDULA EXTRANGERIA","PASAPORTE","REGISTRO CIVIL"};
        Object [] estado ={"NUEVO","USADO"};
        
        final JDialog dialog = new JDialog();
    	dialog.setAlwaysOnTop(true); 
    	String output = "";
    	int i=0;
    	int h=0;
    	
        Object opMenu;
		do {

            Clientes dato1 = new Clientes();

            opMenu = JOptionPane.showInputDialog(null,menu);
            
          //0=yes, 1=no, 2=cancel
            if(opMenu == null) {
               System.out.println("Muchas gracias por usar nuestra app, hasta luego");
               break;
            }
            
            switch (opMenu.toString()) {
                case "1":  //Agregar Cliente
                	boolean caso1 =false;
                	output="";
                	
                	//Solicitud de informacion y asignacion.
                	String opcions = (String) JOptionPane.showInputDialog(null,"Ingrese el tipo de documento", "Elegir",JOptionPane.QUESTION_MESSAGE,null,documentos, documentos[0]);
                	dato1.setTipDoc(opcions);
                    dato1.setDocumento(JOptionPane.showInputDialog("Ingrese el numero de documento"));
                    dato1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
                    dato1.setTelefono(JOptionPane.showInputDialog("Ingrese el Telefono"));
                    dato1.setDireccion(JOptionPane.showInputDialog("Ingrese la Direccion"));
                    
                   String proclien = JOptionPane.showInputDialog("Ingrese ID del producto o nombre del producto");
                	
                	if (proclien == null || proclien== null ) {
                    	break;
                    }
                    
                    for (int i3= 0;i3<vectorProducto.size();i3++){
                    
                    	Producto auxCliente6 = vectorProducto.get(i3);
                   
                        if(proclien.equals(auxCliente6.getIdProducto()) || proclien.equals(auxCliente6.getNombre())) {
                        	
                        	dato1.setProductos(auxCliente6.getNombre());      
                        	caso1=true;
                        }
                        
                        
                    }
                    
                    
                    if(caso1 == false) {
                        JOptionPane.showMessageDialog(null, "Producto no encontrado favor agregar");
                        break;
                     }
                    
                   
                    vectorCliente.add(dato1);
                    
                    //Respuesta de la asignacion.
                    String tipDocLista = vectorCliente.get(i).getTipDoc();
                    String NroDocLista = vectorCliente.get(i).getDocumento();
                    String nomClientes = vectorCliente.get(i).getNombre();
                    String teleCliente = vectorCliente.get(i).getTelefono();
                    String direCliente = vectorCliente.get(i).getDireccion();
                    String cliproduct = vectorCliente.get(i).getProducto();
                        
                        output += "Cliente Agregado\n"+ 
                        		  "Tipo de documento: " + tipDocLista +"\n"+ 
                                  "Numero de documento: " + NroDocLista + "\n"+
                                  "Nombre: " + nomClientes + "\n"+ 
                                  "Telefono: " + teleCliente + "\n"+
                                  "Direccion: " + direCliente + "\n"+
                                  "Producto: " + cliproduct;
                        
                       JOptionPane.showMessageDialog(null, output); 
                    
                    
                    i +=1;
                    break;
                case "2": //Editar Cliente
                	boolean caso2 =false;
                	output="";
                	String opcion2 = (String) JOptionPane.showInputDialog(null,"Tipo de documento del cliente a editar", "Elegir",JOptionPane.QUESTION_MESSAGE,null,documentos, documentos[0]);
                	String nombus = JOptionPane.showInputDialog("Numero de documento del cliente");
                	
                	if (opcion2 == null || nombus == null ) {
                    	break;
                    }
          
                    for (int i2= 0;i2<vectorCliente.size();i2++){
                    	
                        Clientes auxCliente2 = vectorCliente.get(i2);
                        
                        if(opcion2.equals(auxCliente2.getTipDoc()) && nombus.equals(auxCliente2.getDocumento())){
                        	String tipDocLista2 = vectorCliente.get(i2).getTipDoc();
                        	String NroDocLista2 = vectorCliente.get(i2).getDocumento();
                        	String nomClientes2 = vectorCliente.get(i2).setNombre1(JOptionPane.showInputDialog("Ingrese el nombre"));
                        	String teleCliente2 = vectorCliente.get(i2).setTelefono1(JOptionPane.showInputDialog("Ingrese el Telefono"));
                        	String direCliente2 = vectorCliente.get(i2).setDireccion1(JOptionPane.showInputDialog("Ingrese la Direccion"));
                              
                             output += "Cliente Modificado\n"+ 
                                       "Tipo de documento: " + tipDocLista2 +"\n"+ 
                                        "Numero de documento: " + NroDocLista2 + "\n"+
                                        "Nombre: " + nomClientes2 + "\n"+ 
                                        "Telefono: " + teleCliente2 + "\n"+
                                        "Direccion: " + direCliente2;
                              
                             JOptionPane.showMessageDialog(null, output); 
                             caso2 = true;
                             break;	
                            
                        }
                    }
                	
                    if(caso2 == false) {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                        break;
                     }else {
                    	break; 
                     }
                    
                    
                case "3": //Eliminar Cliente
                	boolean caso3 =false;
                	output="";
                	String opcion3 = (String) JOptionPane.showInputDialog(null,"Ingrese el tipo de documento", "Elegir",JOptionPane.QUESTION_MESSAGE,null,documentos, documentos[0]);
                	String nombus3 = JOptionPane.showInputDialog("Ingrese el numero de documento");
                	
                	if (opcion3 == null || nombus3 == null ) {
                    	break;
                    }
          
                    for (int d= 0;d<vectorCliente.size();d++){
                    	
                        Clientes auxCliente3 = vectorCliente.get(d);

                        if(opcion3.equals(auxCliente3.getTipDoc()) && nombus3.equals(auxCliente3.getDocumento())){
                        	 
                        	vectorCliente.remove(d);	
                              
                             JOptionPane.showMessageDialog(null, "Cliente eliminador con exito"); 
                             caso3 = true;
                             break;
                        }
                    }
                  
                    if(caso3 == false) {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                        break;
                     }else {
                    	break; 
                     }
                    
                case "4": //Agregar Productos
                	output="";
                	Producto producto = new Producto();
                	producto.setIdProducto(JOptionPane.showInputDialog("Id del producto"));
                	producto.setNombre(JOptionPane.showInputDialog("Nombre del producto"));
                	producto.setCarateristicas(JOptionPane.showInputDialog("Caracteristica del producto"));
                	producto.setCondiciones((String) JOptionPane.showInputDialog(null,"Ingrese Condicion del producto", "Elegir",JOptionPane.QUESTION_MESSAGE,null,estado, estado[0]));
                	vectorProducto.add(producto);
                	
                	                
                    //Respuesta de la asignacion.
                    String IdPruducto = vectorProducto.get(h).getIdProducto();
                    String Nomproducto = vectorProducto.get(h).getNombre();
                    String Caracteristica = vectorProducto.get(h).getCarateristicas();
                    String Condicion = vectorProducto.get(h).getCondiciones();
                       
                        output += "Producto Agregado\n"+ 
                        		  "Id Producto: " + IdPruducto +"\n"+ 
                                  "Nombre del producto: " + Nomproducto + "\n"+
                                  "Caracteristica: " + Caracteristica + "\n"+ 
                                  "Condicion: " + Condicion + "\n";
                                     
                       JOptionPane.showMessageDialog(null, output); 
                	
                    h+=1;   
                    break;
                case "5": //Consultar cliente
                	boolean caso5 =false;
                	output="";
                	String opcion5 = (String) JOptionPane.showInputDialog(null,"Ingrese el tipo de documento", "Elegir",JOptionPane.QUESTION_MESSAGE,null,documentos, documentos[0]);
                	String nombus5 = JOptionPane.showInputDialog("Ingrese el numero de documento");
                	
                	if (opcion5 == null || nombus5== null ) {
                    	break;
                    }
          
                    for (int e= 0;e<vectorCliente.size();e++){
                    	
                        Clientes auxCliente5 = vectorCliente.get(e);

                        if(opcion5.equals(auxCliente5.getTipDoc()) && nombus5.equals(auxCliente5.getDocumento())){
                        	String tipDocLista5 = vectorCliente.get(e).getTipDoc();
                        	String NroDocLista5 = vectorCliente.get(e).getDocumento();
                        	String nomClientes5 = vectorCliente.get(e).getNombre();
                        	String teleCliente5 = vectorCliente.get(e).getTelefono();
                        	String direCliente5 = vectorCliente.get(e).getDireccion();
                              
                             output += "Cliente Encontrado\n"+ 
                                       "Tipo de documento: " + tipDocLista5 +"\n"+ 
                                        "Numero de documento: " + NroDocLista5 + "\n"+
                                        "Nombre: " + nomClientes5 + "\n"+ 
                                        "Telefono: " + teleCliente5 + "\n"+
                                        "Direccion: " + direCliente5;
                              
                             JOptionPane.showMessageDialog(null, output); 
                             caso5 = true;	
                            break;
                        }

                    }
                    
                    if(caso5 == false) {
                       JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                       break;
                    }else {
                       break;	
                    }
                    
                case "0": //Salir
                    System.out.println("Muchas gracias por usar nuestra app, hasta luego");
                    break;
                default:  //Opcion invalidad
                    System.out.println("El valor ingresado no es una opcion de menu");
                    break;
            }
        } while (!opMenu.toString().equals("0"));
        //in.close();

    }
}
