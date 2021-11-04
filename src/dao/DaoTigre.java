package dao;

import entidad.*;
import utilidades.Util;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class DaoTigre{
	/* 
	 * Modelo de datos: Codigo,RazonSocial,NombreFantasia,Domicilio
	 */
	private final String ruta;
	private ArrayList<ClienteTigre> listaPersonas;

	// Constructores
	public DaoTigre() {
		this.listaPersonas = new ArrayList<ClienteTigre>();
		this.ruta = "ClientesTigre.csv";
	}
	
	public DaoTigre(String ruta) {
		this.listaPersonas = new ArrayList<ClienteTigre>();
		this.ruta = ruta;
	}

	// Metodos de la clase
	public Boolean existe(String ruta) {
		File archivo = new File(ruta);
		return archivo.exists();
	}

	public void leerLineas() {
		String ruta = this.ruta;
		if (existe(ruta)) {
			try {
				FileReader fileReader = new FileReader(ruta);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String linea = "";
				while (linea != null) {
					if (linea != "") {
						this.listaPersonas.add(Util.obtenerClienteTigre(linea));
					}
					linea = bufferedReader.readLine();
				}
				bufferedReader.close();
				fileReader.close();
			} catch (Exception e) {
				e.printStackTrace();
				Util.mensaje(e.getMessage());
			}
		} else {
			System.out.println("Archivo no encontrado.");
		}
	}

	// Getters y Setters
	public ArrayList<ClienteTigre> getListaClientes() {
		return listaPersonas;
	}

	public String getRuta() {
		return ruta;
	}

}
