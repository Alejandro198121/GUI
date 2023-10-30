package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{

	private JLabel eGenero;
	private JLabel eNombre;
	private JComboBox<String> Lista_genero;
	private JComboBox<String> Lista_nombres;
	
	
	public PanelDatos() {
		setLayout(new GridLayout(1, 4));
		setBackground(new Color(142, 214, 211));
		setBorder(new TitledBorder("Modulo de datos "));
		setPreferredSize(new Dimension(800,80));
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		eGenero = new JLabel("Genero a buscar:");
		add(eGenero);
		
		Lista_genero = new JComboBox<String>();
		Lista_genero.addItem("Femenino");
		Lista_genero.addItem("Masculino");
		Lista_genero.setActionCommand("LISTA1");
		add(Lista_genero);
		
		eNombre = new JLabel(" Nombres:");
		add(eNombre);
		
		Lista_nombres = new JComboBox<String>();
		Lista_nombres.setActionCommand("LISTA2");
		add(Lista_nombres);
	}

	public JLabel geteGenero() {
		return eGenero;
	}

	public void seteGenero(JLabel eGenero) {
		this.eGenero = eGenero;
	}

	public JLabel geteNombre() {
		return eNombre;
	}

	public void seteNombre(JLabel eNombre) {
		this.eNombre = eNombre;
	}

	public JComboBox<String> getLista_genero() {
		return Lista_genero;
	}

	public void setLista_genero(JComboBox<String> lista_genero) {
		Lista_genero = lista_genero;
	}

	public JComboBox<String> getLista_nombres() {
		return Lista_nombres;
	}

	public void setLista_nombres(JComboBox<String> lista_nombres) {
		Lista_nombres = lista_nombres;
	}

}