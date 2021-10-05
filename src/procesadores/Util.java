package procesadores;

import javax.swing.JOptionPane;
import dominio.*;

public abstract class Util {
	
	public static void mensaje(String texto) {
		JOptionPane.showMessageDialog(null, texto);
	}
	
	public static String ingreso() {
		return JOptionPane.showInputDialog(null);
	}
	
	public static String[] arrayStringVacio(int tam) {
		String array[] = new String[tam];
		for (int dato = 0; dato < 10; dato++) {
			array[dato] = "";
		}
		return array;
	}
	
	public static ClienteEscobar procesarLineaEscobar (String linea) {
		String datos[] = Util.arrayStringVacio(10);
		// Modelo de datos: ,"Nombre","Servicio","Ip","Estado","Plan Internet","Router","Dirección","Barrio/Localidad","Telefono","Acción"
		boolean escritura = false;
		int contador = -1;
		for (int i = 0; i < linea.length(); i++) {
			char caracterActual = linea.charAt(i);
			if(caracterActual == ',') {
				contador++;
				escritura = !escritura;
				continue;
			}
			if(caracterActual == '"') {
				if (contador == 9) {
					break;
				}
				continue;
			}
			datos[contador] += caracterActual;
		}
		return new ClienteEscobar(datos[0],new Domicilio(datos[6],datos[7]));
	}
}
