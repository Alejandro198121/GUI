package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel {

	private JLabel eBlanco;
	private JLabel eNombre1;
	private JLabel eNombre2;
	private JLabel eCiudad1;
	private JLabel eCiudad2;
	private JLabel eTelefono1;
	private JLabel eTelefono2;
	private JLabel eMail1;
	private JLabel eMail2;

	public PanelResultados() {
		setLayout(new GridLayout(8, 2));
		setBackground(Color.pink);
		setBorder(new TitledBorder("Modulo de informacion"));
		setPreferredSize(new Dimension(300, 300));
		inicializarComponentes();

		setVisible(true);
	}

	public void inicializarComponentes() {
		
		eBlanco = new JLabel();
		add(eBlanco);
		
		eBlanco = new JLabel();
		add(eBlanco);
		
		eBlanco = new JLabel();
		add(eBlanco);
		
		eBlanco = new JLabel();
		add(eBlanco);
		
		eNombre1 = new JLabel("Nombre:");
		add(eNombre1);
		
		eNombre2 = new JLabel();
		add(eNombre2);
		
		eCiudad1 = new JLabel("Ciudad: ");
		add(eCiudad1);
		
		eCiudad2= new JLabel();
		add(eCiudad2);
		
		eTelefono1 = new JLabel("Telefono: ");
		add(eTelefono1);
		
		eTelefono2 = new JLabel();
		add(eTelefono2);
		
		eMail1 = new JLabel("Mail: ");
		add(eMail1);
		
		eMail2 = new JLabel();
		add(eMail2);
	
		eBlanco = new JLabel();
		add(eBlanco);
		
		eBlanco = new JLabel();
		add(eBlanco);
		
		eBlanco = new JLabel();
		add(eBlanco);
		
		eBlanco = new JLabel();
		add(eBlanco);
		
	}

	public JLabel geteBlanco() {
		return eBlanco;
	}

	public void seteBlanco(JLabel eBlanco) {
		this.eBlanco = eBlanco;
	}

	public JLabel geteNombre1() {
		return eNombre1;
	}

	public void seteNombre1(JLabel eNombre1) {
		this.eNombre1 = eNombre1;
	}

	public JLabel geteNombre2() {
		return eNombre2;
	}

	public void seteNombre2(JLabel eNombre2) {
		this.eNombre2 = eNombre2;
	}

	public JLabel geteCiudad1() {
		return eCiudad1;
	}

	public void seteCiudad1(JLabel eCiudad1) {
		this.eCiudad1 = eCiudad1;
	}

	public JLabel geteCiudad2() {
		return eCiudad2;
	}

	public void seteCiudad2(JLabel eCiudad2) {
		this.eCiudad2 = eCiudad2;
	}

	public JLabel geteTelefono1() {
		return eTelefono1;
	}

	public void seteTelefono1(JLabel eTelefono1) {
		this.eTelefono1 = eTelefono1;
	}

	public JLabel geteTelefono2() {
		return eTelefono2;
	}

	public void seteTelefono2(JLabel eTelefono2) {
		this.eTelefono2 = eTelefono2;
	}

	public JLabel geteMail1() {
		return eMail1;
	}

	public void seteMail1(JLabel eMail1) {
		this.eMail1 = eMail1;
	}

	public JLabel geteMail2() {
		return eMail2;
	}

	public void seteMail2(JLabel eMail2) {
		this.eMail2 = eMail2;
	}
	
}