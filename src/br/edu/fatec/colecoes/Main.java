package br.edu.fatec.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	/**
	 * Crie uma classe produto com codigo, valor e descricao, e: - OK
	 *  - crie uma lista com 100 produtos (gere dados arbitrários); - OK
	 *  - crie uma funçao que localize o produto por código; - OK
	 *  - crie uma função que localize o produto por descricao;
	 *  - crie equals e hashcode para o codigo do produto e use
	 *    a função contains para verificar a existencia do produto
	 * 
	 * @param strings
	 */

	public static void main(String...strings ) {
		
		List<Integer> listaValores = new ArrayList<Integer>();
		
		listaValores.add(10);
		listaValores.add(100);
		listaValores.add(99);
		
		for(int i = 0;  i < listaValores.size(); i++) {
			System.out.println(listaValores.get(i));
		}
		
		for(Integer x : listaValores) {
			System.out.println(x);
		}
		
		listaValores.forEach(x -> {
			System.out.println(x);
		});
		
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		listaAlunos.add(new Aluno(1, "joao", "1234"));
		listaAlunos.add(new Aluno(2, "kessia", "9876"));
		listaAlunos.add(new Aluno(99, "maria", "3456"));
		
		
		
		
		
		
		
		
		
		
		
		
		listaAlunos.forEach(a -> {
			System.out.println(a);
			
		});
		
		Aluno x = new Aluno();
		x.setCpf("9876");
		System.out.println(listaAlunos.contains(x));
	}
}
