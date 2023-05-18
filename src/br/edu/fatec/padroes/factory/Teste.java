package br.edu.fatec.padroes.factory;

public class Teste {

	public static void main(String...strings) {
		
		PizzaFactory factory = new PizzaFactory();
		
		Pizza p = factory.create(PizzaEnum.CALABRESA);
		
		p.mostrarSabor();
		
	}
}
