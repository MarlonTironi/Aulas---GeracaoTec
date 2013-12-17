package br.com.gt.appletwtf;

import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ExemploHTMLComponentes extends JApplet{
	public void init(){
		setLayout(new GridLayout(2,1));
		JLabel lbl1= new JLabel("<html> Esta <i>applet</i> não faz nada interessante, mas é <b>muito</b> gay!</html>");
		JButton btn1 = new JButton("<html><center><i>Quando estiver Pronto...</i><br><font size=+2>Clique <font colo=\"#00A040\">OK</font></font></center></html>");
		add(lbl1);
		add(btn1);
		
	}

}
