package atividade_2.models;

import java.util.Date;

import atividade_2.Repository.IUsuario;

public class Recepcionista extends Usuario implements IUsuario<Recepcionista>{
   
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
    
    public Agenda marcarAgenda() throws Exception{
        Paciente p1 = new Paciente();
        p1.setCpf("123456789-44");
        p1.setTelefone("11954685542");
        p1.setNome("Jose da silva");
    
        Medico m1 = new Medico();
        m1.setCrm("234234234");
        m1.setEspecialidade("Geriatra");
        m1.setNome("Maria Antonieta");
        m1.setTelefone("2344-2344");

        Agenda a1 = new Agenda();
        a1.setData(new Date());
        a1.setMedico(m1);
        a1.setPaciente(p1);
        return a1;
    }
    

    @Override
    public boolean acessar(Recepcionista usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean desconectar(Recepcionista usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
