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
Conexão:<%= request.getParameter("campoConexao") %><br>
Camera:<%= request.getParameter("campoCamera") %><br>
Memória Interna:<%= request.getParameter("campoMemoriaInterna") %><br>
Quantidade:<%= request.getParameter("campoQuantidade") %><br>
Preço:<%= request.getParameter("campoPreco") %><br><br><br>
<a href="../main.html" target="conteudo">Volta a Página Inicial</a>


</body>
</html>