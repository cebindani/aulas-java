package com.dxt.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Veiculo extends BaseEntity{

	public String marca;
	public String modelo;
	public int ano;
	
	
	public Veiculo() {
		// TODO Auto-generated constructor stub
	}


	
	
}
