package br.com.treinamento.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dxt.domain.Usuario;

public class LoginFilter implements javax.servlet.Filter {

	private static final String CSS_URL = "/jsp/css";
	private static final String LOGIN_URL = "/jsp/login";
	private static final String LOGIN_PAGE = "/jsp/login.html";

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		Usuario usuario = (Usuario) req.getSession().getAttribute("usuarioLogado");
		if (usuario != null || req.getRequestURI().equals(LOGIN_PAGE) || req.getRequestURI().equals(LOGIN_URL) || req.getRequestURI().contains(CSS_URL)) {
			chain.doFilter(req, resp);
		} else {
			//resp.sendRedirect(LOGIN_PAGE);
			
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
