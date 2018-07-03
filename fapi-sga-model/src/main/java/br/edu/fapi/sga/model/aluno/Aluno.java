package br.edu.fapi.sga.model.aluno;

public class Aluno {
	private int codigo;
	private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	private String email;
	private String endereco;
	private int idAluno;

        public int getCodigo() {
        return codigo;
        }
        
        public void setCodigo(int codigo) {
        this.codigo = codigo;
        }
        
        public String getNome() {
        return nome;
        }
        
        public void setNome(String nome) {
        this.nome = nome;
        }
        
        public String getCpf() {
        return cpf;
        }

        public void setCpf(String cpf) {
        this.cpf = cpf;
        }

        public String getRg() {
        return rg;
        }

        public void setRg(String rg) {
        this.rg = rg;
        }

        public String getTelefone() {
        return telefone;
        }

        public void setTelefone(String telefone) {
        this.telefone = telefone;
        }

        public String getEmail() {
        return email;
        }

        public void setEmail(String email) {
        this.email = email;
        }

        public String getEndereco() {
        return endereco;
        }

        public void setEndereco(String endereco) {
        this.endereco = endereco;
        }

        public int getIdAluno() {
        return idAluno;
        }

        public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
        }

        public void setId(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
}