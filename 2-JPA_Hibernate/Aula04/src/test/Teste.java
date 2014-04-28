package test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.persistence.TypedQuery;

import service.GenericDAO;
import domain.Agencia;
import domain.BaseEntity;
import domain.Endereco;
import domain.Endereco.UF;
import domain.Pessoa;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.Telefone;

public class Teste {

	public static void main(String[] args) {

		GenericDAO gd = new GenericDAO();
		
		Telefone tel1= new Telefone();
		tel1.ddd="011";
		tel1.numero="99153-9070";

		// Agencia
		Agencia ag = new Agencia();
		ag.codigo = "3920";
		ag.nomeGerente = "Gerente Fulano";
		gd.salvar(ag);

		// Endereço
		Endereco address = new Endereco();
		address.rua = "Rua A, 1";
		address.cidade = "Campinas";
		address.estado = UF.SP;
		gd.salvar(address);

		// Pessoa Juridica
		PessoaJuridica pj = new PessoaJuridica();
		pj.nome = "Empresa1";
		pj.cnpj = "1234";
		pj.endereco = address;
		gd.salvar(pj);

		// Pessoa Física
		PessoaFisica cliente1 = new PessoaFisica();
		cliente1.nome = "Daniele Cebin";
		cliente1.cpf = "370.544.128-00";
		cliente1.endereco = address;
		cliente1.agencia = ag;
		gd.salvar(cliente1);

		PessoaFisica cliente2 = new PessoaFisica();
		cliente2.nome = "Ana Cebin";
		cliente2.cpf = "111.111.111-11";
		cliente2.endereco = address;
		cliente2.agencia = ag;

		gd.salvar(cliente2);

		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

		for (BaseEntity be : gd.buscaTodos(cliente2.getClass())) {
			System.out.println(be);
		}

		// for (BaseEntity be : gd.buscaTodos(pj.getClass())) {
		// System.out.println(be);
		// }
		// for (BaseEntity be : gd.buscaTodos(address.getClass())) {
		// System.out.println(be);
		// }

		String jpql = "SELECT p FROM " + Pessoa.class.getSimpleName()
				+ " p WHERE p.endereco.estado = :UF";
		TypedQuery<Pessoa> qry = gd.em.createQuery(jpql, Pessoa.class);
		qry.setParameter("UF", UF.SP);
		System.out.println(qry.getResultList());

		System.exit(0);

	}

}
