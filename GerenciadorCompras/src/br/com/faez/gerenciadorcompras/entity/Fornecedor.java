package br.com.faez.gerenciadorcompras.entity;

import java.util.LinkedList;
import java.util.List;


public class Fornecedor {

	private Long id;
	private String nome;
	private String cpfcnpj;
	private String email;
	private Endereco endereco;
	private Telefones telefone;
	private List<Produtos> produtos = new LinkedList<Produtos>();
	private List<Categorias> categorias = new LinkedList<Categorias>();

	public Fornecedor() {
	}

	public Fornecedor(Long id, String nome, String cpfcnpj, String email, Endereco endereco, Telefones telefone,
			List<Produtos> produtos, List<Categorias> categorias) {
		this.id = id;
		this.nome = nome;
		this.cpfcnpj = cpfcnpj;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.produtos = produtos;
		this.categorias = categorias;
	}

	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", nome=" + nome + ", cpfcnpj=" + cpfcnpj + ", email=" + email + ", endereco="
				+ endereco + ", telefone=" + telefone + ", produtos=" + produtos + ", categorias=" + categorias + "]";
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

	public List<Produtos> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produtos> produtos) {
		this.produtos = produtos;
	}

	public List<Categorias> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categorias> categorias) {
		this.categorias = categorias;
	}
}
