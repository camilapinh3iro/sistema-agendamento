package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Genero;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {

		// Especialidades
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");

		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolarigologia");

		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Fisioterapia");
		especialidade3.setDescriçao(
				"Ela estuda, diagnostica, previne e trata os distúrbios, entre outros, cinético-funcionais decorrentes de alterações de órgãos e sistemas humanos.");

		Especialidade especialidade4 = new Especialidade();
		especialidade4.setNome("Gastroenterologia");

		Especialidade especialidade5 = new Especialidade();
		especialidade5.setNome("Clínica Geral");

		//
		PlanoDeSaude plano1 = new PlanoDeSaude();
		plano1.setOperadora("Unimed");
		plano1.setTipoDoPlano("Bronze");

		PlanoDeSaude plano2 = new PlanoDeSaude();
		plano2.setOperadora("Bradesco");
		plano2.setTipoDoPlano("Ouro");

		// Criando endereços
		Endereco endereço1 = new Endereco();
		endereço1.setLongradouro("Rua Eltn Silva");
		endereço1.setNumero("905");
		endereço1.setBairro("Centro");
		endereço1.setCidade("Jandira");
		endereço1.setComplemento("Escola");
		endereço1.setPontoDeReferencia("Em frente à Prefeitura");
		endereço1.setEstado(Estados.SAO_PAULO);
		endereço1.setCep("06600-025");

		Endereco endereço2 = new Endereco();
		endereço2.setLongradouro("Avenida José Márcio");
		endereço2.setNumero("406");
		endereço2.setBairro("Jardim Itacolomi");
		endereço2.setCidade("Itapevi");
		endereço2.setComplemento("Escola");
		endereço2.setEstado(Estados.SAO_PAULO);
		endereço2.setCep("06699-023");

		// Médicos
		Medico medico1 = new Medico();
		medico1.setNome("Sabrina Santos");
		medico1.setCrm("7869-10");
		medico1.setSexo("Feminino");
		medico1.setDataDeNascimento(LocalDate.of(1995, 07, 24));

		// A Dra. Sabrina é Clínica Geral e Fisioterapeuta
		Especialidade[] especialidades1 = { especialidade3, especialidade5 };
		medico1.setEspecialidades(especialidades1);

//		 System.out.println(especialidade3.getNome());
//		 System.out.println(especialidades1[0].getDescriçao());
//		 System.out.println(especialidades1[0].getNome());

		// Criar Dr. Pedro Oliveira, nascido em 20/08/1984 e que trabalha com
		// cardiologia,
		// fisiotarapia e clinica geral.
		Medico medico2 = new Medico();
		medico2.setNome("Pedro Oliveira");
		medico2.setCrm("4567-89");
		medico2.setSexo("Masculino");
		medico2.setDataDeNascimento(LocalDate.of(1984, 8, 20));

		Especialidade[] especialidades2 = { especialidade1, especialidade3, especialidade5 };

		medico2.setEspecialidades(especialidades2);

		// Pacientes
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Beatriz Coelho");
		paciente1.setCpf("493466968-00");
		paciente1.setEndereco(endereço1);
		paciente1.setRg("5953423-4");
		paciente1.setGenero(Genero.FEMININO);
		paciente1.setTipoSanguineo("A+");
		paciente1.setPlanoDeSaude(plano1);
		paciente1.setEmail("coelhalandi@gmail.com");
		paciente1.setTelefone("(11)96974-4334");

		Paciente paciente2 = new Paciente();
		paciente2.setNome("Camila Alves");
		paciente2.setCpf("549022548-32");
		paciente2.setEndereco(endereço2);
		paciente2.setRg("60222340-4");
		paciente2.setGenero(Genero.FEMININO);
		paciente2.setTipoSanguineo(null);
		paciente2.setPlanoDeSaude(plano2);
		paciente2.setEmail("pinheirocamila59800@gmail.com");
		paciente2.setTelefone("(11)95343-8228");

		// Exibir dados dos pacientes:
		// Nome:
		// Cidade:
		// Estado:
		// Telefone:
		// Operadora do plano de saúde:
//		 System.out.println("Nome: " + paciente1.getNome());
//		 System.out.println("Cidade: " + paciente1.getEndereco().getCidade());
//		 System.out.println("Estado: " + paciente1.getEndereco().getEstado());
//		 System.out.println("Telefone: " + paciente1.getTelefone());
//		 System.out.println("Operadora: " + paciente1.getPlanoDeSaude().getOperadora());
//		 System.out.println("------------------------------------------------");
//		 System.out.println("Nome: " + paciente2.getNome());
//		 System.out.println("Cidade: " + paciente2.getEndereco().getCidade());
//		 System.out.println("Estado: " + paciente2.getEndereco().getEstado());
//		 System.out.println("Telefone: " + paciente2.getTelefone());
//		 System.out.println("Operadora: " + paciente2.getPlanoDeSaude().getOperadora());

		// Agendamento paciente1
		// O paciente precisa passar com o clinico geral
		// No dia 22/09/22, às 15h25
		Agenda agenda1 = new Agenda();
		agenda1.setMedico(medico2);
		agenda1.setPaciente(paciente1);
		agenda1.setEspecialidades(especialidade5);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 22));
		agenda1.setHoraDaConsulta(LocalTime.of(15, 25, 0));
		agenda1.setObservacao("Paciente reclamando de dor nas costas.");

		// Exibir dados do agendamento
		System.out.println("------------AGENDAMENTO DE CONSULTA------------");
		System.out.println("Nome: " + agenda1.getPaciente().getNome());
		System.out.println("Médico: " + agenda1.getMedico().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidades().getNome());
		System.out.println("Data da consulta: " + agenda1.getDataDaConsulta() + " - " + agenda1.getHoraDaConsulta());
//		 System.out.println("Hora da consulta: " + agenda1.getHoraDaConsulta());
		System.out.println("Observações: " + agenda1.getObservacao());
		System.out.println("Plano de saúde: " + agenda1.getPaciente().getPlanoDeSaude().getOperadora());

		// Agendamento paciente2
		// Cadiologista
		// No dia 26/09/2022 às 09h00
		Agenda agenda2 = new Agenda();
		agenda2.setMedico(medico2);
		agenda2.setPaciente(paciente2);
		agenda2.setEspecialidades(especialidade1);
		agenda2.setDataDaConsulta(LocalDate.of(2022, 9, 26));
		agenda2.setHoraDaConsulta(LocalTime.of(9, 00, 0));
		agenda2.setObservacao("Paciente reclamando de dor no peito.");

		// Exibir dados do agendamento
		System.out.println("-----------------------------------------------");
		System.out.println("Nome: " + agenda2.getPaciente().getNome());
		System.out.println("Médico: " + agenda2.getMedico().getNome());
		System.out.println("Especialidade: " + agenda2.getEspecialidades().getNome());
		System.out.println("Data da consulta: " + agenda2.getDataDaConsulta() + " - " + agenda2.getHoraDaConsulta());
		System.out.println("Observações: " + agenda2.getObservacao());
		System.out.println("Plano de saúde: " + agenda2.getPaciente().getPlanoDeSaude().getOperadora());

	}

}
