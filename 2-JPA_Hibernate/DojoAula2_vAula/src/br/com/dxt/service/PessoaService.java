package br.com.dxt.service;

import java.util.List;

import br.com.dxt.domain.Pessoa;

public interface PessoaService {

	public abstract void salvar(Pessoa p);

	public abstract List<Pessoa> buscarPessoas();

}