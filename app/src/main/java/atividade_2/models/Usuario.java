package atividade_2.models;

public abstract class Usuario {
    private String nome;
    private String senha;

    public Usuario(){}

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if(!senha.chars().anyMatch(Character::isUpperCase))
            throw  new Exception("Senha invalida, precisa de um caracter maiusculo");
        this.senha = senha;
    }

}
