package domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Pessoa extends BaseEntity {

	@Column
	public String nome;
	public String sobrenome;

	@OneToOne
	@JoinColumn(name = "logradouro")
	public Endereco endereco;

	@ManyToOne
	@JoinColumn(name = "agencia_id")
	// mapeamento bi-direcional
	public Agencia agencia;

	@OneToMany
	//@JoinColumn("id_pessoa")
	public List<Telefone> telefones;

	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", agencia="
				+ agencia + ", telefones=" + telefones + ", id=" + id + "]";
	}

}
