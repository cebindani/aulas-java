package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ForeignKey;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Pessoa extends BaseEntity{
	
	@Column
	public String nome;
	
	
	@OneToOne 
	@ForeignKey(name="fk_pessoa_endereco")
//	@JoinColumn(name="logradouro")
	public Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name="agencia_id") //mapeamento bi-direcional
	public Agencia agencia;
	
	
//	-----------------------------------------------------------------------------
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
//	public Pessoa(String nome, Endereco endereco, Agencia agencia) {
//		super();
//		this.nome = nome;
//		this.endereco = endereco;
//		this.agencia = agencia;
//	}


	


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", agencia="
				+ agencia + ", id=" + id + "]";
	}

}
