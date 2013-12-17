package br.com.sc.geracaotec.aula6;


public class TesteProdutos {

	public static void main(String[] args) {
		Produtos c = new Produtos();
		c.codigo = 123;
		c.desc = "Lapis";
		c.preco = 1.50;
		c.alterar();
		System.out.println(c.status);
		c.incluir();
		System.out .println(c.status);
		c.excluir();
		System.out .println(c.status);
	
		
	}
	
}
