package br.com.faez.gerenciadorcompras.entity;

public class Telefones {

	private String principal;
	private String celular;
	private String comercial;

	public Telefones() {
	}

	public Telefones(String principal, String celular, String comercial) {
		this.principal = principal;
		this.celular = celular;
		this.comercial = comercial;
	}

	@Override
	public String toString() {
		return "Telefones [principal=" + principal + ", celular=" + celular + ", comercial=" + comercial + "]";
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getComercial() {
		return comercial;
	}

	public void setComercial(String comercial) {
		this.comercial = comercial;
	}

}
