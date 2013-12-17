package br.com.gt.appletwtf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;


public class AppletGraphic2DG2D extends JApplet{
	private int largura, altura;
	
	public void init(){
		largura = getWidth();
		altura = getHeight();
	}
	public void paint(Graphics g){
		Graphics g2d = (Graphics2D)g;
		g2d.setColor(Color.BLUE);
		g2d.drawLine(0, 0, largura, altura);
		g2d.drawLine(200, 0, 0, 200);
		g2d.drawLine(100, 0, 0, 100);
		g2d.drawLine(100, 0, 0, 100);
		g2d.drawLine(50, 0, 0, 50);
	}
}
