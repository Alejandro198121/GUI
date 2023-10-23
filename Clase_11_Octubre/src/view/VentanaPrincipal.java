package view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	private PanelPrincipal panel;

	public VentanaPrincipal() {
		setTitle("TITULO");
		setSize(800, 600);
		// cerrar por completo sin dejar ningun registro
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// color de fondo
		getContentPane().setBackground(Color.pink);
		// null = manual
		getContentPane().setLayout(null);

		inicializarComponentes();
		// el cuadro de maximizar a la izquierda de la x
		setResizable(false);
		// que se abra en el centro de la pantalla
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void inicializarComponentes() {
		panel = new PanelPrincipal();
		panel.setBounds(25, 25, 735, 510);
		getContentPane().add(panel);
	}

	public PanelPrincipal getPanel() {
		return panel;
	}

	public void setPanel(PanelPrincipal panel) {
		this.panel = panel;
	}

}
