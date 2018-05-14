package br.edu.fapi.sga.model.instituicao;

public class Instituicao {

	private String razaoSocial;
	private String cnpj;
	private String nomeFantasia;
	private String endereco;
	private String socios;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSocios() {
		return socios;
	}

	public void setSocios(String socios) {
		this.socios = socios;
	}
}
