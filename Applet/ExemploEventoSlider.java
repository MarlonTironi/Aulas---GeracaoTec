package br.com.gt.appletwtf;

import java.awt.GridLayout;
import java.util.Hashtable;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ExemploEventoSlider extends JApplet implements ChangeListener{

	private JSlider sl1, sl2;
	
	public void init(){
		setLayout(new GridLayout(2,1));
		sl1 = new JSlider(0,10,3);
		sl1.setMajorTickSpacing(5);
		sl1.setMinorTickSpacing(1);
		sl1.setPaintLabels(true);
		sl1.setPaintTicks(true);
		sl1.addChangeListener(this);
		
		sl2 = new JSlider(0,10,7);
		Hashtable<Integer, JLabel> labels = new Hashtable<Integer, JLabel>();
		labels.put(new Integer(0), new JLabel("Zero"));
		labels.put(new Integer(10), new JLabel("Dez"));
		sl2.setLabelTable(labels);
		sl2.setPaintLabels(true);
		sl2.setPaintTicks(true);
		sl2.addChangeListener(this);
		add(sl1);
		add(sl2);
		
	}
	
	
	
	public void stateChanged(ChangeEvent e) {
		JSlider source = (JSlider)e.getSource();
		if(source.getValueIsAdjusting()) return;
		if(e.getSource() == sl1)sl2.setValue(10 - sl1.getValue());
		if(e.getSource() == sl2)sl1.setValue(10-sl2.getValue())
		;
	}

}
