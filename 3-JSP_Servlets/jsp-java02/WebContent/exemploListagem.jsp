<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="header.jsp"%>
<title>Insert title here</title>
</head>
<body>
	<%
		String[] frutas = new String[4];
		frutas[0] = "Cereja";
		frutas[1] = "Maçã";
		frutas[2] = "Goiaba";
		frutas[3] = "Laranja";
		
		for (int i = 0; i < frutas.length; i++) {%>
			
			frutas[<%=i%>] = <%=frutas[i]%><br>
	<%
		}
	%>
</body>
</html>