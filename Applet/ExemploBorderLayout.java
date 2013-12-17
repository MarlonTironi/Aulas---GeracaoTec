package br.com.gt.appletwtf;

import java.awt.BorderLayout;

import javax.swing.JApplet;
import javax.swing.JButton;

public class ExemploBorderLayout extends JApplet{
	public void init() {
		setLayout(new BorderLayout());
		add(new JButton("Norte"), BorderLayout.NORTH);
		add(new JButton("Sul"), BorderLayout.SOUTH);
		add(new JButton("Leste"), BorderLayout.EAST);
		add(new JButton("Oeste"), BorderLayout.WEST);
		add(new JButton("Centro"), BorderLayout.CENTER);
	}

}
