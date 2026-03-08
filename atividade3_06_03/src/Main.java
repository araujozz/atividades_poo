package br.com.src;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        // Paciente
        Paciente newPaciente = new Paciente();
        newPaciente.nome = "Caio Rosa";
        newPaciente.cpf = "123456789-00";
        newPaciente.telefone = "11999999";
        newPaciente.genero = "Masculino";
        newPaciente.idade = 19;

        // Médico
        Medico doutor = new Medico();
        doutor.nome = "Cleber";
        doutor.crm = "666";
        doutor.telefone = "11999";
        doutor.especialidade = "Cardiologia";
        doutor.senha = "123";

        // Recepcionista
        Recepcionista newRecepcionista = new Recepcionista();
        newRecepcionista.nome = "Claúdia";
        newRecepcionista.cpf = "123456789-00";
        newRecepcionista.telefone = "11999";
        newRecepcionista.senha = "321";

        // Agenda
        Agenda newAgenda = new Agenda();
        newAgenda.data = LocalDate.of(2026, 2, 22);
        newAgenda.hora = LocalTime.of(15, 40, 0);
        newAgenda.medico = doutor;
        newAgenda.paciente = newPaciente;

        // Consulta
        Consulta newConsulta = new Consulta();
        newAgenda.data = LocalDate.of(2026, 2, 22);
        newAgenda.hora = LocalTime.of(15, 40, 0);
        newConsulta.medico = doutor;
        newConsulta.paciente = newPaciente;
        newConsulta.motivo = "rotina";
        newConsulta.historico = "Novo histórico";

        // Receita
        Receita newReceita = new Receita();
        newReceita.consulta = newConsulta;
        newAgenda.data = LocalDate.of(2026, 02, 22);
        newReceita.descritivo = "Receita para remédio X";

        // Exame
        Exame newExame = new Exame();
        newExame.consulta = newConsulta;
        newAgenda.data = LocalDate.of(2026, 02, 22);
        newExame.descritivo = "Exame cardiológico";



        newPaciente.mostrar();
        doutor.mostrar();
        newRecepcionista.mostrar();
        newAgenda.mostrar();
        newConsulta.mostrar();
        newReceita.mostrar();
        newExame.mostrar();
    }
}