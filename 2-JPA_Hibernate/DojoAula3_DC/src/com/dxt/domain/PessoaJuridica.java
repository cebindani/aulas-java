package com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa {

	@Column(unique=true,length=25)
	public String cnpj;

	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
