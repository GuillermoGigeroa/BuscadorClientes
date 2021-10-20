package utilidades;

import javax.swing.JOptionPane;

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
}
