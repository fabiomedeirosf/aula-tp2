package br.edu.fatec.aula;

public class Empregado extends Pessoa {

	public void funcaoTeste() {
		super.nome = "joao";
		super.cpf = "020202020202";
	}
	
	@Override
	public void fazerAlgo() {
		System.out.println("trabalha!!!");
	}
	
	public void faltar() {
		System.out.println("faltou");
	}
}
