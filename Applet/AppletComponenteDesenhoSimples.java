package br.com.gt.appletwtf;

import javax.swing.JApplet;

public class AppletComponenteDesenhoSimples extends JApplet{
	private ComponenteDesenhoSimples c;
	
	public void init(){
		c = new ComponenteDesenhoSimples();
		c.addMouseListener(c);
		c.addMouseMotionListener(c);
		add(c);
		
	}

}
