package br.edu.fapi.sga.model.gradehoraria;

public class GradeHoraria {
	private int codigo;
	private String curso;
	private String turma;
	private String[][] grade = new String[4][5];

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getGrade(int linha, int coluna) {
		return grade[linha][coluna];
	}

	public void setGrade(int linha, int coluna, String grade) {
		this.grade[linha][coluna] = grade;
	}
}
