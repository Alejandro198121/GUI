package grafica;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxTest {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("JComboBoxTest");
		f.setSize(300, 150);
		f.getContentPane().setLayout(new FlowLayout());
		
		String[] list = { "Rojo", "Amarillo", "Blanco" };
		JComboBox c = new JComboBox(list);
		f.getContentPane().add(c);
		f.setVisible(true);
	}
}
