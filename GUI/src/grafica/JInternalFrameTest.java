package grafica;

import javax.swing.*;

public class JInternalFrameTest {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("JInternalFrameTest");
		f.getContentPane().setLayout(null);
		f.setSize(230, 200);
		JInternalFrame f1 = new JInternalFrame("InternalFrame 1");
		f1.setBounds(10, 10, 150, 100);
		f1.setVisible(true);
		JInternalFrame f2 = new JInternalFrame("InternalFrame 2");
		
		f2.setBounds(200, 10, 150, 100);
		// (eje x, eje y, ancho, alto)
		
		f2.setVisible(true);
		f.getContentPane().add(f2);
		f.getContentPane().add(f1);
		f.setVisible(true);
	}
}
