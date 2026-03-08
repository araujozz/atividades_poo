package br.com.src;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    public LocalDate data;
    public LocalTime hora;
    public Medico medico;
    public Paciente paciente;
    public String motivo;
    public String historico;

    public Consulta() {
        data = LocalDate.of(2026,02,22);
        hora = LocalTime.of(22,11);
        medico = new Medico();
        paciente = new Paciente();
        motivo = "Rotina";
        historico = "Sem informações";
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
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

    public Consulta(LocalDate data, LocalTime hora, Medico medico, Paciente paciente, String motivo, String historico) {
        try {
            if (data == null || hora == null || medico == null || paciente == null || motivo == null || historico == null) {
                throw new Exception("Dados inválidos");
            }
            this.data = data;
            this.hora = hora;
            this.medico = medico;
            this.paciente = paciente;
            this.motivo = motivo;
            this.historico = historico;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção - Valores padrão definidos");
            this.data = null;
            this.hora = null;
            this.medico = null;
            this.paciente = null;
            this.motivo = null;
            this.historico = null;
        }
    }

    public void marcar() {

    }

    public void cancelar() {

    }

    public void consultar() {

    }

    public void realizar() {

    }

    public void atualizar() {

    }

    void mostrar() {
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Médico responsável: " + medico);
        System.out.println("Paciente: " + paciente);
        System.out.println("Motivo: " + motivo);
        System.out.println("Histórico: " + historico);
    }
}