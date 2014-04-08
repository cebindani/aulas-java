package br.com.dxt.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("pf")
public class PessoaFisica extends Pessoa {
	
	public String CPF;

	@Override
	public String toString() {
		return "PessoaFisica [CPF=" + CPF + ", id=" + id + ", nome=" + nome
				+ ", endereco=" + endereco + "]";
	}
	
	

}
