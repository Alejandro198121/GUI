package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelPrincipal extends JPanel {

	private JLabel etiquetaTitulo;
	private JLabel etiquetaNumero;
	private JLabel etiquetaResultado;
	private JLabel etiquetaMostrar;

	private JTextField campoNumero;
	private JButton botonValidar;

	public PanelPrincipal() {
		setLayout(null);
		inicializarComponentes();
		setBackground(Color.CYAN);
		setVisible(true);
	}

	public void inicializarComponentes() {
		etiquetaTitulo = new JLabel("PAR si o no?");
		Font fuenteNueva = new Font("arial", Font.BOLD, 20);
		etiquetaTitulo.setBounds(300, 20, 670, 30);
		// color letra foreground
		etiquetaTitulo.setForeground(Color.WHITE);
		etiquetaTitulo.setFont(fuenteNueva);
		add(etiquetaTitulo);

		etiquetaNumero = new JLabel("INGRESE numero:");
		etiquetaNumero.setBounds(100, 200, 200, 30);
		add(etiquetaNumero);

		etiquetaResultado = new JLabel("resultado:");
		etiquetaResultado.setBounds(100, 300, 200, 30);
		add(etiquetaResultado);

		etiquetaMostrar = new JLabel();
		etiquetaMostrar.setBounds(300, 300, 200, 30);
		add(etiquetaMostrar);

		campoNumero = new JTextField();
		campoNumero.setBounds(300, 200, 100, 30);
		campoNumero.setHorizontalAlignment(JTextField.CENTER);
		add(campoNumero);

		botonValidar = new JButton("validar");
		botonValidar.setBackground(Color.black);
		botonValidar.setForeground(Color.orange);
		botonValidar.setBounds(480, 200, 100, 30);

		botonValidar.setActionCommand("VALIDAR");

		add(botonValidar);
	}

	public JLabel getEtiquetaTitulo() {
		return etiquetaTitulo;
	}

	public void setEtiquetaTitulo(JLabel etiquetaTitulo) {
		this.etiquetaTitulo = etiquetaTitulo;
	}

	public JLabel getEtiquetaNumero() {
		return etiquetaNumero;
	}

	public void setEtiquetaNumero(JLabel etiquetaNumero) {
		this.etiquetaNumero = etiquetaNumero;
	}

	public JLabel getEtiquetaResultado() {
		return etiquetaResultado;
	}

	public void setEtiquetaResultado(JLabel etiquetaResultado) {
		this.etiquetaResultado = etiquetaResultado;
	}

	public JLabel getEtiquetaMostrar() {
		return etiquetaMostrar;
	}

	public void setEtiquetaMostrar(JLabel etiquetaMostrar) {
		this.etiquetaMostrar = etiquetaMostrar;
	}

	public JTextField getCampoNumero() {
		return campoNumero;
	}

	public void setCampoNumero(JTextField campoNumero) {
		this.campoNumero = campoNumero;
	}

	public JButton getBotonValidar() {
		return botonValidar;
	}

	public void setBotonValidar(JButton botonValidar) {
		this.botonValidar = botonValidar;
	}

}
