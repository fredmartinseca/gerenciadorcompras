package br.com.faez.gerenciadorcompras.servlet;

import br.com.faez.gerenciadorcompras.dao.Banco;

public class TesteImput {

	public static void main(String[] args) {

		Banco b = new Banco();
		
		System.out.println(Banco.getUsuarios());

	}

}
