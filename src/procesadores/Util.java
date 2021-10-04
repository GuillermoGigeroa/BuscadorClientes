package procesadores;

import javax.swing.JOptionPane;

public abstract class Util {
	public static void mensaje(String texto) {
		JOptionPane.showMessageDialog(null, texto);
	}
	public static String ingreso() {
		return JOptionPane.showInputDialog(null);
	}
}
