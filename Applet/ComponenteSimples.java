package br.com.gt.appletwtf;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class ComponenteSimples extends JComponent{
	private int x1,x2;
	public ComponenteSimples(int x1, int x2){
		this.x1 = x1; 
		this.x2 = x2;
	}
	protected void paintComponent(Graphics g){
		float v = getWidth()*x1/(x1+x2);
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, (int)v, getHeight());
		g.setColor(Color.RED);
		g.fillRect((int)v, 0, getWidth(), getHeight());
	}
}
