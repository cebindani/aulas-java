package br.com.dxt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	public String descricao;
	public String nome;

	@Column(name="qtde_de_produtos")
	public Integer qntde;

	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", nome="
				+ nome + ", qntde=" + qntde + "]";
	}

}
