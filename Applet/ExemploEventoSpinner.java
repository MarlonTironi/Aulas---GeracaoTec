package br.com.gt.appletwtf;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Calendar;

import javax.swing.JApplet;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ExemploEventoSpinner extends JApplet implements ChangeListener{

	private JSpinner dia, mes, ano;
	private String[] meses = { "jan", "fev", "mar", "abr", "jun", "jul", "ago",
			"set", "out", "nov", "dez" };
	public void init(){
		setLayout (new FlowLayout());
		Integer[] dias = new Integer[31];
		for(int i =0; i<dias.length; i++)
			dias[i] = new Integer(i+1);
		SpinnerListModel modeloDia = new SpinnerListModel(dias);
		dia = new JSpinner(modeloDia);
		dia.addChangeListener(this);
		add(dia);
		SpinnerListModel modeloMes = new SpinnerListModel(meses);
		mes = new JSpinner(modeloMes);
		mes.addChangeListener(this);
		add(mes);
		Integer[] anos = new Integer[105];
		for(int i=0; i < anos.length; i++)
			anos[i] = new Integer(i+1900);
		SpinnerListModel modeloAno = new SpinnerListModel(anos);
		ano = new JSpinner(modeloAno);
		ano.setValue(new Integer(1960));
		ano.addChangeListener(this);
		add(ano);
		
	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		int dd = (Integer)(dia.getValue());
		String temp = (String)mes.getValue();
		int mm = 0;
		for(mm = 0; mm<12; mm++)
			if(temp.equals(meses[mm])) break;
		int aa= (Integer)(ano.getValue());
		Calendar c = Calendar.getInstance();
		c.clear();
		c.setLenient(false);
		c.set(Calendar.DAY_OF_MONTH, dd);
		c.set(Calendar.MONTH, mm);
		c.set(Calendar.YEAR, aa);
		try{ 
			c.getTime();
			
		}catch(Exception exc){
			getContentPane().setBackground(Color.DARK_GRAY);
			repaint();
		}
	}

}
