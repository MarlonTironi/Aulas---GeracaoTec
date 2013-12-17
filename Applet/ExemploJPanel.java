package br.com.gt.appletwtf;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ExemploJPanel extends JApplet{
	public void init(){
		setLayout(new BorderLayout());
		JPanel painel = new JPanel(new GridLayout(5,2));
		for (int i = 0; i<10;i++)
			painel.add(new JButton(""+(char)('a'+i)));
		add(new JLabel("Menu"), BorderLayout.NORTH);
		add(new JLabel("Status"), BorderLayout.SOUTH);
		add(painel, BorderLayout.WEST);
		add(new JTextArea(10,30), BorderLayout.CENTER);
	}
}
