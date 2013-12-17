package br.com.gt.appletwtf;

import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JSlider;

import java.util.Hashtable;

public class ExemploSliders extends JApplet {
	public void init() {
		setLayout(new GridLayout(2, 1));
		JSlider sl1 = new JSlider(0, 10, 3);
		sl1.setMajorTickSpacing(5);
		sl1.setMinorTickSpacing(1);
		sl1.setPaintLabels(true);
		sl1.setPaintTicks(true);
		JSlider sl2 = new JSlider(0, 10, 3);
		Hashtable<Integer, JLabel> lbl = new Hashtable<Integer, JLabel>();
		lbl.put(new Integer(0), new JLabel("Zero"));
		lbl.put(new Integer(3), new JLabel("Três"));
		lbl.put(new Integer(5), new JLabel("Cinco"));
		lbl.put(new Integer(10), new JLabel("Dez"));
		sl2.setLabelTable(lbl);
		sl2.setPaintLabels(true);
		sl2.setPaintTicks(true);
		add(sl1);
		add(sl2);
	}
}