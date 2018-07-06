package br.edu.fapi.sga.model.curso;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int codigo;
    private String duracao;
    private List<String> disciplinas = new ArrayList();

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

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public int tamanhoLista() {
        return disciplinas.size();
    }
}
