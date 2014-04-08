package com.dxt.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Pessoa extends BaseEntity {

	public String nomePessoa;
	
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

}
