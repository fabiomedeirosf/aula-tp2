package br.edu.fatec.padroes.factory;

public abstract class Pizza {

	protected String sabor;
	
	public void mostrarSabor() {
		System.out.println("sabor é: " + this.sabor);
	}
}
