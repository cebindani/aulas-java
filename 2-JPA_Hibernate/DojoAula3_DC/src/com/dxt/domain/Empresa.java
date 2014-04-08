package com.dxt.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)

public class Empresa extends BaseEntity{
	
	public String nomeEmpresa;
	public String nomeFantasia;
	public String cnpj;
	
	

	
	



	public Empresa() {
		// TODO Auto-generated constructor stub
	}

}
