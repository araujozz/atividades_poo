package com.fatec.ads;

public class Receita extends  Prodecimento {
   
    public Receita(String data, String descritivo) {
        this.data = data;
        this.descritivo = descritivo;
    }

    public void preescrever(){
        System.out.println(data + descritivo);
    };

    public void consultar(){
        System.out.println("Consultando receita: Data " + super.getData() + ", Descritivo: " + super.getDescritivo());
    }
   
    public Receita() {
    }

   
    public void mostrar() {
       
    };


    
}
