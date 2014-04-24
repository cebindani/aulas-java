package br.com.dxt.teste;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.dxt.domain.Agencia;
import br.com.dxt.domain.Endereco;
import br.com.dxt.domain.Estado;
import br.com.dxt.domain.ItemVenda;
import br.com.dxt.domain.Pessoa;
import br.com.dxt.domain.PessoaFisica;
import br.com.dxt.domain.PessoaJuridica;
import br.com.dxt.domain.Produto;
import br.com.dxt.domain.Telefone;
import br.com.dxt.domain.TipoTelefone;
import br.com.dxt.domain.Venda;
import br.com.dxt.service.Service;
import br.com.dxt.util.EntityManagerFactoryWrapper;

public class Teste {

	public static List<Pessoa> buscarPorEstado(Estado e) {
		EntityManager em = EntityManagerFactoryWrapper.getEntityManager();
		TypedQuery<Pessoa> qry = em.createQuery(
				" FROM " + Pessoa.class.getSimpleName() + " p "
						+ " WHERE p.endereco.estado = :UF", Pessoa.class);
		qry.setParameter("UF", e);
		return qry.getResultList();
	}

	public static List<Pessoa> buscarPorTipoTelefone(TipoTelefone t) {
		EntityManager em = EntityManagerFactoryWrapper.getEntityManager();
		TypedQuery<Pessoa> qry1 = em.createQuery("select p FROM "
				+ Pessoa.class.getSimpleName() + " p "
				+ "  INNER JOIN p.telefones t WHERE t.tipo = :TIPO",
				Pessoa.class);
		qry1.setParameter("TIPO", t);
		return qry1.getResultList();

	}

	public static void main(String[] args) {

		Service s = new Service();

		System.out.println("\nInserindo Endereco... \n");
		Endereco e = new Endereco();
		e.rua = "Dr. Leo";
		e.cidade = "Sumaré";
		e.estado = Estado.SP;
		//s.salvar(e); devido ao cascade
		

		System.out.println("\nInserindo Telefones... \n");
		Telefone t1 = new Telefone();
		t1.tipo = TipoTelefone.CELULAR;
		t1.numero = "998898899";
		t1.ddd = "019";
		//s.salvar(t1); devido ao cascade

		Telefone t2 = new Telefone();
		t2.tipo = TipoTelefone.RESIDENCIAL;
		t2.numero = "346569955";
		t2.ddd = "019";
		//s.salvar(t2); devido ao cascade

		List<Telefone> lt1 = new ArrayList<Telefone>();
		lt1.add(t1);
		lt1.add(t2);

		Telefone t3 = new Telefone();
		t3.tipo = TipoTelefone.CELULAR;
		t3.numero = "89888895656";
		t3.ddd = "019";
		//s.salvar(t3); devido ao cascade

		Telefone t4 = new Telefone();
		t4.tipo = TipoTelefone.RECADO;
		t4.numero = "325445588";
		t4.ddd = "019";
		//s.salvar(t4); devido ao cascade

		List<Telefone> lt2 = new ArrayList<Telefone>();
		lt2.add(t3);
		lt2.add(t4);

		System.out.println("Inserindo Pessoa Física... \n");
		PessoaFisica pf = new PessoaFisica();
		pf.nome = "Jéssica";
		pf.cpf = "123456456";
		pf.endereco = e;
		pf.telefones = lt1;
		s.salvar(pf);
		for (PessoaFisica pf1 : s.buscar(PessoaFisica.class)) {
			System.out.println(pf1);
		}

		System.out.println("\nInserindo Pessoa Jurídica... \n");
		PessoaJuridica pj = new PessoaJuridica();
		pj.nome = "Dextra";
		pj.cnpj = "3124566454";
		pj.endereco = e;
		pj.telefones = lt2;
		s.salvar(pj);
		for (PessoaJuridica pj1 : s.buscar(PessoaJuridica.class)) {
			System.out.println(pj1);
		}

		List<Pessoa> ps = new ArrayList<Pessoa>();
		ps.add(pj);
		ps.add(pf);

		System.out.println("\nInserindo Agencia... \n");
		Agencia a = new Agencia();
		a.nomeGerente = "Rodrigo";
		a.codigoAgencia = "520";
		a.pessoas = ps;
		s.salvar(a);
		for (Agencia a1 : s.buscar(Agencia.class)) {
			System.out.println(a1);
		}

		System.out.println("\nBuscando por estado... \n");
		for (Pessoa p : buscarPorEstado(Estado.SP)) {
			System.out.println(p);
		}

		System.out.println("\nBuscando por Tipo de Telefone... \n");
		for (Pessoa p1 : buscarPorTipoTelefone(TipoTelefone.CELULAR)) {
			System.out.println(p1);
		}

		System.out.println("\nInserindo Produtos... \n");
		Produto p = new Produto("Boneca", 20f);
		s.salvar(p);
		Produto p1 = new Produto("Carrinho", 30f);
		s.salvar(p1);

		System.out.println("\nInserindo Venda... \n");
		Venda v = new Venda();
		v.d = new Date();
		s.salvar(v);

		System.out.println("\nInserindo Itens... \n");
		ItemVenda i = new ItemVenda(p, 2f, v);
		s.salvar(i);

		ItemVenda i1 = new ItemVenda(p1, 3f, v);
		s.salvar(i1);

		// List<ItemVenda> listItens = new ArrayList<>();
		// listItens.add(i);
		// listItens.add(i1);

		//float qtdeVendida = 0;

		/*for (ItemVenda iv : s.buscar(ItemVenda.class)) {
			System.out.println(iv);
			qtdVendida += iv.qtde;

		}*/

		EntityManagerFactoryWrapper.closeEntityManager();

	}
}
