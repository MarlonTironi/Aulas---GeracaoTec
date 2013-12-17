package br.com.gt.appletwtf;

import javax.swing.JApplet;

public class AppletComComponente extends JApplet{
	private ComponenteSimples r;
	
	public void init(){
		r = new ComponenteSimples(75, 25);
		add(r);
	}
	

}
