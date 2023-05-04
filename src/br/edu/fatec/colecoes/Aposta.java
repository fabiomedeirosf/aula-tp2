package br.edu.fatec.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Aposta {

	private Integer codigo;
	private List<Integer> dezenas;
	
	public Aposta() {
		this.dezenas = new ArrayList<Integer>();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public List<Integer> getDezenas() {
		return dezenas;
	}

	public void setDezenas(List<Integer> dezenas) {
		this.dezenas = dezenas;
	}
	
	
}
