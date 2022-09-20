package br.senai.sp.jandira.model;

public class Especialidade {

	private String nome;
	private String descriçao;
	
	// Métodos de acesso getters and setters
	public void setNome(String novoNome) {
		nome = novoNome;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
	
	public String getDescriçao() {
		return descriçao;
	}
	
	
}
