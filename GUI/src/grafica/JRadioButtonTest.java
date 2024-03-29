package grafica;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonTest {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("JRadioButtonTest");
		f.setSize(300, 150);
		f.getContentPane().setLayout(new FlowLayout());
		//crea el grupo de botones
		ButtonGroup bg = new ButtonGroup();
		//crea botones de seleccion o JRadioButton
		JRadioButton c1 = new JRadioButton("Hombre", true);
		JRadioButton c2 = new JRadioButton("Mujer", false);
		//añade los seleccionables al grupo
		bg.add(c1);
		bg.add(c2);
		//añade los botones al panel
		f.getContentPane().add(c1);
		f.getContentPane().add(c2);
		f.setVisible(true);
	}
}
