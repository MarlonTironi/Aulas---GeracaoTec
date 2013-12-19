package br.com.gt.appletwtf;

import java.awt.GridLayout;

import javax.swing.JApplet;

public class AppletComComponenteComTimer extends JApplet{
	public void init(){
		setLayout(new GridLayout(2,2));
		ComponenteComTimer c1,c2,c3,c4;
		c1 = new ComponenteComTimer(10);
		c2 = new ComponenteComTimer(10);
		c3 = new ComponenteComTimer(10);
		c4 = new ComponenteComTimer(10);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
	}

}
