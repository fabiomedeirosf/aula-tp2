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
		int quantidadeAposta = scanner.nextInt();
		
		for(int i = 0; i < quantidadeAposta; i++) {
			//TODO: alterar para lista de apostas
		}
		Aposta aposta = gerarAposta(listaAzar);
		
		System.out.println(aposta.getDezenas().toString());
		
	}
	
	public static Aposta gerarAposta(List<Integer> numerosAzar) {
		
		Aposta novaAposta = new Aposta();
		
		List<Integer> dezenas = new ArrayList<Integer>();
		
		for(int i = 0; i < 6; i++) {
			
			Integer aposta = (int) (Math.random() * 100);
			
			if(aposta <= 0 || aposta > 60 
					|| numerosAzar.contains(aposta) 
					|| dezenas.contains(aposta)) {
				i--;
				continue;
			}
			dezenas.add(aposta);
		}
		
		novaAposta.setCodigo(10);
		novaAposta.setDezenas(dezenas);
		
		return novaAposta;
	}
}
