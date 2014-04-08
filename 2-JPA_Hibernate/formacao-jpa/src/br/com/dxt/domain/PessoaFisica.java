package br.com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("pf")
public class PessoaFisica extends Pessoa{

	@Column(nullable=false)
	public String cpf;

	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}
	public PessoaFisica(String cpf) {
		super();
		this.cpf = cpf;
	}

	
	
	

}
