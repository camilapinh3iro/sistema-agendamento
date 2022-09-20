package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {

	private Especialidade especialidades;
	private Paciente paciente;
	private Medico medico;
	private LocalDate dataDaConsulta;
	private LocalTime horaDaConsulta;

	public Especialidade getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(Especialidade especialidades) {
		this.especialidades = especialidades;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public LocalDate getDataDaConsulta() {
		return dataDaConsulta;
	}

	public void setDataDaConsulta(LocalDate dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}

	public LocalTime getHoraDaConsulta() {
		return horaDaConsulta;
	}

	public void setHoraDaConsulta(LocalTime horaDaConsulta) {
		this.horaDaConsulta = horaDaConsulta;
	}

	public boolean isComparecimento() {
		return comparecimento;
	}

	public void setComparecimento(boolean comparecimento) {
		this.comparecimento = comparecimento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	private boolean comparecimento;
	private String observacao;

}
