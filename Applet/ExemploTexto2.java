package br.com.gt.appletwtf;

import java.awt.BorderLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ExemploTexto2 extends JApplet{
	public void init(){
		setLayout(new BorderLayout());
		JLabel lbl = new JLabel("Digite algo a baixo");
		JTextArea ta = new JTextArea(5,50);
		JButton b = new JButton("OK");
		add(lbl, BorderLayout.NORTH);
		add(new JScrollPane(ta), BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		
	}

}
