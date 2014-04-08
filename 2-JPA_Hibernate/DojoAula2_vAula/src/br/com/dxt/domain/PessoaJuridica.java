package br.com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("pj")
public class PessoaJuridica extends Pessoa {

	@Column(nullable=false)
	public String CNPJ;

	@Override
	public String toString() {
		return "PessoaJuridica [CNPJ=" + CNPJ + ", id=" + id + ", nome=" + nome
				+ ", endereco=" + endereco + "]";
	}
	
	
	
}
