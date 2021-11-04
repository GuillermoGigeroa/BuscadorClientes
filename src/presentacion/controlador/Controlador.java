package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import presentacion.ventanas.*;
import presentacion.paneles.*;

public class Controlador implements ActionListener{
	private Ventana ventana;
	private PanelBuscarClientes panelBuscar;
	private PanelEncontrados panelEncontrados;
	public Controlador(Ventana ventana, PanelBuscarClientes buscar, PanelEncontrados encontrados) {
		this.ventana = ventana;
		this.panelBuscar = buscar;
		this.panelEncontrados = encontrados;
	}
	
	public void iniciarVentana() {
		this.ventana.setContentPane(panelBuscar);
		this.ventana.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {}
	
//	panel.getTablaPersonas().setModel((new ListarPersonas()).getListaTabla());
}
