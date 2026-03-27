package com.fatec.ads;

public class Receita extends Consulta {
    String dataReceita;
    String descritivo;

    public Receita(String data, String descritivo) {
        this.dataReceita = data;
        this.descritivo = descritivo;
    }

    public void preescrever(){
        System.out.println(getReceitas());
        
    };
    @Override
    public void consultar(){}
   
    @Override
    public String getData() {
        return dataReceita;
    }
    @Override
    public void setData(String data) {
        this.dataReceita = data;
    }
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) throws Exception 
    {
         if(descritivo==null || descritivo.length()<=0)
            throw new Exception("Informe o descritvo do exame");
     
        this.descritivo = descritivo;
    }

    public Receita() {
    }

   
    @Override
    public void mostrar() {
        var s = "Receita [ getData()=" + getData() + ", getDescritivo()="
                + getDescritivo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
        System.out.println(s);
    }


    
}
