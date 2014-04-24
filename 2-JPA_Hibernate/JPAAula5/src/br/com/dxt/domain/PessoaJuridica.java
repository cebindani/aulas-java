package br.com.dxt.domain;

import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa {

	public String cnpj;

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", nome=" + nome
				+ ", endereco=" + endereco + ", agencia=" + agencia
				+ ", telefones=" + telefones + ", id=" + id + "]";
	}

	

}
