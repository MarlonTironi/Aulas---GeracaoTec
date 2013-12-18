package br.curso.aula12.metodos;

import java.sql.*;

import br.curso.aula12.negocios.Conexao;

public class MetodosImplementados extends Conexao {

	private Statement consulta;
	private ResultSet retorno;
	private Connection con;
	private String codigo, curso, preco;
	public String status;

	public MetodosImplementados() {
	}

	public MetodosImplementados(String codigo, String curso, String preco) {
		this.codigo = codigo;
		this.curso = curso;
		this.preco = preco;
	}

	String getCodigo() {
		return codigo;
	}

	void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCurso() {
		return curso;
	}

	void setCurso(String curso) {
		this.curso = curso;
	}

	public String getPreco() {
		return preco;
	}

	void setPreco(String preco) {
		this.preco = preco;
	}

	public String alterar(String codigo, String curso, String preco) {
		try {
			consulta = Conexao.getConnection().createStatement();
			String comando = "UPDATE cursos.cursos SET curso ='" + curso
					+ "', preco ='" + preco + "' WHERE idcurso ='" + codigo
					+ "'";
			consulta.executeUpdate(comando);
			status = "Alterado com sucesso!!";
		} catch (Exception e) {
			status = "Erro ao Alterar";
		}
		return status;
	}

	public String buscar(String codigo) {
		try {
			consulta = Conexao.getConnection().createStatement();
			String comando = "select * from cursos.cursos where idcurso = "
					+ codigo;
			retorno = consulta.executeQuery(comando);
			retorno.next();
			String aux;
			int op = retorno.getInt("idcurso");
			if (op != 0) {
				aux = (retorno.getString("curso"));
				System.out.println("Testando " + aux);
				setCurso(aux);
				aux = (retorno.getString("preco"));
				System.out.println("Testando " + aux);
				setPreco(aux);
				status = "Busca completa.";
			} else {
				status = "Código não encontrado ";
			}
		} catch (Exception e) {
			status = "Código não encontrado";
			setCurso("  ");
			setPreco("  ");
		}
		return status;
	}

	public String incluir(String codigo, String curso, String preco) {
		try {
			Statement consulta = Conexao.getConnection().createStatement();
			String comando = "insert into cursos(idcurso, curso, preco) values ("
					+ "'"
					+ codigo
					+ "',"
					+ "'"
					+ curso
					+ "',"
					+ "'"
					+ preco
					+ "');";
			consulta.executeUpdate(comando);
			status = "Incluido com sucesso.";
			consulta.close();
		} catch (Exception e) {
			status = "Código não encontrado " + e.getMessage();
		}
		return status;
	}

	public String excluir(String codigo) {
		try {
			Statement consulta = Conexao.getConnection().createStatement();
			String comando = "DELETE FROM cursos.cursos WHERE idcurso = "
					+ codigo;
			consulta.executeUpdate(comando);
			status = "Excluído com sucesso.";
			consulta.close();
		} catch (Exception e) {
			status = "Código não encontrado " + e.getMessage();
		}
		return status;
	}
}
