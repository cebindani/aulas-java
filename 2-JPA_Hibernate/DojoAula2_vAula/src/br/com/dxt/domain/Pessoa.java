package br.com.dxt.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "tipo_da_pessoa")
public class Pessoa extends BaseEntity{

	public String nome;
	public String endereco;
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", endereco=" + endereco
				+ "]";
	}
	
	

}
