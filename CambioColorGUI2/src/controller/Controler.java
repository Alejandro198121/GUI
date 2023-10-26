package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Numero;
import view.Ventana;

public class Controler implements ActionListener{

	private Ventana vista;

	public Controler() {
		vista = new Ventana();
		asignarOyentes();
	}

	public void asignarOyentes() {
		vista.getPanel2().getbCalcular().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("VALIDAR")) {
	/*		
			String aux1 = vista.getPanel2().getcNumero().getText();
			int aux2 = Integer.parseInt(aux1);
			Numero num = new Numero(aux2);

			vista.getPanel2().geteMostrar().setText(num.mostrarMultiplos(num.multiplos()));
*/		
			vista.getPanel2().geteMostrar().setText("el boton funciona");
		}
	}
}
