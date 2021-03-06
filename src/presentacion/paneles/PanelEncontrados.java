package presentacion.paneles;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PanelEncontrados extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTable tablaClientes;
	private GridBagConstraints gbc_table;
	private GridBagLayout gridBagLayout;
	
	public PanelEncontrados() {
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		tablaClientes = new JTable();
		gbc_table = new GridBagConstraints();
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 1;
		add(new JScrollPane(tablaClientes), gbc_table);
	}

	public JTable getTablaClientes() {
		return tablaClientes;
	}
	
}
