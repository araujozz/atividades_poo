package atividade_2.models;

import java.util.Date;

public class Receita {
    private Consulta consulta;
    private Date data;
    private String descritivo;

    public Receita(Consulta consulta, Date data, String descritivo) {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void Prescrecer(){}
    public void  consutar(){}
}
