package main;

import presentacion.controlador.Controlador;
import presentacion.ventanas.*;
import presentacion.paneles.*;

public class Main {
	public static void main(String[] args) {
		Controlador controlador = new Controlador(new Ventana(), new PanelBuscarClientes(), new PanelEncontrados());
		controlador.iniciarVentana();
	}
}
