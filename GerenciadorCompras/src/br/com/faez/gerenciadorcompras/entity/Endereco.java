package br.com.faez.gerenciadorcompras.entity;

public class Endereco {

	private Long id;
	private String logadouro;
	private Integer numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String cidade;
	private String uf;

	public Endereco() {
	}

	public Endereco(Long id, String logadouro, Integer numero, String complemento, String cep, String bairro,
			String cidade, String uf) {
		this.id = id;
		this.logadouro = logadouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", logadouro=" + logadouro + ", numero=" + numero + ", complemento=" + complemento
				+ ", cep=" + cep + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogadouro() {
		return logadouro;
	}

	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
