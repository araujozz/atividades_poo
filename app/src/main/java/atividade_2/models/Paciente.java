package atividade_2.models;

public class Paciente {
    private  String nome;
    private  String cpf;
    private String telefone;
    private String genero;
    private  int idade;

    public Paciente(){}
    
    public Paciente(
        String nome,
        String cpf,
        String telefone,
        String genero,
        int idade
    ){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.idade = idade;
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

    public void setCpf(String cpf) throws Exception {
        if(cpf.length()<11)
            throw new Exception("CPF invalido");
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

    public void Cadastro(Paciente paciente){

    }

    public Paciente[] Consultar(){
        Paciente[] result = {new Paciente("dino", "12334", "1234", "masculino", 19) };
        return result;
    }

    public void mostar(Paciente paciente){
        System.out.println("=== Paciente ===");
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("CPF: " + paciente.getCpf());
        System.out.println("Telefone: " + paciente.getTelefone());
        System.out.println("Genero: " + paciente.getGenero());
        System.out.println("Idade: " + paciente.getIdade());
    }
}

