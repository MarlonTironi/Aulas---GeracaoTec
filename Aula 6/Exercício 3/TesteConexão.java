package br.com.sc.geracaotec.aula6;

public class TesteConexão {
	
	public static void main (String args[]){
		
		Conexao a = new Conexao();
		System.out.println(a.status);
		Conexao b = new Conexao("MySQL");
		System.out.println(b.status);
		Conexao c = new Conexao("MySQL", "admin");
		System.out.println(c.status);
	}
}
