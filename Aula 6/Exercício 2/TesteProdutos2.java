package br.com.sc.geracaotec.aula6;

import br.com.sc.geracaotec.Produtos;

public class TesteProdutos2 {

	public static void main(String[] args) {
		Produtos2 c = new Produtos2();
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
