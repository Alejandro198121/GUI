package view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelArriba extends JPanel{

	JLabel eTitulo;
	JTextField campo;
	
	public PanelArriba() {
		setLayout(null);
		setBackground(Color.CYAN);
		inicializarVariables();
		setVisible(true);
	}
	
	public void inicializarVariables(){
		eTitulo = new JLabel("hola");
		eTitulo.setBounds(80, 10, 150, 100);
		eTitulo.setForeground(Color.black);
		add(eTitulo);
		
		/*
		campo = new JTextField();
		campo.setBounds(80, 10, 150, 100);
		campo.setHorizontalAlignment(JTextField.CENTER);
		add(campo);
		*/
	}
}
