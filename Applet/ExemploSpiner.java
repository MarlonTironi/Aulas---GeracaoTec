package br.com.gt.appletwtf;

import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

public class ExemploSpiner extends JApplet {
	public void init() {
		setLayout(new FlowLayout());
		Integer[] dias = new Integer[31];
		for (int i = 0; i < dias.length; i++)
			dias[i] = new Integer(i + 1);
		SpinnerListModel modeloDia = new SpinnerListModel(dias);
		JSpinner dia = new JSpinner(modeloDia);
		String[] meses = { "jan", "fev", "mar", "abr", "jun", "jul", "ago",
				"set", "out", "nov", "dez" };
		SpinnerListModel modeloMes = new SpinnerListModel(meses);
		JSpinner mes = new JSpinner(modeloMes);
		Integer[] anos = new Integer[105];
		for (int j = 0; j < anos.length; j++)
			anos[j] = new Integer(j + 1900);
		SpinnerListModel modeloAno = new SpinnerListModel(anos);
		JSpinner ano = new JSpinner(modeloAno);
		ano.setValue(new Integer(1960));
		add(dia);
		add(mes);
		add(ano);

	}
}
