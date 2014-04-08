package br.com.dxt.jpa.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.dxt.domain.Pessoa;
import br.com.dxt.services.PessoaService;

public class PessoaServiceImpl implements PessoaService {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hsql");
	EntityManager em = emf.createEntityManager();

	// EntityManager em=EntityManagerFactory

	@Override
	public void salvar(Pessoa p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
	}

	@Override
	public List<Pessoa> buscarPessoas() {
		TypedQuery<Pessoa> qry = em.createQuery(
				"FROM " + Pessoa.class.getSimpleName() + " p", Pessoa.class);
		return qry.getResultList();
	}

}
