package br.com.sc.geracaotec.aula6;
import java.sql.Connection;

public class Conexao {
	public String status;
	
	public Conexao(){
		this.status = "Conexão.";
	}
	
	public Conexao(String Database){
		this.status = "Conexão efetuada com " + Database+".";
	}
	
	public Conexao(String Database, String User){
		this.status = "Conexão efetuada com "+ Database + ". Usuário: " + User;
	}
	

		
	
}
