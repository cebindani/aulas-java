package com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipoPessoa")
public abstract class Pessoa extends BaseEntity{
	@Column(name="nome_pessoa")
	public String nome;
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}
	
	
}
