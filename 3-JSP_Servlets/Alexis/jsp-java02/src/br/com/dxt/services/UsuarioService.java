package br.com.dxt.services;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.dxt.domain.Usuario;

public class UsuarioService extends AbstractService<Usuario> {

	public UsuarioService() {
		super(Usuario.class);
	}

	public Usuario buscarUsuario(String login, String senha) {
		StringBuilder builder = new StringBuilder("FROM ");
		builder.append(Usuario.class.getSimpleName());
		builder.append(" usuario");
		builder.append(" WHERE");
		builder.append(" usuario.login = :login");
		builder.append(" AND usuario.senha = :senha");

		TypedQuery<Usuario> query = 
				getEm().createQuery(builder.toString(), Usuario.class);

		query.setParameter("login", login);
		query.setParameter("senha", senha);

		Usuario usuario;

		try {
			usuario = query.getSingleResult();
		} catch (NoResultException e) {
			usuario = null;
		}
		return usuario;

	}
}
