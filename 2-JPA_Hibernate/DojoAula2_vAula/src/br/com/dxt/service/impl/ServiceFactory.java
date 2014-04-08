package br.com.dxt.service.impl;

import br.com.dxt.service.PessoaService;
import br.com.dxt.service.ProdutoService;

public class ServiceFactory {
	public static ProdutoService getProdutoService(){
		return new ProdutoServiceImpl();
	}
	
	public static PessoaService getPessoaService(){
		return new PessoaServiceImpl();
	}

}
