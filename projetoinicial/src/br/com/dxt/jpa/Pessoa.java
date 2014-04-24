package br.com.dxt.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;

	@Column
	public String nome;

	@Column
	public String cpf;

}
