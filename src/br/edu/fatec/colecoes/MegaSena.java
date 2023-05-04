package br.edu.fatec.colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MegaSena {

	
	public static void main(String... args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> listaAzar = new ArrayList<Integer>();
		listaAzar.add(8);
		listaAzar.add(9);
		listaAzar.add(7);
		
		System.out.println("Informe a quantidade apostas: ");
		int apostas = scanner.nextInt();
		
		List<Integer> listaAposta = new ArrayList<Integer>();
		
		for(int i = 0; i < 6; i++) {
			
			Integer aposta = (int) (Math.random() * 100);
			
			if(aposta <= 0 
					|| aposta > 60 
					|| listaAzar.contains(aposta) 
					|| listaAposta.contains(aposta)) {
				i--;
				continue;
			}
			listaAposta.add(aposta);
		}
		
		System.out.println(listaAposta.toString());
		
		
	}
}
