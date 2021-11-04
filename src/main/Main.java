package main;

import dao.Dao;

//import presentacion.*;

public class Main {
	public static void main(String[] args) {
//		Ventana ventana = new Ventana();
//		ventana.setContentPane(new PanelBuscarClientes());
//		ventana.setVisible(true);
		Dao dao = new Dao("ClientesTigre.csv");
		dao.leerLineas();
	}
}
