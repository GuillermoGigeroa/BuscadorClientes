package presentacion.ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;

public class Ventana extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private GridBagLayout gbl_panel;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 550, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);

		gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0 };
		gbl_panel.rowHeights = new int[] { 0 };
		gbl_panel.columnWeights = new double[] { Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { Double.MIN_VALUE };
		panel.setLayout(gbl_panel);
	}
	
}
