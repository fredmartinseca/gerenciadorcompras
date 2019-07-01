package br.com.faez.gerenciadorcompras.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.faez.gerenciadorcompras.entity.Usuario;

public class Banco {

	private static List<Usuario> listausuarios = new ArrayList<>();

	public void adiciona(Usuario usuario) {
		Banco.listausuarios.add(usuario);
		System.out.println("Usuario cadastrado");

	}

	public static List<Usuario> getUsuarios() {
		return Banco.listausuarios;
	}

}
