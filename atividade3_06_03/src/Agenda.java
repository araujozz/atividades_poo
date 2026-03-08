package br.com.src;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {
    public LocalDate data;
    public LocalTime hora;
    public Medico medico;
    public Paciente paciente;

    public Agenda() {
        data = LocalDate.of(2026,02,22);
        hora = LocalTime.of(22,30);
        medico = new Medico();
        paciente = new Paciente("Caio", "544", "11 951", "Masculino", 19);
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
        try {
            this.medico = medico;
        } catch (Exception e) {
            this.medico = null;
            System.out.println("Ocorreu uma exceção - Valores padrões definidos");
        }
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Agenda(LocalDate data, LocalTime hora, Medico medico, Paciente paciente) {
        try {
            if (data == null || hora == null || medico == null || paciente == null) {
                throw new Exception("Dados inválidos");
            }
            this.data = data;
            this.hora = hora;
            this.medico = medico;
            this.paciente = paciente;
        } catch(Exception e) {
            System.out.println("Ocorreu uma exceção - Valores padrões definidos");
            this.data = null;
            this.hora = null;
            this.medico = null;
            this.paciente = null;
        }
    }

    public void consultar() {

    }

    void mostrar() {
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Médico: " + medico);
        System.out.println("Paciente: " + paciente);
    }
}