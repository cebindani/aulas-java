package br.com.dxt.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ForeignKey;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa extends MyAbstractEntity {

	@Column
	public String nome;

	@OneToOne(fetch=FetchType.LAZY) //(cascade = CascadeType.PERSIST) 
	@ForeignKey(name = "fk_pessoa_endereco")
	public Endereco endereco;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pessoa_id")
	@ForeignKey(name = "fk_pessoa_telefone")
	public List<Telefone> telefones;

	@ManyToOne (fetch=FetchType.LAZY)
	public Agencia agencia;

	@ManyToMany
	public List<PacoteServicos> packServicos;

	@OneToMany  (fetch=FetchType.EAGER)
	@JoinColumn(name="pessoa_id")
	public List<Investimento> investimentos;

}
