package br.com.dxt.teste;

import br.com.dxt.domain.Pessoa;
import br.com.dxt.domain.PessoaFisica;
import br.com.dxt.domain.PessoaJuridica;
import br.com.dxt.service.PessoaService;
import br.com.dxt.service.impl.ServiceFactory;


public class Teste2 {

	public static void main(String[] args) {
		PessoaService service = ServiceFactory.getPessoaService();
		
		Pessoa p = new Pessoa();
		p.nome = "PESSOA";
		p.endereco = "ENDERECO";
		service.salvar(p);
		
		PessoaFisica pf = new PessoaFisica();
		pf.nome = "PESSOA FISICA";
		pf.endereco = "ENDERECO";
		pf.CPF = "CPF";
		service.salvar(pf);
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.nome = "PESSOA FISICA";
		pj.endereco = "ENDERECO";
		pj.CNPJ = "CNPJ";
		service.salvar(pj);
		

		for (Pessoa pessoa : service.buscarPessoas()) {
			System.out.println(pessoa);
		}		
		
	}

}
