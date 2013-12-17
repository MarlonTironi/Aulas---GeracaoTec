package br.curso.aula12.negocios;

import java.sql.*;

import br.curso.aula12.usuarios.CadastroDeCursos;

public class Conexao {

	public static String status = "";

	public static Connection getConnection() {
		Connection con = null;
		try {
			// Class.forName("Com.mysql.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://127.0.0.1/cursos?user=root&password=486259mt";
			con = DriverManager.getConnection(url);
			status = "Conexão aberta";
		} catch (Exception e) {
			status = e.getMessage();
		}
		return con;
	}

}
