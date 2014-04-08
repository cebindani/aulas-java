package br.com.dxt.domain;

import br.com.dxt.services.PessoaService;
import br.com.dxt.services.ServiceFactory;

public class Teste {

	public static void main(String[] args) {
		
		PessoaService pessoaService = ServiceFactory.getPessoaService();
		PessoaFisica pf = new PessoaFisica();
		pf.nome = "Joao";
		pf.endereco= "end1";
		pf.cpf = "123";
		
				
		pessoaService.salvar(pf);
		for (Pessoa p : pessoaService.buscarPessoas()) {
			System.out.println(p);
		}
		
		PessoaJuridica pj=new PessoaJuridica();
		pj.nome = "Ana";
		pj.endereco="end2";
		pj.cnpj="321";
		
		pessoaService.salvar(pj);
		for (Pessoa p2 : pessoaService.buscarPessoas()) {
			System.out.println(p2);
		}
		
		

		
		System.exit(0);
	}
}
