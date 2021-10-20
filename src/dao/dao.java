package dao;

import java.util.TreeSet;
import java.util.Iterator;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

/* Modelo de datos: ,
 * ,"Nombre"
 * ,"Servicio"
 * ,"Ip"
 * ,"Estado"
 * ,"Plan Internet"
 * ,"Router"
 * ,"Direcci�n"
 * ,"Barrio/Localidad"
 * ,"Telefono"
 * ,"Acci�n"
 */

public class dao {
	private TreeSet<Object> listaPersonas;
	private final String rutaOrigen;
	private final String rutaDestino;

	// Constructores
	public dao() {
		this.listaPersonas = new TreeSet<Object>();
		this.rutaOrigen = "Personas.txt";
		this.rutaDestino = "Resultado.txt";
	}
	
	public dao(String rutaOrigen, String rutaDestino) {
		this.listaPersonas = new TreeSet<Object>();
		this.rutaOrigen = rutaOrigen;
		this.rutaDestino = rutaDestino;
	}

	// Metodos de la clase
	public Boolean verificar(String ruta) {
		Boolean existe = this.existe(ruta);
		if (!existe) {
			return this.crearAchivo(ruta);
		}
		return existe;
	}

	public Boolean existe(String ruta) {
		File archivo = new File(ruta);
		return archivo.exists();
	}

	public Boolean crearAchivo(String ruta) {
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(ruta, true);
			fileWriter.write("");
			fileWriter.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void leerLineas() {
		String ruta = this.rutaOrigen;
		if (verificar(ruta)) {
			try {
				FileReader fileReader = new FileReader(ruta);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String linea = "";
				while (linea != null) {
					if (linea != "") {
						/*
						try {
							this.listaPersonas.add(Util.convertirEnPersona(linea));
						} catch (DniInvalido e) {
							// Aca se puede escribir un mensaje cada vez
							// que encuentre una persona con el dni mal cargado.
							// System.out.println("Se encontr� un dni mal cargado.");
						} catch (LineaInvalida e) {
							// Aca se puede escribir un mensaje cada vez
							// que encuentre una l�nea sin el formato solicitado.
							// System.out.println("Se encontr� una l�nea mal cargada.");
						}
						*/
					}
					linea = bufferedReader.readLine();
				}
				bufferedReader.close();
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Archivo no pudo ser creado.");
		}
	}

	public void exportarPersona(Object persona) {
		String ruta = this.rutaDestino;
		if (verificar(ruta)) {
			try {
				FileWriter fileWriter = new FileWriter(ruta, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//				bufferedWriter.write(persona.exportarString());
				bufferedWriter.close();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Archivo no pudo ser creado.");
		}
	}
	
	public void exportarPersonas(TreeSet<Object> lista) {
		Iterator<Object> listaPersonas = lista.iterator();
		while (listaPersonas.hasNext()) {
			this.exportarPersona(listaPersonas.next());
		}
	}

	// Getters y Setters
	protected TreeSet<Object> getListaPersonas() {
		return listaPersonas;
	}
	
	protected void setListaPersonas(TreeSet<Object> lista) {
		this.listaPersonas = lista;
	}

	protected String getRutaOrigen() {
		return rutaOrigen;
	}

	protected String getRutaDestino() {
		return rutaDestino;
	}

}
