package co.edu.udistrital.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.udistrital.model.Operaciones;
import co.edu.udistrital.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaPrincipal vista;

	public Controller() {
		vista = new VentanaPrincipal();
		asignarOyentes();
	}

	public void asignarOyentes() {
		vista.getPd().getBsumar().addActionListener(this);
		vista.getPd().getBrestar().addActionListener(this);
		vista.getPd().getBmultiplicar().addActionListener(this);
		vista.getPd().getBdividir().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		try {
			int x = leerPrimerNumero();
		} catch (NumberFormatException a) {
			vista.getPd().getCnum1().setText("");
			vista.getPr().getResultados().setText("ERROR");
			JOptionPane.showMessageDialog(null, "El valor de N1 no es valido", "Error", JOptionPane.ERROR_MESSAGE);
		}

		try {
			int y = leerSegundoNumero();
		} catch (NumberFormatException a) {
			vista.getPd().getCnum2().setText("");
			vista.getPr().getResultados().setText("ERROR");
			JOptionPane.showMessageDialog(null, "El valor de N2 no es valido", "Error", JOptionPane.ERROR_MESSAGE);
		}

		int x = 0;
		int y = 0;
		String acum = vista.getPr().getResultados().getText();

		if (vista.getPd().getCnum2().getText().equals("") && vista.getPd().getCnum1().getText().equals("")) {
			vista.getPr().getResultados().setText("ERROR");
		}

		if (vista.getPr().getResultados().getText().equals("ERROR")) {
			vista.getPr().getResultados().setText("");
		} else {
			if (comando.equals("SUMAR")) {
				vista.getPr().getResultados().setText(acum + x + " + " + y + " = " + Operaciones.sumar(x, y) + "\n");
			} else if (comando.equals("RESTAR")) {
				vista.getPr().getResultados().setText(acum + x + " - " + y + " = " + Operaciones.restar(x, y) + "\n");
			} else if (comando.equals("MULTIPLICAR")) {
				vista.getPr().getResultados()
						.setText(acum + x + " * " + y + " = " + Operaciones.multiplicar(x, y) + "\n");
			} else if (comando.equals("DIVIDIR")) {
				vista.getPr().getResultados().setText(acum + x + " / " + y + " = " + Operaciones.dividir(x, y) + "\n");
			}
		}
	}

	public int leerPrimerNumero() {
		String aux = vista.getPd().getCnum1().getText();
		int n = Integer.parseInt(aux);
		return n;
	}

	public int leerSegundoNumero() {
		String aux = vista.getPd().getCnum2().getText();
		int n = Integer.parseInt(aux);
		return n;
	}

}
