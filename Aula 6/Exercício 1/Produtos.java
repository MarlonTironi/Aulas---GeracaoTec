package br.com.sc.geracaotec.aula6;

import java.util.Scanner;

public class Produtos {
	int codigo;
	String desc, status;
	double preco;
	
	
	public Produtos() {
	}
	
	public void alterar(){
		System.out.println(codigo);
		System.out.println(desc);
		System.out.println(preco);
		status = "Alterado com sucesso";
	
		}
	public void excluir(){
		status = "Excluido com sucesso";
		
	}
	public void incluir(){
		status = "Incluido com sucesso";
	}

}
