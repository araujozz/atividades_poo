package atividade_2.models;

import java.sql.Time;
import java.util.Date;

public class Consulta {
    private Date data;
    private Time hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;

    public Consulta(Date data, String historico, Time hora, Medico medico, String motivo, Paciente paciente) {
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
}
