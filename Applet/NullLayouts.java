package br.com.gt.appletwtf;

import javax.swing.JApplet;
import javax.swing.JButton;

public class NullLayouts extends JApplet{
	public void init(){
		setLayout(null);
		JButton b1 = new JButton("Curto");
		JButton b2 = new JButton("Comprido");
		JButton b3 = new JButton("Maior");
		
		b1.setBounds(0, 0, 90, 40);
		b2.setBounds(90, 0, 400, 40);
		b3.setBounds(0, 50, 550, 80);
		add(b1);
		add(b2);
		add(b3);
	}

}
