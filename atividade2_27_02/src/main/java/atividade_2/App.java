package atividade_2;

import java.sql.Time;
import java.text.DateFormat;
import java.text.Format;
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
        Date hoje = new Date().DateFormat("dd/MM/yy");
        Time agora = new Time().now()

        Paciente paciente = new Paciente("Dino", "12345678910", "11958887766", "Masculino", 19);
        Medico medico = new Medico("Caio Rosa", "696969", "11937487290", "Clinico Geral", "Senha@2026");
        Recepcionista recepcionista =
            new Recepcionista("32165498700", "Marina Costa", "Recep#2024", "1188889999");
        Agenda agenda = new Agenda(hoje, agora, medico, paciente);
        Consulta consulta =
            new Consulta(hoje, "Sem historico relevante", agora, medico, "Consulta de rotina", paciente);
        Exame exame = new Exame(consulta, hoje, "Hemograma completo");
        Receita receita = new Receita(consulta, hoje, "Dipirona 500mg, tomar a cada 8h por 3 dias");

        mostrar(paciente, medico, recepcionista, agenda, consulta, exame, receita);
    }

    private static void mostrar(
        Paciente paciente,
        Medico medico,
        Recepcionista recepcionista,
        Agenda agenda,
        Consulta consulta,
        Exame exame,
        Receita receita
    ) {
        System.out.println("=== Paciente ===");
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("CPF: " + paciente.getCpf());
        System.out.println("Telefone: " + paciente.getTelefone());
        System.out.println("Genero: " + paciente.getGenero());
        System.out.println("Idade: " + paciente.getIdade());

        System.out.println("\n\n=== Medico ===");
        System.out.println("Nome: " + medico.getNome());
        System.out.println("CRM: " + medico.getCrm());
        System.out.println("Telefone: " + medico.getTelefone());
        System.out.println("Especialidade: " + medico.getEspecialidade());

        System.out.println("\n\n=== Recepcionista ===");
        System.out.println("Nome: " + recepcionista.getNome());
        System.out.println("CPF: " + recepcionista.getCpf());
        System.out.println("Telefone: " + recepcionista.getTelefone());

        System.out.println("\n\n=== Agenda ===");
        System.out.println("Data: " + agenda.getData());
        System.out.println("Hora: " + agenda.getHora());
        System.out.println("Medico: " + agenda.getMedico().getNome());
        System.out.println("Paciente: " + agenda.getPaciente().getNome());

        System.out.println("\n\n=== Consulta ===");
        System.out.println("Data: " + consulta.getData());
        System.out.println("Hora: " + consulta.getHora());
        System.out.println("Motivo: " + consulta.getMotivo());
        System.out.println("Historico: " + consulta.getHistorico());

        System.out.println("\n\n=== Exame ===");
        System.out.println("Descricao: " + exame.getDescritivo());
        System.out.println("Data: " + exame.getData());

        System.out.println("\n\n=== Receita ===");
        System.out.println("Descricao: " + receita.getDescritivo());
        System.out.println("Data: " + receita.getData());
    }
}
