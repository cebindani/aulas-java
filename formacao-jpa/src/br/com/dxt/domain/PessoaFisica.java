package br.com.dxt.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import org.hibernate.annotations.ForeignKey;

@Entity
@ForeignKey(name = "fk_pessoafisica_pessoa")
public class PessoaFisica extends Pessoa {

	@Column(nullable = false)
	public String cpf;

	@Embedded
	public DocumentosGerais docs;
	

	@AttributeOverrides({
			@AttributeOverride(name = "tituloEleitor", 
					column = @Column(name = "eleitor2")),
			@AttributeOverride(name = "reservista", 
			column = @Column(name = "reservista2")) })
	@Embedded
	public DocumentosGerais docs2via;
}
