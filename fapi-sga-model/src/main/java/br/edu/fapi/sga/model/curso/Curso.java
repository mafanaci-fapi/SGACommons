package br.edu.fapi.sga.model.curso;

public class Curso {
    private String nome;
    private int codigo;
    private String duracao;
    private String[] disciplinas = new String[3];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getDisciplinas(int cont) {
        return disciplinas[cont];
    }

    public void setDisciplinas(int cont, String disciplinas) {
        this.disciplinas[cont] = disciplinas;
    }
}
