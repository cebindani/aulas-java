package com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Pessoa {

	@Column(unique=true,precision=15)
	public String cpf;
	@Column(name="estado_civil")
	public String estadoCivil;
	
		
	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}

}
