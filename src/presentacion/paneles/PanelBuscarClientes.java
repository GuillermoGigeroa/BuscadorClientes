package presentacion.paneles;

import entidad.Memoria;
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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelBuscarClientes extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtNumero;
	private JTextField txtDomicilio;
	private JLabel lblBuscadorTigre;
	private JButton btnBuscarPorNumero;
	private JButton btnBuscarPorNombre;
	private JButton btnBuscarPorDomicilio;
	private GridBagLayout gridBagLayout;
	private GridBagConstraints gbc_lblBuscadorTigre;
	private GridBagConstraints gbc_txtNumero;
	private GridBagConstraints gbc_btnBuscarPorNumero;
	private GridBagConstraints gbc_txtNombre;
	private GridBagConstraints gbc_btnBuscarPorNombre;
	private GridBagConstraints gbc_txtDomicilio;
	private GridBagConstraints gbc_btnBuscarPorDomicilio;
	private Memoria memoriaNumero;
	private Memoria memoriaNombre;
	private Memoria memoriaDomicilio;

	public PanelBuscarClientes() {
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 226, 199, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		lblBuscadorTigre = new JLabel("Buscador Tigre");
		lblBuscadorTigre.setFont(new Font("Century Gothic", Font.BOLD, 25));
		gbc_lblBuscadorTigre = new GridBagConstraints();
		gbc_lblBuscadorTigre.gridwidth = 2;
		gbc_lblBuscadorTigre.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuscadorTigre.gridx = 1;
		gbc_lblBuscadorTigre.gridy = 0;
		add(lblBuscadorTigre, gbc_lblBuscadorTigre);

		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtNumero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (txtNumero.getForeground() == Color.LIGHT_GRAY) {txtNumero.setFont(new Font("Century Gothic", Font.BOLD, 13));}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if (txtNumero.getForeground() == Color.LIGHT_GRAY) {txtNumero.setFont(new Font("Century Gothic", Font.PLAIN, 13));}
			}
		});
		txtNumero.setText("Ingrese numero a buscar");
		memoriaNumero = new Memoria(txtNumero.getText());
		txtNumero.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtNumero.setText(memoriaNumero.vaciarMemoria());
				txtNumero.setForeground(Color.BLACK);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtNumero.setText(memoriaNumero.llenarMemoria());
				txtNumero.setForeground(Color.LIGHT_GRAY);
			}
		});
		txtNumero.setForeground(Color.LIGHT_GRAY);
		txtNumero.setHorizontalAlignment(SwingConstants.CENTER);
		
		gbc_txtNumero = new GridBagConstraints();
		gbc_txtNumero.insets = new Insets(0, 0, 5, 5);
		gbc_txtNumero.fill = GridBagConstraints.BOTH;
		gbc_txtNumero.gridx = 1;
		gbc_txtNumero.gridy = 1;
		add(txtNumero, gbc_txtNumero);
		txtNumero.setColumns(10);

		btnBuscarPorNumero = new JButton("Buscar por numero");
		btnBuscarPorNumero.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnBuscarPorNumero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBuscarPorNumero.setFont(new Font("Century Gothic", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBuscarPorNumero.setFont(new Font("Century Gothic", Font.PLAIN, 13));
			}
		});
		gbc_btnBuscarPorNumero = new GridBagConstraints();
		gbc_btnBuscarPorNumero.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBuscarPorNumero.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarPorNumero.gridx = 2;
		gbc_btnBuscarPorNumero.gridy = 1;
		add(btnBuscarPorNumero, gbc_btnBuscarPorNumero);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (txtNombre.getForeground() == Color.LIGHT_GRAY) {txtNombre.setFont(new Font("Century Gothic", Font.BOLD, 13));}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if (txtNombre.getForeground() == Color.LIGHT_GRAY) {txtNombre.setFont(new Font("Century Gothic", Font.PLAIN, 13));}
			}
		});
		txtNombre.setText("Ingrese nombre a buscar");
		memoriaNombre = new Memoria(txtNombre.getText());
		txtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtNombre.setText(memoriaNombre.vaciarMemoria());
				txtNombre.setForeground(Color.BLACK);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtNombre.setText(memoriaNombre.llenarMemoria());
				txtNombre.setForeground(Color.LIGHT_GRAY);
			}
		});
		txtNombre.setForeground(Color.LIGHT_GRAY);
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		
		gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.BOTH;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 3;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);

		btnBuscarPorNombre = new JButton("Buscar por nombre");
		btnBuscarPorNombre.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnBuscarPorNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBuscarPorNombre.setFont(new Font("Century Gothic", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBuscarPorNombre.setFont(new Font("Century Gothic", Font.PLAIN, 13));
			}
		});
		
		gbc_btnBuscarPorNombre = new GridBagConstraints();
		gbc_btnBuscarPorNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBuscarPorNombre.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarPorNombre.gridx = 2;
		gbc_btnBuscarPorNombre.gridy = 3;
		add(btnBuscarPorNombre, gbc_btnBuscarPorNombre);
		
		txtDomicilio = new JTextField();
		txtDomicilio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (txtDomicilio.getForeground() == Color.LIGHT_GRAY) {txtDomicilio.setFont(new Font("Century Gothic", Font.BOLD, 13));}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if (txtDomicilio.getForeground() == Color.LIGHT_GRAY) {txtDomicilio.setFont(new Font("Century Gothic", Font.PLAIN, 13));}
			}
		});
		txtDomicilio.setText("Ingrese domicilio a buscar");
		memoriaDomicilio = new Memoria(txtDomicilio.getText());
		txtDomicilio.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtDomicilio.setText(memoriaDomicilio.vaciarMemoria());
				txtDomicilio.setForeground(Color.BLACK);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtDomicilio.setText(memoriaDomicilio.llenarMemoria());
				txtDomicilio.setForeground(Color.LIGHT_GRAY);
			}
		});
		txtDomicilio.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtDomicilio.setForeground(Color.LIGHT_GRAY);
		txtDomicilio.setHorizontalAlignment(SwingConstants.CENTER);
		
		gbc_txtDomicilio = new GridBagConstraints();
		gbc_txtDomicilio.insets = new Insets(0, 0, 5, 5);
		gbc_txtDomicilio.fill = GridBagConstraints.BOTH;
		gbc_txtDomicilio.gridx = 1;
		gbc_txtDomicilio.gridy = 5;
		add(txtDomicilio, gbc_txtDomicilio);
		txtDomicilio.setColumns(10);

		btnBuscarPorDomicilio = new JButton("Buscar por domicilio");
		btnBuscarPorDomicilio.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnBuscarPorDomicilio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBuscarPorDomicilio.setFont(new Font("Century Gothic", Font.BOLD, 13));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBuscarPorDomicilio.setFont(new Font("Century Gothic", Font.PLAIN, 13));
			}
		});
		
		gbc_btnBuscarPorDomicilio = new GridBagConstraints();
		gbc_btnBuscarPorDomicilio.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBuscarPorDomicilio.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarPorDomicilio.gridx = 2;
		gbc_btnBuscarPorDomicilio.gridy = 5;
		add(btnBuscarPorDomicilio, gbc_btnBuscarPorDomicilio);

	}
}
