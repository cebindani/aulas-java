package br.com.dxt.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.dxt.domain.Agencia;
import br.com.dxt.domain.Cliente;
import br.com.dxt.domain.Endereco;
import br.com.dxt.domain.Investimento;
import br.com.dxt.domain.TipoInvestimento;
import br.com.dxt.services.EntityManagerFactoryWrapper;



public class Exercicio{

public static void main(String[] args) {
		Investimento acoes = new Investimento(TipoInvestimento.ACOES);
		Investimento cdb = new Investimento(TipoInvestimento.CDB);
		Investimento poupanca = new Investimento(TipoInvestimento.POUPANCA);

		Agencia agencia = new Agencia();
		agencia.cod_agencia = 123;
		agencia.nome_gerente = "joao";

		EntityManager em = EntityManagerFactoryWrapper.getEntityManager();
		em.getTransaction().begin();
		em.persist(acoes);
		em.persist(cdb);
		em.persist(poupanca);
		em.persist(agencia);
		em.getTransaction().commit();

		cadastrarCliente(agencia, "cliente 1", "111.111.111-11", TipoInvestimento.ACOES, TipoInvestimento.POUPANCA);
		cadastrarCliente(agencia, "cliente 2", "222.222.222-11", TipoInvestimento.CDB, TipoInvestimento.POUPANCA);
		cadastrarCliente(agencia, "cliente 3", "333.333.333-11", TipoInvestimento.ACOES, TipoInvestimento.CDB);
		cadastrarCliente(agencia, "cliente 4", "444.444.444-11", TipoInvestimento.ACOES);
		cadastrarCliente(agencia, "cliente 5", "555.555.555-11", TipoInvestimento.POUPANCA);

		for (String s : buscarNomesDeClientesPorInvestimento(TipoInvestimento.POUPANCA)) {
			System.out.println(s);
		}
		
		for (Endereco s : buscarEnderecoDosClientesPorInvestimento(TipoInvestimento.POUPANCA)) {
			System.out.println(s);
		}
		
	
		System.out.println("buscando cliente");
		em = EntityManagerFactoryWrapper.getEntityManager();
		Cliente c = em.find(Cliente.class, 1l);
		//c.investimentos.size(); //colocando isso, por causa do EAGER, ele carrega os dados da tabela investimentos
		
		em.close();
		
		System.out.println("Listando investimentos");
		for (Investimento i : c.investimentos) {
			System.out.println(i.tipo);
		}
		
	}

	
	private static void cadastrarCliente(Agencia agencia, String nome, String cpf, TipoInvestimento ... tiposInvestimentos) {
		Cliente cliente = new Cliente();
		cliente.agencia = agencia;
		cliente.nome = nome;
		cliente.cpf = cpf;
		cliente.investimentos = getInvestimentos(tiposInvestimentos);
//		cliente.endereco.logradouro=rua;
//		cliente.endereco.cidade=cidade;
//		cliente.endereco.estado=uf;

		EntityManager em = EntityManagerFactoryWrapper.getEntityManager();
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
	}

	private static List<Investimento> getInvestimentos(TipoInvestimento ... tipos) {
		List<Investimento> retorno = new ArrayList<Investimento>();
		
		EntityManager em = EntityManagerFactoryWrapper.getEntityManager();
		em.getTransaction().begin();

		for (TipoInvestimento tipo : tipos) {
			Investimento investimento = new Investimento(tipo);
			
			em.persist(investimento);
			retorno.add(investimento);
		}
		
		em.getTransaction().commit();
		
		return retorno;
	}
	
	private static List<String> buscarNomesDeClientesPorInvestimento(TipoInvestimento tipo) {
	
		String jpql = "SELECT c.nome FROM Cliente c INNER JOIN c.investimentos i WHERE i.tipo= :tipo";
		TypedQuery<String> qry= EntityManagerFactoryWrapper.getEntityManager().createQuery(jpql, String.class);
		qry.setParameter("tipo", tipo);
		
		return qry.getResultList();
	}
	
	private static List<Endereco> buscarEnderecoDosClientesPorInvestimento(TipoInvestimento tipo) {
		
		String jpql = "SELECT c.endereco FROM Cliente c INNER JOIN c.investimentos i WHERE i.tipo= :tipo";
		TypedQuery<Endereco> qry= EntityManagerFactoryWrapper.getEntityManager().createQuery(jpql, Endereco.class);
		qry.setParameter("tipo", tipo);
		
		return qry.getResultList();
	}
	
	
	
}
