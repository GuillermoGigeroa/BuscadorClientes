package presentacion.paneles;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelBuscarClientes extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtNumero;
	private JTextField txtDomicilio;

	public PanelBuscarClientes() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 226, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblBuscadorTigre = new JLabel("Buscador Tigre");
		lblBuscadorTigre.setFont(new Font("Century Gothic", Font.BOLD, 20));
		GridBagConstraints gbc_lblBuscadorTigre = new GridBagConstraints();
		gbc_lblBuscadorTigre.gridwidth = 2;
		gbc_lblBuscadorTigre.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscadorTigre.gridx = 1;
		gbc_lblBuscadorTigre.gridy = 0;
		add(lblBuscadorTigre, gbc_lblBuscadorTigre);
		
		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		txtNumero.setForeground(Color.LIGHT_GRAY);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero.setText("Ingrese numero a buscar");
		GridBagConstraints gbc_txtNumero = new GridBagConstraints();
		gbc_txtNumero.insets = new Insets(0, 0, 5, 5);
		gbc_txtNumero.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNumero.gridx = 1;
		gbc_txtNumero.gridy = 1;
		add(txtNumero, gbc_txtNumero);
		txtNumero.setColumns(10);
		
		JButton btnBuscarPorNumero = new JButton("Buscar por numero");
		btnBuscarPorNumero.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GridBagConstraints gbc_btnBuscarPorNumero = new GridBagConstraints();
		gbc_btnBuscarPorNumero.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarPorNumero.gridx = 2;
		gbc_btnBuscarPorNumero.gridy = 1;
		add(btnBuscarPorNumero, gbc_btnBuscarPorNumero);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		txtNombre.setForeground(Color.LIGHT_GRAY);
		txtNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNombre.setText("Ingrese nombre a buscar");
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 3;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JButton btnBuscarPorNombre = new JButton("Buscar por nombre");
		btnBuscarPorNombre.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GridBagConstraints gbc_btnBuscarPorNombre = new GridBagConstraints();
		gbc_btnBuscarPorNombre.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarPorNombre.gridx = 2;
		gbc_btnBuscarPorNombre.gridy = 3;
		add(btnBuscarPorNombre, gbc_btnBuscarPorNombre);
		
		txtDomicilio = new JTextField();
		txtDomicilio.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		txtDomicilio.setForeground(Color.LIGHT_GRAY);
		txtDomicilio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDomicilio.setText("Ingrese domicilio a buscar");
		GridBagConstraints gbc_txtDomicilio = new GridBagConstraints();
		gbc_txtDomicilio.insets = new Insets(0, 0, 5, 5);
		gbc_txtDomicilio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDomicilio.gridx = 1;
		gbc_txtDomicilio.gridy = 5;
		add(txtDomicilio, gbc_txtDomicilio);
		txtDomicilio.setColumns(10);
		
		JButton btnBuscarPorDomicilio = new JButton("Buscar por domicilio");
		btnBuscarPorDomicilio.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		GridBagConstraints gbc_btnBuscarPorDomicilio = new GridBagConstraints();
		gbc_btnBuscarPorDomicilio.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarPorDomicilio.gridx = 2;
		gbc_btnBuscarPorDomicilio.gridy = 5;
		add(btnBuscarPorDomicilio, gbc_btnBuscarPorDomicilio);

	}

}
