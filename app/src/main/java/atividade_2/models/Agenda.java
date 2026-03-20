package atividade_2.models;

import java.time.LocalTime;
import java.util.Date;

public class Agenda {

    private Date data;
    private LocalTime hora;
    private Medico medico;
    private Paciente paciente;

    public Agenda(){}
    
    public Agenda(Date data, LocalTime hora, Medico medico, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
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

    public void setMedico(Medico medico) throws Exception {
        if(medico.getNome().isEmpty() || medico.getCrm().isEmpty())
            throw new Exception("Medico invalido");
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void consultar(){
        
    }

    public void mostrar(Agenda agenda){
        System.out.println("\n\n=== Agenda ===");
        System.out.println("Data: " + agenda.getData());
        System.out.println("Hora: " + agenda.getHora());
        System.out.println("Medico: " + agenda.getMedico().getNome());
        System.out.println("Paciente: " + agenda.getPaciente().getNome());
    }
}
