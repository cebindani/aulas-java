<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
	<head>
		<%@include file="header.jsp"%>
		
		<title>Treinamento JSP</title>
	</head>
	<body>
		<%@include file="menu.jsp"%>
		<div>
		<form action="/jsp/cadastroUsuario" method="POST">
		<h1>Usuários</h1>
			<div class="well conteudo">
				<fieldset>
					<div class="input-group">
						<label for="nome">Nome: </label>
						<input type="text" class="form-control" id="nome" name="nome" />
					</div>
					<div class="input-group">
						<label for="login">Login: </label>
						<input type="text" class="form-control" id="login" name="login" />
					</div>
					<div class="input-group">
						<label for="senha">Senha: </label>
						<input type="password" class="form-control" id="senha" name="senha" />
					</div>
	
					<div class="app-buttons">
						<input type="submit" class="btn btn-primary" value="Gravar" />
					</div>
	
				</fieldset>
			</div>
		</form>
		</div>

	</body>
</html>