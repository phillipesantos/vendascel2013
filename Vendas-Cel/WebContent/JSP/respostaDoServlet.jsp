<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>Nome:<%= request.getParameter("campoNome") %><br>
Fabricante:<%= request.getParameter("campoFabricante") %><br>
SO:<%= request.getParameter("campoSO") %><br>
Cor:<%= request.getParameter("campoCor") %><br>
Tamanho:<%= request.getParameter("campoTamanho") %><br>
Tamanho da Tela:<%= request.getParameter("campoTamanhoTela") %><br>
Modelo:<%= request.getParameter("campoModelo") %><br>
Conex�o:<%= request.getParameter("campoConexao") %><br>
Camera:<%= request.getParameter("campoCamera") %><br>
Mem�ria Interna:<%= request.getParameter("campoMemoriaInterna") %><br>
Quantidade:<%= request.getParameter("campoQuantidade") %><br>
Pre�o:<%= request.getParameter("campoPreco") %><br><br><br>
<a href="../main.html" target="conteudo">Volta a P�gina Inicial</a>


</body>
</html>