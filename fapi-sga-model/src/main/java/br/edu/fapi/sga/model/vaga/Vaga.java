package br.edu.fapi.sga.model.vaga;

public class Vaga {

	private static String nomeDaVaga;
	private static String nomeDaEmpresa;
	private static String CNPJ;
	private String requisitoObrigatorio;
	private String requisitoDesejaveis;
	private String descricaoDasAtividades;
	private String horarioDeTrabalho;
	private String localTrabalho;
	private static float salario;
	private String beneficio;
	private String responsavelPelaVaga;
	private long telefone;
	private String observacao;

	public static String getNomeDaVaga() {
		return nomeDaVaga;
	}

	public static void setNomeDaVaga(String nomeDaVaga) {
		nomeDaVaga = nomeDaVaga;
	}

	public static String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}

	public static void setNomeDaEmpresa(String nomeDaEmpresa) {
		nomeDaEmpresa = nomeDaEmpresa;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public static void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getRequisitoObrigatorio() {
		return requisitoObrigatorio;
	}

	public static void setRequisitoObrigatorio(String requisitoObrigatorio) {
		requisitoObrigatorio = requisitoObrigatorio;
	}

	public String getRequisitoDesejaveis() {
		return requisitoDesejaveis;
	}

	public static void setRequisitoDesejaveis(String requisitoDesejaveis) {
		requisitoDesejaveis = requisitoDesejaveis;
	}

	public String getDescricaoDasAtividades() {
		return descricaoDasAtividades;
	}

	public static void setDescricaoDasAtividades(String descricaoDasAtividades) {
		descricaoDasAtividades = descricaoDasAtividades;
	}

	public String getHorarioDeTrabalho() {
		return horarioDeTrabalho;
	}

	public static void setHorarioDeTrabalho(String horarioDeTrabalho) {
		horarioDeTrabalho = horarioDeTrabalho;
	}

	public String getLocalTrabalho() {
		return localTrabalho;
	}

	public static void setLocalTrabalho(String localTrabalho) {
		localTrabalho = localTrabalho;
	}

	public static float getSalario() {
		return salario;
	}

	public static void setSalario(float salario) {
		salario = salario;
	}

	public String getBeneficio() {
		return beneficio;
	}

	public static void setBeneficio(String beneficio) {
		beneficio = beneficio;
	}

	public String getResponsavelPelaVaga() {
		return responsavelPelaVaga;
	}

	public static void setResponsavelPelaVaga(String responsavelPelaVaga) {
		responsavelPelaVaga = responsavelPelaVaga;
	}

	public long getTelefone() {
		return telefone;
	}

	public static void setTelefone(long telefone) {
		telefone = telefone;
	}

	public String getObservacao() {
		return observacao;
	}

	public static void setObservacao(String observacao) {
		observacao = observacao;
	}

}