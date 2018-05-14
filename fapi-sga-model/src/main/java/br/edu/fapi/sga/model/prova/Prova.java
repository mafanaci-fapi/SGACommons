package br.edu.fapi.sga.model.prova;

public class Prova {
	private int codigo;
	private String disciplina;
	private String turma;
	private String[] questoes = new String[3];

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getQuestoes(int cont) {
		return questoes[cont];
	}

	public void setQuestoes(int cont, String questoes) {
		this.questoes[cont] = questoes;
	}
}
