package br.com.faez.gerenciadorcompras.entity;

public class Produtos {

	private Integer id;
	private String nome;
	private Integer qt_estoque;
	private String dimensoes;
	private Double peso;
	private Double preco_compra;
	private Double preco_venda;
	private String categoria;
	private Double ind_ipi;
	private Double ind_icms;
	private Double cod_ncm;

	public Produtos() {
	}

	public Produtos(Integer id, String nome, Integer qt_estoque, String dimensoes, Double peso, Double preco_compra,
			Double preco_venda, String categoria, Double ind_ipi, Double ind_icms, Double cod_ncm) {
		super();
		this.id = id;
		this.nome = nome;
		this.qt_estoque = qt_estoque;
		this.dimensoes = dimensoes;
		this.peso = peso;
		this.preco_compra = preco_compra;
		this.preco_venda = preco_venda;
		this.categoria = categoria;
		this.ind_ipi = ind_ipi;
		this.ind_icms = ind_icms;
		this.cod_ncm = cod_ncm;
	}

	@Override
	public String toString() {
		return "Produtos [id=" + id + ", nome=" + nome + ", qt_estoque=" + qt_estoque + ", dimensoes=" + dimensoes
				+ ", peso=" + peso + ", preco_compra=" + preco_compra + ", preco_venda=" + preco_venda + ", categoria="
				+ categoria + ", ind_ipi=" + ind_ipi + ", ind_icms=" + ind_icms + ", cod_ncm=" + cod_ncm + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQt_estoque() {
		return qt_estoque;
	}

	public void setQt_estoque(Integer qt_estoque) {
		this.qt_estoque = qt_estoque;
	}

	public String getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(String dimensoes) {
		this.dimensoes = dimensoes;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getPreco_compra() {
		return preco_compra;
	}

	public void setPreco_compra(Double preco_compra) {
		this.preco_compra = preco_compra;
	}

	public Double getPreco_venda() {
		return preco_venda;
	}

	public void setPreco_venda(Double preco_venda) {
		this.preco_venda = preco_venda;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getInd_ipi() {
		return ind_ipi;
	}

	public void setInd_ipi(Double ind_ipi) {
		this.ind_ipi = ind_ipi;
	}

	public Double getInd_icms() {
		return ind_icms;
	}

	public void setInd_icms(Double ind_icms) {
		this.ind_icms = ind_icms;
	}

	public Double getCod_ncm() {
		return cod_ncm;
	}

	public void setCod_ncm(Double cod_ncm) {
		this.cod_ncm = cod_ncm;
	}

}
