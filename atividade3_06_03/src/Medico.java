package br.com.src;

public class Medico {
    public String nome;
    public String crm;
    public String telefone;
    public String especialidade;
    public String senha;

    public Medico() {
        nome = "Doutor";
        crm = "344";
        telefone = "11 951";
        especialidade = "Cardiologia";
        senha = "123";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Medico (String nome, String crm, String telefone, String especialidade, String senha) {
        try {
            if (nome == null || crm == null || telefone == null || especialidade == null || senha == null) {
                throw new Exception("Dados inválidos");
            }
            this.nome = nome;
            this.crm = crm;
            this.telefone = telefone;
            this.especialidade = especialidade;
            this.senha = senha;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção - Valores padrões definidos");
            this.nome = null;
            this.crm = null;
            this.telefone = null;
            this.especialidade = null;
            this.senha = null;
        }
    }

    public void acessar() {

    }

    void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("CRM: " + crm);
        System.out.println("Telefone: " + telefone);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Senha: " + senha);
    }
}