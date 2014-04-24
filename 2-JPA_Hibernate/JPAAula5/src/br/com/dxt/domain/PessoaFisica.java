package br.com.dxt.domain;

import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Pessoa {

	public String cpf;

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", nome=" + nome + ", endereco="
				+ endereco + ", agencia=" + agencia + ", telefones="
				+ telefones + ", id=" + id + "]";
	}

	

}
