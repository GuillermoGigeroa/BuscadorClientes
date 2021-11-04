package dao;

import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import entidad.Cliente;
import utilidades.Util;

public class Dao {
	/* 
	 * Modelo de datos: Codigo,RazonSocial,NombreFantasia,Domicilio
	 */
	private final String ruta;
	private ArrayList<Cliente> listaPersonas;

	// Constructores
	public Dao(String ruta) {
		this.listaPersonas = new ArrayList<Cliente>();
		this.ruta = ruta;
	}

	// Metodos de la clase
	public Boolean verificar(String ruta) {
		return this.existe(ruta);
	}

	public Boolean existe(String ruta) {
		File archivo = new File(ruta);
		return archivo.exists();
	}

	public void leerLineas() {
		String ruta = this.ruta;
		if (verificar(ruta)) {
			try {
				FileReader fileReader = new FileReader(ruta);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String linea = "";
				while (linea != null) {
					if (linea != "") {
//						this.listaPersonas.add(Util.convertirEnPersona(linea));
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
			System.out.println("Archivo no pudo ser creado.");
		}
	}

	// Getters y Setters
	protected ArrayList<Cliente> getListaPersonas() {
		return listaPersonas;
	}
	
	protected void setListaPersonas(ArrayList<Cliente> lista) {
		this.listaPersonas = lista;
	}

	protected String getRutaOrigen() {
		return ruta;
	}

}
