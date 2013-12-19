package br.com.gt.appletwtf;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class ComponenteRunnable2 extends JComponent implements Runnable {

	private int x = 0;
	private long pause;
	private Thread tt;

	public ComponenteRunnable2(long p) {
		tt = new Thread(this);
		tt.start();
		pause = p;
	}

	protected void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.RED);
		g.drawLine(x, 0, x, getHeight());
	}

	public void run() {
		Thread t = Thread.currentThread();
		while (t == tt) {
			x++;
			if (x > getWidth())
				x = 0;
			repaint();
			try {
				Thread.sleep(pause);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
