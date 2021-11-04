package utilidades;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import entidad.ClienteTigre;

public abstract class Util {
	
	public static void mensaje (String texto) {
		JOptionPane.showMessageDialog(null, texto);
	}
	
	public static ClienteTigre obtenerClienteTigre(String lineaDeTexto) {
		ArrayList<String> listaCampos = new ArrayList<String>();
		for (String linea : lineaDeTexto.split(",")) {
			listaCampos.add(linea);
		}
		return new ClienteTigre(listaCampos.get(0),listaCampos.get(1),listaCampos.get(2),listaCampos.get(3));
	}
}
