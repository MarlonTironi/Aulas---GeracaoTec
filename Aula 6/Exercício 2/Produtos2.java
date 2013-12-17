package br.com.sc.geracaotec.aula6;

public class Produtos2 {
	int codigo;
	String desc, status;
	double preco;

	// Construutores
	public Produtos2() {
	}

	public Produtos2(int codigo, String desc, String status, double preco) {
		this.codigo = codigo;
		this.desc = desc;
		this.status = status;
		this.preco = preco;
	}

	// Gerando Getters and Setters
	int getCodigo() {
		return codigo;
	}

	void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	String getDesc() {
		return desc;
	}

	void setDesc(String desc) {
		this.desc = desc;
	}

	String getStatus() {
		return status;
	}

	void setStatus(String status) {
		this.status = status;
	}

	double getPreco() {
		return preco;
	}

	void setPreco(double preco) {
		this.preco = preco;
	}

	// Métodos
	public void alterar() {
		System.out.println(codigo);
		System.out.println(desc);
		System.out.println(preco);
		status = "Alterado com sucesso";

	}

	public void excluir() {
		status = "Excluido com sucesso";

	}

	public void incluir() {
		status = "Incluido com sucesso";

	}
}
