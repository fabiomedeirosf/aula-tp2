package br.edu.fatec.padroes.decorator;

import br.edu.fatec.padroes.decorator.impl.CafeExpresso;
import br.edu.fatec.padroes.decorator.impl.Capuccino;

public class Cafeteria {

	public static void main(String...strings ) {
		
		Bebida expresso = new CafeExpresso();
		
		System.out.println(expresso.getDescricao() + " => " + 
						   expresso.valor());
		
		Bebida cappuccino = new Capuccino(expresso);
	
		System.out.println(cappuccino.getDescricao() + " => " + 
						   cappuccino.valor());
	}
}
