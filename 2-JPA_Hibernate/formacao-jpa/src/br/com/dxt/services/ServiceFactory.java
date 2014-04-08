package br.com.dxt.services;

import br.com.dxt.jpa.services.PessoaServiceImpl;

public class ServiceFactory {

	public static PessoaService getPessoaService() {
		return new PessoaServiceImpl();
	}
}
