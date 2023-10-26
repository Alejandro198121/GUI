package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAbajo extends JPanel{

	private JLabel ePideNumero;
	private JLabel eTitulo;
	private JTextField cNumero;
	private JButton bCalcular;
	private JLabel eMostrar;
	
	public PanelAbajo() {
		setLayout(null);
		setBackground(Color.BLUE);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes(){
		ePideNumero = new JLabel("Ingrese el numero:");
		ePideNumero.setBounds(80, 10, 150, 100);
		ePideNumero.setForeground(Color.cyan);
		add(ePideNumero);
		
		eTitulo = new JLabel("CALCULAR MULTIPLOS DE 0 a 100");
		eTitulo.setBounds(200, 0, 300, 50);
		eTitulo.setForeground(Color.white);
		add(eTitulo);
		
		/*
		cNumero = new JTextField();
		cNumero.setBounds(200, 0, 300, 50);
		cNumero.setHorizontalAlignment(JTextField.CENTER);
		add(cNumero);
		*/
		
		bCalcular = new JButton("Calcular");
		bCalcular.setBackground(Color.black);
		bCalcular.setForeground(Color.orange);
		bCalcular.setBounds(350, 50, 100, 30);
		
		bCalcular.setActionCommand("VALIDAR");
		add(bCalcular);
		
		eMostrar = new JLabel();
		eMostrar.setBounds(200, 100, 300, 100);
		eMostrar.setForeground(Color.MAGENTA);
		add(eMostrar);
		
	}

	public JLabel getePideNumero() {
		return ePideNumero;
	}

	public void setePideNumero(JLabel ePideNumero) {
		this.ePideNumero = ePideNumero;
	}

	public JLabel geteTitulo() {
		return eTitulo;
	}

	public void seteTitulo(JLabel eTitulo) {
		this.eTitulo = eTitulo;
	}

	public JTextField getcNumero() {
		return cNumero;
	}

	public void setcNumero(JTextField cNumero) {
		this.cNumero = cNumero;
	}

	public JButton getbCalcular() {
		return bCalcular;
	}

	public void setbCalcular(JButton bCalcular) {
		this.bCalcular = bCalcular;
	}

	public JLabel geteMostrar() {
		return eMostrar;
	}

	public void seteMostrar(JLabel eMostrar) {
		this.eMostrar = eMostrar;
	}
	
}
