package br.com.gt.appletwtf;

import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ExemploListas extends JApplet{
	public void init(){
		setLayout(new GridLayout(1,3));
		String[] op =  {"Vermelho", "Verde","Azul","Amarelo"};
		JComboBox cb1 = new JComboBox(op);
		cb1.setEditable(false);
		JComboBox cb2 = new JComboBox(op);
		cb1.setEditable(true);
		JList list1 = new JList(op);
		add(cb1);
		add(cb2);
		add(new JScrollPane(list1));
		
		
	}
}
