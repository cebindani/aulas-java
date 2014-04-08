package br.com.dxt.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.dxt.domain.Pessoa;
import br.com.dxt.service.PessoaService;
import br.com.dxt.util.EntityManagerFactoryWrapper;

public class PessoaServiceImpl implements PessoaService {

//	EntityManager em = EntityManagerFactoryWrapper.getEntityManager("hsql");
	EntityManager em = EntityManagerFactoryWrapper.getEntityManager("postgres");

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
