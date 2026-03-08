package br.com.src;

public class Paciente {
    public String nome;
    public String cpf;
    public String telefone;
    public String genero;
    public int idade;

    public Paciente() {
        nome = "Caio";
        cpf = "544";
        telefone = "11 951667716";
        genero = "Masculino";
        idade = 19;
    }

    public Paciente(String nome, String cpf, String telefone, String genero, int idade) {
        try {
            if (nome == null || cpf == null || telefone == null || genero == null) {
                throw new Exception("Dados inválidos");
            }
            this.nome = nome;
            this.cpf = cpf;
            this.telefone = telefone;
            this.genero = genero;
            this.idade = idade;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção - Valores padrões definidos");
            this.nome = null;
            this.cpf = null;
            this.telefone = null;
            this.genero = null;
        }
    }

    public void cadastrar() {

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void consultar() {

    }

    void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Gênero: " + genero);
        System.out.println("Idade: " + idade);
    }
}