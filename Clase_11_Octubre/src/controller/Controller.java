package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Numero;
import view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaPrincipal vista;

	public Controller() {
		vista = new VentanaPrincipal();
		asignarOyentes();
	}

	public void asignarOyentes() {
		// addActionListener(this) es el sensor
		vista.getPanel().getBotonValidar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("VALIDAR")) {
			// capturo el texto
			String aux1 = vista.getPanel().getCampoNumero().getText();
			// convierto lo capturado a numero int
			Numero num = null;
			try {
				int aux2 = Integer.parseInt(aux1);
				num = new Numero(aux2);
			} catch (NumberFormatException a) {
				vista.getPanel().getCampoNumero().setText("");
				vista.getPanel().getEtiquetaMostrar().setText("ERROR");
				JOptionPane.showMessageDialog(null, "no muy bruto", "error", JOptionPane.ERROR_MESSAGE);
			}

			if (num.esPar()) {
				vista.getPanel().getEtiquetaMostrar().setText("ES PAR!");
			} else {
				vista.getPanel().getEtiquetaMostrar().setText("NO ES PAR :(");
			}

		}

	}

}
