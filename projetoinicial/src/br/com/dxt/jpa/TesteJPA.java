package br.com.dxt.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TesteJPA {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("mysql");
		EntityManager em = emf.createEntityManager();
		TypedQuery<Pessoa> qry = em.createQuery(
				"FROM " + Pessoa.class.getSimpleName() + " p ", Pessoa.class);
		List<Pessoa> resultList = qry.getResultList();
		for (Pessoa p : resultList) {
			System.out.println(String.format("Nome: %s = CPF: %s", p.nome,
					p.cpf));
		}
		em.close();
		emf.close();
	}
}
