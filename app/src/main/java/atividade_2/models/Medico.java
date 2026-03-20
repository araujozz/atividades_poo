package atividade_2.models;


public class Medico extends Usuario {
    private String crm;
    private String telefone;
    private String especialidade;

    public Medico(){ super("",""); }

    public Medico(
        String nome,
        String crm,
        String telefone,
        String especialidade,
        String senha
    ){
        super(nome, senha);
        this.crm = crm;
        this.telefone = telefone;
        this.especialidade = especialidade;
        
    }
    
    public String getCrm(){return crm; };
    public void setCrm(String crm) throws Exception
    {
        if(crm.length()<6)
            throw new Exception("CRM invalido!");
        this.crm = crm;
    }

    public String getTelefone(){return telefone; };
    public void setTelefone(String telefone){this.telefone = telefone;}

    public String getEspecialidade(){return especialidade; };
    public void setEspecialidade(String especialidade){this.especialidade = especialidade;}

    @Override
    public <T extends Usuario> boolean acessar(T usuario){
        if(usuario.getNome() != null && usuario.getSenha() != null)
            return true;

        return false;
    }

    public void mostar(Medico medico){
        
        System.out.println("\n\n=== Medico ===");
        System.out.println("Nome: " + medico.getNome());
        System.out.println("CRM: " + medico.getCrm());
        System.out.println("Telefone: " + medico.getTelefone());
        System.out.println("Especialidade: " + medico.getEspecialidade());

        
    }
}
