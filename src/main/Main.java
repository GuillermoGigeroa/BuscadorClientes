package main;

import presentacion.paneles.PanelBuscarClientes;
import presentacion.ventanas.Ventana;

public class Main {
	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		ventana.setContentPane(new PanelBuscarClientes());
		ventana.setVisible(true);
	}
}
