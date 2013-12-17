package br.com.gt.appletwtf;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextField;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import sun.print.BackgroundLookupListener;

public class PrimeiroApplet extends JApplet{
	private static final long serialVersionUID =1L;
	String text;
	public void init() {
		  text = "Curso Java!!!";
		  setBackground(Color.GREEN);
	}
	public void stop(){
		System.out.println("Parando....");
	}
	public void start() {
		System.out.println("Iniciando...");
	}
	public void destroy(){
		System.out.println("Descarregando...");
	}
	public void paint (Graphics g){
		System.out.println("Paint");
		g.setColor(Color.BLUE);
		g.drawRect(0,0, getSize().width-1, getSize().height -1);
		g.setColor(Color.BLACK);
		g.drawString(text, 15, 25);
	}
	
}
