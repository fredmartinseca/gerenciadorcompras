package br.com.faez.gerenciadorcompras.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.faez.gerenciadorcompras.dao.Banco;
import br.com.faez.gerenciadorcompras.entity.Usuario;

@WebServlet("/cadastro-usuario")
public class cadastroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Cadastrando novo Usuario");

		String nomeusuario = request.getParameter("nome");
		String emailusuario = request.getParameter("email");
		String loginusuario = request.getParameter("login");
		String senhausuario = request.getParameter("senha");
		String cpfusuario = request.getParameter("cpf");		
		Usuario usuario = new Usuario();
		usuario.setNome(nomeusuario);
		usuario.setEmail(emailusuario);
		usuario.setLogin(loginusuario);
		usuario.setSenha(senhausuario);
		usuario.setCpf(cpfusuario);
		
		Banco banco = new Banco();
		banco.adiciona(usuario);
		
		PrintWriter out = response.getWriter();
		out.println("<html><head>\r\n" + 
				"<meta charset=\"UTF-8\"><body>Usuario "+ nomeusuario +" cadastrado sucesso!!</body></html>");
		
		System.out.println(Banco.getUsuarios());
	}

}
