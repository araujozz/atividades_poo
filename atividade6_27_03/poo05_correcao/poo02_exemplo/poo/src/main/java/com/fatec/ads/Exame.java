package com.fatec.ads;

public class Exame extends Consulta {
    String dataExame;
    String descritivo;

    public void solicitar(){
        System.out.println(getExames());
    }
     @Override
    public void consultar(){}

    @Override
    public String getData() {
        return dataExame;
    }
     @Override
    public void setData(String data) {
        this.data = dataExame;
    }
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) throws Exception {
        if(descritivo==null || descritivo.length()<=0)
            throw new Exception("Informe o descritvo do exame");
        this.descritivo = descritivo;
    }
    public Exame( String data, String descritivo) {
     
        this.data = data;
        this.descritivo = descritivo;
    }
    public Exame() {
    }

    @Override
    public void mostrar() {
        var s = "Exame [ getData()=" + getData() + ", getDescritivo()="
                + getDescritivo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
        System.out.println(s);
    }

    
    
}
