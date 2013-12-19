package br.com.gt.appletwtf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.Timer;

public class ComponenteComTimer extends JComponent implements ActionListener {

	private Color c;
	private Timer timer;

	public ComponenteComTimer(int delay) {
		timer = new Timer(delay, this);
		timer.setCoalesce(true);
		timer.start();
	}

	protected void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(c);
		g.fillArc(0, 0, getWidth(), getHeight(), 0, 360);
	}

	public void actionPerformed(ActionEvent e) {
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		c = new Color(r,g,b);
		repaint();
	}

}
