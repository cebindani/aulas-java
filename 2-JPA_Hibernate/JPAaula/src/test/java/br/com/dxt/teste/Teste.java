package br.com.dxt.teste;

import br.com.dxt.domain.Produto;
import br.com.dxt.service.ProdutoService;
import br.com.dxt.service.impl.ServiceFactory;

public class Teste {
	
	public static void main(String[] args) {
		ProdutoService service = ServiceFactory.getProdutoService();
			
		Produto p = new Produto();
		p.nome = "chocolate";
		p.qntde = 2;
		service.salvarProduto(p);
		
		Produto p2 = new Produto();
		p2.nome = "morango";
		p2.qntde = 0;
		service.salvarProduto(p2);
		
		Produto p3 = new Produto();
		p3.nome = "abacate";
		p3.qntde = 1;
		service.salvarProduto(p3);
		
		Produto p4 = new Produto();
		p4.nome = "granola";
		p4.qntde = 1;
		service.salvarProduto(p4);
		
		for (Produto produto : service.buscaProduto()) {
			System.out.println(produto);
		}
		
		System.out.println("-------------");
		
		for (Produto produto : service.buscaProdutoComQtdeMaiorQ(0)){
			System.out.println(produto);
		}

		System.out.println("-------------");

		
		for (Produto produto : service.buscaProdutoPorNome("ra")) {
			System.out.println(produto);
		}
		
		System.exit(0);
	}

}
