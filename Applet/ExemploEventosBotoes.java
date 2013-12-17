package br.com.gt.appletwtf;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class ExemploEventosBotoes extends JApplet implements ItemListener, ActionListener{
	private JRadioButton btnP, btnM, btnG;
	private JCheckBox chbP;
	private JButton btnOk;
	private JLabel lblS;
	
	public void init(){
		setLayout(new GridLayout(6,1));
		btnP = new JRadioButton("Pequeno", false);
		btnP.addItemListener(this);
		btnM = new JRadioButton("Médio", true);
		btnM.addItemListener(this);
		btnG = new JRadioButton("Grande", false);
		btnG.addItemListener(this);
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(btnP);
		grupo.add(btnM);
		grupo.add(btnG);
		chbP = new JCheckBox("Preenchido", true);
		chbP.addActionListener(this);
		btnOk = new JButton("OK");
		btnOk.addActionListener(this);
		lblS = new JLabel("");
		add(btnP);
		add(btnM);
		add(btnG);
		add(chbP);
		add(btnOk);
		add(lblS);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== btnOk) lblS.setText("Botão OK");
		if(e.getSource()== chbP) lblS.setText("Preenchido?"+chbP.isSelected());
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (btnP.isSelected()) lblS.setText("Pequeno");
		if (btnM.isSelected()) lblS.setText("Médio");
		if (btnG.isSelected()) lblS.setText("Grande");
	}
	

}
