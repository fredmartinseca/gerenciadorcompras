package br.com.faez.gerenciadorcompras.entity;

import java.io.Serializable;

public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String cpfcnpj;
	private String email;
	private Endereco endereco;
	private Telefones telefone;

	public Cliente() {
	}

	public Cliente(Long id, String nome, String cpfcnpj, String email, Endereco endereco, Telefones telefone) {
		this.id = id;
		this.nome = nome;
		this.cpfcnpj = cpfcnpj;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpfcnpj=" + cpfcnpj + ", email=" + email + ", endereco="
				+ endereco + ", telefone=" + telefone + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefones getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefones telefone) {
		this.telefone = telefone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
