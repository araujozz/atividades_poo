package atividade_2.models;

import java.util.Date;

import atividade_2.Repository.IUsuario;


public class Medico extends Usuario implements IUsuario<Medico>{
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


    public void mostar(Medico medico){
        
        System.out.println("\n\n=== Medico ===");
        System.out.println("Nome: " + medico.getNome());
        System.out.println("CRM: " + medico.getCrm());
        System.out.println("Telefone: " + medico.getTelefone());
        System.out.println("Especialidade: " + medico.getEspecialidade());
    }

    public void realizarConsulta(Agenda agenda) throws Exception{
        Consulta c1 = new Consulta();

        c1.setData(agenda.getData());
        c1.setHora(agenda.getHora());
        c1.setMedico(agenda.getMedico());
        c1.setPaciente(agenda.getPaciente());
        c1.setMotivo("Dor ");
        c1.setHistorico("dores anteriores");

        Exame e1 = new Exame(c1, agenda.getData(), "muitas coisas");

        c1.getExames().add(e1);
        c1.getExames().add(new Exame(c1, new Date(), "eita ne"));
        c1.getReceitas().add(new Receita(c1, new Date(), "vish"));
        c1.mostrar(c1);


    }

    @Override
    public boolean acessar(Medico usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean desconectar(Medico usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
