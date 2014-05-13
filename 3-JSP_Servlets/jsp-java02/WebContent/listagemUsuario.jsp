<%@page import="br.com.dxt.services.UsuarioService"%>
<%@page import="java.util.List"%>
<%@ page import="br.com.dxt.domain.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>

<%@include file="header.jsp"%>
<title>Listar aluno</title>


<script type="text/javascript">
	$(document).ready(function() {
		$('#novoUsuario').click(function() {
			window.location = "/jsp/cadastroUsuario.jsp";
		});
	});
	
	$(document).ready(function () {
		$('.excluir').click(function () {
			var idExcluir = $(this).closest('td').siblings('.oculto').text();
			$('#idUsuario').val(idExcluir);
			$('form.oculto').submit();
		});
	});
</script>

</head>
<body>
	<%@include file="menu.jsp"%>

	<form>
		<h1>Usuários</h1>
		<div class="well conteudo">
			<table class="table table-hover">
				<thead>
					<th class="oculto"></th>
					<th>Nome</th>
					<th>Login</th>
				</thead>
				<%
					UsuarioService service = new UsuarioService();
					List<Usuario> usuarios = service.buscarUsuarios();

					for (Usuario usuario : usuarios) {
				%>
				<tbody>
					<tr>
						<td class="oculto"><%=usuario.getId()%></td>
						<td><%=usuario.getNome()%></td>
						<td><%=usuario.getLogin()%></td>
						<td><a class="excluir btn btn-info">Excluir</a></td>
					</tr>
					<%
						}
					%>

				</tbody>
			</table>
			<div class="app-buttons">
				<input type="button" class="btn btn-primary" value="Novo"
					id="novoUsuario" />
			</div>

		</div>

	</form>
	<form class="oculto" id="excluirForm" action="/jsp/excluirUsuario" method="post">
		<input type="text" id="idUsuario" name="idUsuario" />
	</form>




</body>
</html>