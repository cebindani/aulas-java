package br.com.dxt.domain;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa extends BaseEntity {

	public String nome;

	@Embedded
	public Endereco endereco;

	@AttributeOverrides({
			@AttributeOverride(name = "rua", column = @Column(name = "rua_trabalho")),
			@AttributeOverride(name = "cidade", column = @Column(name = "cidade_trabalho")),
			@AttributeOverride(name = "estado", column = @Column(name = "estado_trabalho")), })
	@Embedded
	public Endereco enderecoTrabalho;

	@ManyToOne
	public Agencia agencia;
	@JoinColumn(name = "id_pessoa")
	@OneToMany(cascade = CascadeType.PERSIST)
	public List<Telefone> telefones;

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", agencia="
				+ agencia + ", id=" + id + "]";
	}

}
