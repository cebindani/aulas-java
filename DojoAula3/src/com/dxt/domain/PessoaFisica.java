package com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="PF")
public class PessoaFisica extends Pessoa {
	
	@Column(unique=true,length=15, nullable=false)
	public String cpf;
	
	public String estadoCivil;

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", estadoCivil=" + estadoCivil
				+ ", nome=" + nome + ", Id=" + Id + "]";
	}
}
