package atividade_2.models;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class Consulta {
    private Date data;
    private LocalTime hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;
    private List<Exame> exames;
    private List<Receita> receitas;

    public Consulta(){}
    
    public Consulta(Date data, String historico, LocalTime hora, Medico medico, String motivo, Paciente paciente) {
        this.data = data;
        this.historico = historico;
        this.hora = hora;
        this.medico = medico;
        this.motivo = motivo;
        this.paciente = paciente;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) throws Exception {

        if(paciente.getNome().isEmpty())
            throw new Exception("Usuario invalido");
        this.paciente = paciente;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public String getHistorico() {
        return historico;
    }
    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public boolean Marcar(){
        return true;
    }

    public boolean Cancelar(){
        return  true;
    }

    public void Consultar(){

    }

    public void Realizar(){}

    public boolean Atualiar(){
        return true;
    }

    public void mostrar(Consulta consulta){
        
        System.out.println("\n\n=== Consulta ===");
        System.out.println("Data: " + consulta.getData());
        System.out.println("Hora: " + consulta.getHora());
        System.out.println("Motivo: " + consulta.getMotivo());
        System.out.println("Historico: " + consulta.getHistorico());

        
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

}
