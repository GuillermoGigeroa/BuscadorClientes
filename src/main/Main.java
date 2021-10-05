package main;

import procesadores.Util;
import dominio.ClienteEscobar;

public class Main {

	public static void main(String[] args) {
		String linea = ",\"Nombre\",\"Servicio\",\"Ip\",\"Estado\",\"Plan Internet\",\"Router\",\"Dirección\",\"Barrio/Localidad\",\"Telefono\",\"Acción\"";
		ClienteEscobar cliente = Util.procesarLineaEscobar(linea);
		System.out.println(cliente);
	}

}
