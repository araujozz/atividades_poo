package atividade_2;

import java.time.LocalTime;
import java.util.Date;

import atividade_2.models.Agenda;
import atividade_2.models.Consulta;
import atividade_2.models.Exame;
import atividade_2.models.Medico;
import atividade_2.models.Paciente;
import atividade_2.models.Receita;
import atividade_2.models.Recepcionista;

public class App {
    public static void main(String[] args) {
        Date hoje = new Date();
        LocalTime agora =  LocalTime.now();

        Paciente paciente = new Paciente("Dino", "12345678910", "11958887766", "Masculino", 19);
        Medico medico = new Medico("Caio Rosa", "696969", "11937487290", "Clinico Geral", "Senha@2026");
        Recepcionista recepcionista = new Recepcionista("32165498700", "Marina Costa", "Recep#2024", "1188889999");
        Agenda agenda = new Agenda(hoje, agora, medico, paciente);
        Consulta consulta = new Consulta(hoje, "Sem historico relevante", agora, medico, "Consulta de rotina", paciente);
        Exame exame = new Exame(consulta, hoje, "Hemograma completo");
        Receita receita = new Receita(consulta, hoje, "Dipirona 500mg, tomar a cada 8h por 3 dias");

        paciente.mostar(paciente);
        medico.mostar(medico);
        recepcionista.mostrar(recepcionista);
        agenda.mostrar(agenda);
        consulta.mostrar(consulta);
        exame.mostar(exame);
        receita.mostrar(receita);
    }


}
