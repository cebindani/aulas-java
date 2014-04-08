package br.com.dxt.domain;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("pj")
public class PessoaJuridica extends Pessoa{

	public String cnpj;

	public PessoaJuridica(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public PessoaJuridica() {
		// TODO Auto-generated constructor stub
	}
	

}
