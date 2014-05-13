package br.com.treinamento.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dxt.services.UsuarioService;

public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UsuarioService service;
    /**
     * @see HttpServlet#HttpServlet()
     */

	@Override
	public void init() throws ServletException {
		service=new UsuarioService();
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome=req.getParameter("nome");
		String login=req.getParameter("login");
		String senha=req.getParameter("senha");
		
		service.criarUsuario(nome, login, senha);
		resp.sendRedirect("/jsp/index.jsp");
	}
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	


}
