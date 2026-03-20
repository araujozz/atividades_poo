package atividade_2.models;

import java.util.Date;

public class Exame {
    private Consulta consulta;
    private Date data;
    private String descritivo;

    public Exame(){}
    
    public Exame(Consulta consulta, Date data, String descritivo) {
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
    public void setData(Date data) throws Exception {
        if(data == null)
            throw new Exception("Data invalida");
        this.data = data;
    }
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public boolean Solicitar(){
        return  true;
    }

    public void Consultar(){}

    public void mostar(Exame exame){
        
        System.out.println("\n\n=== Exame ===");
        System.out.println("Descricao: " + exame.getDescritivo());
        System.out.println("Data: " + exame.getData());

        
    }
}
