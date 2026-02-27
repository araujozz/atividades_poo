package atividade_2.models;

import java.sql.Time;
import java.util.Date;

public class Agenda {

    private Date data;
    private Time hora;
    private Medico medico;
    private Paciente paciente;

    public Agenda(Date data, Time hora, Medico medico, Paciente paciente) {
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

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
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

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void consultar(){
        
    }
}
