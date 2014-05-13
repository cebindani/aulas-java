package br.com.treinamento.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dxt.services.UsuarioService;

/**
 * Servlet implementation class ExcluirUsuarioServlet
 */
public class ExcluirUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idUsuario = request.getParameter("idUsuario").trim();
		UsuarioService service = new UsuarioService();
		service.excluir(Long.parseLong(idUsuario));
		response.sendRedirect("/jsp/listagemUsuario.jsp");
	}

}
