package br.com.gt.appletwtf;

import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JButton;

public class ExGrid extends JApplet{
	public void init(){
		setLayout(new GridLayout(5,3));
		for(int l = 0; l < 5; l++)
			for(int c = 0; c < 10; c++)
				add(new JButton( (l) +""+ (c) ));
	}
}
