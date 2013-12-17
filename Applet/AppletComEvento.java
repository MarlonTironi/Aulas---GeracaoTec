package br.com.gt.appletwtf;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;

public class AppletComEvento extends JApplet implements ActionListener{
	private JButton btnPreto, btnCinza, btnAleat;
	private JLabel lblMain;
	public void init(){
		setLayout(new FlowLayout());
		btnPreto = new JButton("P&B");
		btnPreto.addActionListener(this);
		btnCinza = new JButton("Cinza");
		btnCinza.addActionListener(this);
		btnAleat = new JButton("Aleatório");
		btnAleat.addActionListener(this);
		lblMain = new JLabel("Camaleão");
		lblMain.setOpaque(true);
		add(btnPreto);
		add(btnCinza);
		add(btnAleat);
		add(lblMain);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnPreto){
			lblMain.setForeground(Color.WHITE);
			lblMain.setBackground(Color.BLACK);
		}
		if(e.getSource() == btnCinza){
			lblMain.setForeground(Color.WHITE);
			lblMain.setBackground(Color.GRAY);
		}
		if(e.getSource() == btnAleat){
			int r1 = (int)(Math.random()*256);
			int g1 = (int)(Math.random()*256);
			int b1 = (int)(Math.random()*256);
			lblMain.setForeground(new Color(r1,g1,b1));
			int r2 = (int)(Math.random()*256);
			int g2 = (int)(Math.random()*256);
			int b2 = (int)(Math.random()*256);
			lblMain.setBackground(new Color(r2,g2,b2));
		}
	}

}
