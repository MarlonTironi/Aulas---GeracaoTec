package br.com.gt.appletwtf;


	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import javax.swing.JApplet;

	public class AppletGraphics2D extends JApplet{
		
		    public void paint(Graphics g){
		        Graphics2D g2d = (Graphics2D)g;
		        g2d.setColor(Color.blue);
		        g2d.drawString("Olá, Mundo", 5, 15);
		    }
}
