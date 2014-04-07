package br.com.dxt.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.dxt.domain.Produto;
import br.com.dxt.service.ProdutoService;
import br.com.dxt.util.EntityManagerFactoryWrapper;

public class ProdutoServiceImpl implements ProdutoService {
	
	EntityManager em = EntityManagerFactoryWrapper.getEntityManager();

	@Override
	public void salvarProduto(Produto p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();

	}

	@Override
	public List<Produto> buscaProduto() {
		TypedQuery <Produto> qry = em.createQuery("FROM "+Produto.class.getSimpleName(),Produto.class);
		return qry.getResultList();
	}

	@Override
	public List<Produto> buscaProdutoComQtdeMaiorQ(int qtde) {
		TypedQuery <Produto> qry = em.createQuery("FROM "+Produto.class.getSimpleName()+ " p WHERE p.qntde > :qtde ",Produto.class);
		qry.setParameter("qtde", qtde);
		return qry.getResultList();
	}

	@Override
	public List<Produto> buscaProdutoPorNome(String nome) {
		TypedQuery<Produto> qry = em.createQuery("FROM "+ Produto.class.getSimpleName() + " p WHERE p.nome LIKE :nome", Produto.class);
		qry.setParameter("nome", "%" + nome + "%");
		return qry.getResultList();
	}



}
