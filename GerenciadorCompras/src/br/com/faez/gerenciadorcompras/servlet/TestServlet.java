package br.com.faez.gerenciadorcompras.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/oi")
public class TestServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head><title>Teste Servlets</title></head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Testes servlets");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
