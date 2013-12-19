package br.com.gt.appletwtf;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExemploEventoAcao extends JApplet implements ActionListener {

	private JTextField entrada;
	private JLabel saida;
	private JButton alterar, limpar;

	public void init() {
		setLayout(new GridLayout(1, 4));
		entrada = new JTextField(15);
		entrada.addActionListener(this);
		saida = new JLabel();
		alterar = new JButton("Alterar");
		alterar.addActionListener(this);
		limpar = new JButton("Limpar");
		limpar.addActionListener(this);
		add(entrada);
		add(saida);
		add(alterar);
		add(limpar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ((e.getSource() == entrada) || (e.getSource() == alterar))
			saida.setText(entrada.getText());
		if(e.getSource() == limpar){
			entrada.setText("    ");
			saida.setText("   ");
		}
	}

}
