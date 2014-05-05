package br.com.treinamento.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dxt.domain.Usuario;
import br.com.dxt.services.UsuarioService;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 3527542414415403494L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String usuario = req.getParameter("usuario");
		String senha = req.getParameter("senha");
		
		
		UsuarioService service = new UsuarioService();

		Usuario usuarioBanco = service.buscarUsuario(usuario, senha);

		if (usuarioBanco != null) {
			resp.sendRedirect("/jsp/index.html");
		} else {
			resp.sendError(HttpServletResponse.SC_FORBIDDEN);
		}
	}

}
