package com.fatec.ads;

public class Exame extends  Prodecimento {
    

    public void solicitar(){}
    public void consultar(){
        System.out.println("Consultando exame: Data " + super.getData() + ", Descritivo: " + super.getDescritivo());
    }

   
   
    public Exame( String data, String descritivo) {
     
        this.data = data;
        this.descritivo = descritivo;
    }
    public Exame() {

    }
   
    public void mostrar() {
      
    }

    
    
}
