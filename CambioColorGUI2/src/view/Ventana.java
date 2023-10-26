package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	PanelArriba panel1;
	PanelAbajo panel2;
	
	public Ventana() {
		setTitle("TITULO");
		setSize(700, 600);
		// cerrar por completo sin dejar ningun registro
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// color de fondo
		getContentPane().setBackground(Color.gray);
		// null = manual
		getContentPane().setLayout(null);
		// el cuadro de maximizar a la izquierda de la x
		setResizable(false);
		// que se abra en el centro de la pantalla
		setLocationRelativeTo(null);
		setVisible(true);

		inicializarPaneles();
	}

	public void inicializarPaneles() {
		panel1 = new PanelArriba();
		panel1.setBounds(25, 25, 635, 300);
		getContentPane().add(panel1);
		
		panel2 = new PanelAbajo();
		panel2.setBounds(25, 340, 635, 200);
		getContentPane().add(panel2);
	}

	public PanelArriba getPanel1() {
		return panel1;
	}

	public void setPanel1(PanelArriba panel1) {
		this.panel1 = panel1;
	}

	public PanelAbajo getPanel2() {
		return panel2;
	}

	public void setPanel2(PanelAbajo panel2) {
		this.panel2 = panel2;
	}

	
}
