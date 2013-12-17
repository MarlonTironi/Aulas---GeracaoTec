package br.com.gt.appletwtf;

import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ExemploTexto1 extends JApplet {
	public void init() {
		setLayout(new FlowLayout());
		JLabel l1 = new JLabel("Nome");
		JTextField n = new JTextField(20);
		JLabel l2 = new JLabel("Senha");
		JPasswordField p = new JPasswordField(10);
		JButton b = new JButton("OK");
		add(l1);
		add(n);
		add(l2);
		add(p);
		add(b);

	}

}
