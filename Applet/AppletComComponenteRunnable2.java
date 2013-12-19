package br.com.gt.appletwtf;

import java.awt.GridLayout;

import javax.swing.JApplet;

public class AppletComComponenteRunnable2 extends JApplet{
	
	public void init(){
		setLayout(new GridLayout(3,1));
		ComponenteRunnable2 c1,c2,c3;
		c1 = new ComponenteRunnable2(10);
		c2 = new ComponenteRunnable2(100);
		c3 = new ComponenteRunnable2(1000);
		add(c1);
		add(c2);
		add(c3);
	
	
	}

}
