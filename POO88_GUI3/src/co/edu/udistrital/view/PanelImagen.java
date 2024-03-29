package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelImagen extends JPanel {

	private JLabel etiqueta;

	public PanelImagen() {
		setLayout(new FlowLayout());
		setBackground(new Color(35,196,128));
		setBorder(new TitledBorder("Imagen de la persona:"));
		inicializarComponentes();

		setVisible(true);
	}

	public void inicializarComponentes() {
		etiqueta = new JLabel();
		add(etiqueta);

	}

	public JLabel getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(JLabel etiqueta) {
		this.etiqueta = etiqueta;
	}

	public void cambiarImagen(String Elemento) {
		if (Elemento.equals("")) {
			etiqueta.setIcon(null);
		} else {
			ImageIcon imagenReal = new ImageIcon(getClass().getResource("/imagenes/" + Elemento + ".jpg"));
			ImageIcon imagenAjustada = new ImageIcon(imagenReal.getImage().getScaledInstance(this.getWidth() - 30,
					this.getHeight() - 30, Image.SCALE_DEFAULT));
			
		}
	}
}
