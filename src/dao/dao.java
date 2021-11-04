package dao;

import java.util.TreeSet;
import java.util.Iterator;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import entidad.Cliente;
import utilidades.Util;

/* Modelo de datos:
 * 
 */

public class dao {
	private TreeSet<Cliente> listaPersonas;
	private final String rutaOrigen;
	private final String rutaDestino;

	// Constructores
	public dao() {
		this.listaPersonas = new TreeSet<Cliente>();
		this.rutaOrigen = "Personas.txt";
		this.rutaDestino = "Resultado.txt";
	}
	
	public dao(String rutaOrigen, String rutaDestino) {
		this.listaPersonas = new TreeSet<Cliente>();
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
	protected TreeSet<Cliente> getListaPersonas() {
		return listaPersonas;
	}
	
	protected void setListaPersonas(TreeSet<Cliente> lista) {
		this.listaPersonas = lista;
	}

	protected String getRutaOrigen() {
		return rutaOrigen;
	}

	protected String getRutaDestino() {
		return rutaDestino;
	}

}
