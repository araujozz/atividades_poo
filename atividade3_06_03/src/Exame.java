package br.com.src;

import java.time.LocalDate;

public class Exame {
    public Consulta consulta;
    public LocalDate data;
    public String descritivo;

    public Exame() {
        consulta = new Consulta();
        data = LocalDate.of(2026,02,22);
        descritivo = "Rotina";
    }

    public Exame(Consulta consulta, LocalDate data, String descritivo) {
        try {
            if (consulta == null || data == null || descritivo == null) {
                throw new Exception("Dados inválidos");
            }
            this.consulta = consulta;
            this.data = data;
            this.descritivo = descritivo;
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção - Valores padrões definidos");
            this.consulta = null;
            this.data = null;
            this.descritivo = null;
        }
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void solicitar() {

    }

    public void consultar() {

    }

    void mostrar() {
        System.out.println("Consulta: " + consulta);
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descritivo);
    }
}