package br.com.gt.appletwtf;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class ComponenteRunnable extends JComponent implements Runnable{

	private int x = 0;
	private Thread tt;
	
	public ComponenteRunnable(){
		tt = new Thread(this);
		tt.start();
	}
	protected void paintComponent(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.RED);
		g.drawLine(x, 0, x, getHeight());
	}
	public void run(){
		Thread t = Thread.currentThread();
		while ( t == tt){
			x++; 
			if(x>getWidth()) x = 0;
			repaint();
		}
	}
}
