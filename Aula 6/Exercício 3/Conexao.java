package br.com.sc.geracaotec.aula6;
import java.sql.Connection;

public class Conexao {
	public String status;
	
	public Conexao(){
		this.status = "Conex�o.";
	}
	
	public Conexao(String Database){
		this.status = "Conex�o efetuada com " + Database+".";
	}
	
	public Conexao(String Database, String User){
		this.status = "Conex�o efetuada com "+ Database + ". Usu�rio: " + User;
	}
	

		
	
}
