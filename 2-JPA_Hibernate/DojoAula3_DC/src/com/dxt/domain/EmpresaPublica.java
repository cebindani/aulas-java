package com.dxt.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)

public class EmpresaPublica {
	
	public String nomeEmpresa;
	public String nomeFantasia;
	public String cnpj;
	
	

	
	



	public EmpresaPublica() {
		// TODO Auto-generated constructor stub
	}

}
