package br.com.gt.appletwtf;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ExemploBotoes extends JApplet{
	public void init(){
	setLayout(new GridLayout(5,1));
	JRadioButton peq = new JRadioButton("Pequeno", false);
	JRadioButton med = new JRadioButton("Medio", true);
	JRadioButton gde = new JRadioButton("Grande", false);
	ButtonGroup grupo = new ButtonGroup();
	grupo.add(peq);
	grupo.add(med);
	grupo.add(gde);
	JCheckBox preenchido = new JCheckBox("Preenchido", true);
	JButton ok = new JButton("OK");
	add(peq);
	add(med);
	add(gde);
	add(preenchido);
	add(ok);
	}
}
