package br.edu.fatec.padroes.decorator.impl;

import br.edu.fatec.padroes.decorator.Bebida;
import br.edu.fatec.padroes.decorator.BebidaDecorator;

public class Capuccino extends BebidaDecorator {

	private Bebida bebida;
	
	public Capuccino(Bebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao() {
		return "Cappuccino Feliz";
	}

	@Override
	public Double valor() {
		return bebida.valor() + 2.19;
	}

}
