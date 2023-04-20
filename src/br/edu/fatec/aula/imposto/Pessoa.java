package br.edu.fatec.aula.imposto;

public abstract class Pessoa {

	protected String nome;
	
	public abstract void obterAliquotaIR();
	
	public int contCaracteres() {
		return nome.length();
	}
}
