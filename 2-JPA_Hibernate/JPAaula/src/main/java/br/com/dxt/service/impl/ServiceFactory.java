package br.com.dxt.service.impl;

import br.com.dxt.service.ProdutoService;

public class ServiceFactory {
	public static ProdutoService getProdutoService(){
		return new ProdutoServiceImpl();
	}

}
