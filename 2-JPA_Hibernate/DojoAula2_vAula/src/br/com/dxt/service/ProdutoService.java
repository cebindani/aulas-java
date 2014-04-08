package br.com.dxt.service;

import java.util.List;

import br.com.dxt.domain.Produto;

public interface ProdutoService {
	void salvarProduto(Produto p);
	
	List<Produto> buscaProduto();
	
	List<Produto> buscaProdutoComQtdeMaiorQ(int qtde);
	
	List<Produto> buscaProdutoPorNome(String nome);
}
