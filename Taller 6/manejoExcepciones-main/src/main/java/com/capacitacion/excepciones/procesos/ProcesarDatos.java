package com.capacitacion.excepciones.procesos;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;






public class ProcesarDatos {
	
	public int division(String numero1,String numero2) {
		int resultado = 0;
		
		resultado=Integer.valueOf(numero1)/Integer.valueOf(numero2);
		return resultado;
		
	}
	
	
	public void arreglo(String[] lista) {
		

			for(int i=0;i<=5;i++) {
				String lista2=lista[i];
			}

	}
	
	public void fecha(String input) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date   date  = format.parse (input );
			date.toString();
		} catch (ParseException e) {
			throw new RuntimeException("Formato de fecha invalido");
		}
	}

	public void buscarArchivo(String ruta) throws  CustomException {

		File file = new File (ruta);
		try {
			Scanner data = new Scanner(file);
		}catch (FileNotFoundException h){
			throw new CustomException("archivo no existe en la ruta",h.getCause());
		}

	}



	public void leerArchivo(String ruta) throws Exception {

		ArrayList<clientes> vectorClientes= new ArrayList<clientes>();

		File file = new File (ruta);
		Scanner data = new Scanner(file);
		String ruta2="C:\\Taller 6\\manejoExcepciones-main\\src\\main\\java\\com\\capacitacion\\excepciones\\datos\\data2.txt";
		FileWriter fichero = new FileWriter(ruta2);
		PrintWriter pw = new PrintWriter(fichero);
		int i=0;


		try {

			while (data.hasNextLine()) {

				String[] estData = data.nextLine().split(";");
				clientes dato1 = new clientes(estData[0], estData[1], estData[2]);
				vectorClientes.add(dato1);
				pw.println(vectorClientes.get(i).nombre + ";" + vectorClientes.get(i).profesion);
				i++;
			}

		}
		finally {
			data.close();
			pw.close();

		}


	}






}
