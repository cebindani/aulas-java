package br.com.dxt.execute;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.dxt.domain.Cliente;
import br.com.dxt.domain.Endereco;
import br.com.dxt.domain.Pessoa;
import br.com.dxt.domain.PessoaFisica;
import br.com.dxt.domain.UF;
import br.com.dxt.services.EntityManagerFactoryWrapper;
import br.com.dxt.services.PessoaFisicaService;
import br.com.dxt.validator.ErroValidacao;
import br.com.dxt.validator.ValidacaoUtils;

public class ExecPessoaOneToOne {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.cidade = "Campinas";
		endereco.estado = UF.SP;

		Cliente cliente = new Cliente();
		cliente.nome = "Walter";
		cliente.cpf = "cpf";
		cliente.rg = "rg";
		cliente.endereco = endereco;

		PessoaFisicaService pessoaService = new PessoaFisicaService();
		pessoaService.salvar(cliente);

		Pessoa pessoaEncontrada = pessoaService.buscarPorId(cliente.id);

		System.out.println(pessoaEncontrada.nome);

		List<PessoaFisica> listPessoa = pessoaService.buscarPorNome("alt");

		System.out.println("Nome do primeiro na lista: "
				+ listPessoa.get(0).nome);

		EntityManager em = EntityManagerFactoryWrapper.getEntityManager();
		endereco = em.find(Endereco.class, endereco.id);

		Cliente cliente2 = new Cliente();
		cliente2.nome = "Walter";
		cliente2.cpf = "";
		cliente2.rg = "rg";
		cliente2.endereco = endereco;

		List<ErroValidacao> valida = ValidacaoUtils.valida(cliente2, "cpf");
		if (valida != null && valida.size() > 0) {
			throw new RuntimeException(valida.get(0).getCode());
		}

		pessoaService.salvar(cliente2);

		List<PessoaFisica> listaBuscarPorEstado = pessoaService.buscarPorEstado(UF.SP);

		System.out.println("Nome do primeiro da lista: "+ listaBuscarPorEstado.get(0).nome);
	}

}
