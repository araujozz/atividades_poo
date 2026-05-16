package com.fatec.ads;

import com.fatec.ads.models.Agenda;
import com.fatec.ads.models.Medico;
import com.fatec.ads.models.Recepcionista;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
           Recepcionista maria = new Recepcionista();
           Medico joao = new Medico();

           Agenda agenda20260401 = maria.marcarAgenda();
           joao.realizarConsulta(agenda20260401);     
        }
        catch(Exception e){
            System.out.println("Ocorreu um erro "+ e.getMessage());    
        }
        
    }
}
