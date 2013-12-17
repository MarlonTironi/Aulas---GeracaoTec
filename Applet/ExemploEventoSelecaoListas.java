package br.com.gt.appletwtf;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ExemploEventoSelecaoListas extends JApplet implements ListSelectionListener, ItemListener, ActionListener{

	private JComboBox combo;
	private JList list;
	private JButton obter;
	private JLabel label;
	
	public void init(){
		String[] op = {"Vermelho", "Verde", "Azul", "Amarelo"};
		combo =new JComboBox<>(op);
		combo.setEditable(true);
		list = new JList(op);
		list.addListSelectionListener(this);
		obter= new JButton("Obter");
		obter.addActionListener(this);
		label = new JLabel("Selecionou algo.");
		add(combo, BorderLayout.CENTER);
		add(new JScrollPane(list), BorderLayout.EAST);
		add(obter, BorderLayout.NORTH);
		add(label, BorderLayout.SOUTH);
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == combo)label.setText("ComboBox: Selecionou novo "+combo.getSelectedItem());
		if(e.getSource() == obter)label.setText("Lista: Selecionou novo "+list.getSelectedValue()+" "+combo.getSelectedItem());

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		label.setText("Combo box selecionou: "+ combo.getSelectedItem());
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		label.setText("Lista: Selecionou "+list.getSelectedValue());
	}

}
