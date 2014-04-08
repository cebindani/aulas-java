package br.com.dxt.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE) //diz que todas as classes herdadas utilizam a single-table (uma só tabela)
//@Inheritance(strategy=InheritanceType.JOINED)//faz join entre tabelas
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)// não vai precisr do @DiscriminatorColumn

//@DiscriminatorColumn(name="tipo_da_pessoa") //mostra a coluna no banco que vai discriminar qual tipo de registro que é
public class Pessoa extends BaseEntity{

	
	public String nome;
	public String endereco;

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", endereco=" + endereco + "]";
	}

}
