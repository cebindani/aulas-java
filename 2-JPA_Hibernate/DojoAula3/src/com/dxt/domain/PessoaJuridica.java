package com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="PJ")
public class PessoaJuridica extends Pessoa {

	@Column(unique=true,length=25)
	public String cnpj;
	
}
