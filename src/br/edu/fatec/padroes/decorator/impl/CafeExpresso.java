package br.edu.fatec.padroes.decorator.impl;

import br.edu.fatec.padroes.decorator.Bebida;

public class CafeExpresso extends Bebida {

	public CafeExpresso() {
		super.descricao = "cafe expresso raiz";
	}
	
	@Override
	public Double valor() {
		
		return 3.5;
	}

}
