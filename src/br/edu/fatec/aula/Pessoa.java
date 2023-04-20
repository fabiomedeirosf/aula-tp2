package br.edu.fatec.aula;

public class Pessoa {

	protected String nome;
	protected String cpf;
	
	private Double saldo;
	
	/**
	 * Construtor de pessoa sobrescrito
	 */
	public Pessoa() {
		System.out.println("Instanciou Pessoa");
	}

	public void fazerAlgo() {
		System.out.println("faz nada");
	}
	
	public void fazerAlgo(String x) {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	
	
}
