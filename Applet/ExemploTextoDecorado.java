package br.com.gt.appletwtf;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ExemploTextoDecorado extends JApplet {
	public void init() {
		setLayout(new FlowLayout());
		Font fontlbl = new Font("Arial", Font.ITALIC | Font.BOLD, 16);
		Color colorlbl = new Color(90, 30, 130);
		Color colorip = new Color(150, 0, 0);
		JLabel lbl = new JLabel("Nome:");
		lbl.setFont(fontlbl);
		lbl.setForeground(colorlbl);
		JTextField n = new JTextField(20);
		n.setForeground(colorip);
		JLabel lbl2 = new JLabel("Senha: ");
		lbl2.setFont(fontlbl);
		lbl2.setForeground(colorlbl);
		JPasswordField p = new JPasswordField(10);
		p.setForeground(colorip);
		ImageIcon iconOK = new ImageIcon("Ok.jpg");
		JButton b = new JButton("OK", iconOK);

		add(lbl);
		add(n);
		add(lbl2);
		add(p);
		add(b);

	}

}
