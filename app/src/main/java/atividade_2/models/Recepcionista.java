package atividade_2.models;

public class Recepcionista extends Usuario {
   
    private String cpf;
    private String telefone;

    public Recepcionista(){super("","");}
    

    public Recepcionista(String cpf, String nome, String senha, String telefone) {
        super(nome, senha);
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public String getCpf() {
        return cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setTelefone(String telefone) throws Exception {
        if(telefone.length()<9 || telefone.length()>11)
            throw new Exception("Telefone invalido");
        this.telefone = telefone;
    }

    public void mostrar(Recepcionista recepcionista){
        
        System.out.println("\n\n=== Recepcionista ===");
        System.out.println("Nome: " + recepcionista.getNome());
        System.out.println("CPF: " + recepcionista.getCpf());
        System.out.println("Telefone: " + recepcionista.getTelefone());
        
    }
    

    @Override
    public <T extends Usuario> boolean acessar(T usuario){
        if(usuario.getNome() != null && usuario.getSenha() != null)
            return true;

        return false;
    }
    
}
