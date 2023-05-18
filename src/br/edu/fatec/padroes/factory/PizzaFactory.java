package br.edu.fatec.padroes.factory;

public class PizzaFactory {

	public Pizza create(PizzaEnum type) {
		
		Pizza p = null;
		
		if(PizzaEnum.CALABRESA.equals(type)) {
			p = new Calabresa();
			
		} else if (PizzaEnum.HOT_DOG_DO_VANDERLEI.equals(type)) {
			p = new HotDogDoVanderlei();
			
		} else if (PizzaEnum.LOMBINHO.equals(type)) {
			p = new Lombinho();
		}
		
		return p;
	}
}
