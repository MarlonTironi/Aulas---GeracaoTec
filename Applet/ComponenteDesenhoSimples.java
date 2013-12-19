package br.com.gt.appletwtf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JComponent;

public class ComponenteDesenhoSimples extends JComponent implements
		MouseListener, MouseMotionListener {

	private ArrayList<Point> pontos;
	private int size = 8;
	private int halfsize = size / 2;

	public ComponenteDesenhoSimples() {
		pontos = new ArrayList<Point>(1024);
	}

	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.WHITE);
		g2d.fillRect(0, 0, getWidth(), getHeight());
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.BLUE);
		for (Point p : pontos) {
			g2d.fillOval(p.x - halfsize, p.y - halfsize, size, size);
		}
	}
	public void mouseDragged(MouseEvent e) {
		pontos.add(e.getPoint());
		repaint();
	}
	public void mousePressed(MouseEvent e) {
		pontos.add(e.getPoint());
		repaint();
	}
	public void mouseMoved(MouseEvent arg0) {
	}
	public void mouseClicked(MouseEvent arg0) {
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
