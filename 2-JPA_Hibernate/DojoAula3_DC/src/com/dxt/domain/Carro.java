package com.dxt.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Carro extends BaseEntity{

	public String marca;
	public String modelo;
	public int ano;
	
	
	public Carro() {
		// TODO Auto-generated constructor stub
	}


	
	
}
