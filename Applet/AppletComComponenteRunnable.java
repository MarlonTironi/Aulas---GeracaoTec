package br.com.gt.appletwtf;

import javax.swing.JApplet;

public class AppletComComponenteRunnable extends JApplet{
	public void init(){
		ComponenteRunnable c = new ComponenteRunnable();
		add(c);
	}

}
