package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/CadProduto")
public class CadastroServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String descricao = req.getParameter("descricao");
		String categoria = req.getParameter("categoria");
		double preco = Double.parseDouble(req.getParameter("preco"));
		
		Produto product = new Produto(descricao, categoria, preco);
		
		resp.setContentType("text/html");
        PrintWriter pageResponse = resp.getWriter();
        pageResponse.write("<!DOCTYPE html>"+
        		"<html>"+
        		"<head>"+
        		    "<meta charset='UTF-8'>"+
        		    "<link rel='stylesheet' type='text/css' href='style.css'>"+
        		"</head>"+
        		"<body>"+
        		"<h1>Produto cadastrado com sucesso!</h1>" +
        		        		"<div class='center'>" +
        		        	    "<table>" +
        		        	        "<tr>" +
        		        	            "<td><label class='label-azul-negrito' for='descricao'>Descrição:</label></td>" +
        		        	            "<td><input disabled='true' type='text' id='descricao' name='descricao' value='" + product.getDescricao() + "'></td>" +
        		        	        "</tr>" +
        		        	        "<tr>" +
        		        	            "<td><label class='label-azul-negrito' for='categoria'>Categoria:</label></td>" +
        		        	            "<td><input disabled='true' type='text' id='categoria' name='categoria' value='" + product.getCategoria() + "'></td>" +
        		        	        "</tr>" +
        		        	        "<tr>" +
        		        	            "<td><label class='label-azul-negrito' for='preco'>Preço:</label></td>" +
        		        	            "<td><input disabled='true' type='text' id='preco' name='preco' value='" + String.valueOf(product.getPreco()) + "'></td>" +
        		        	        "</tr>" +
        		        	    "</table>" +
        		        	    "<div class='footer'>" +
        		        	        "<a href='index.html'><button class='botao-arredondado' type='button' name='voltar'>Voltar</button></a>" +
        		        	    "</div>" +
        		        	"</div>"+
        				"</body>"+
        				"</html>");
	}
}
