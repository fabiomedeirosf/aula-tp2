package br.edu.fatec.colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
/**
 * Crie um sistema para gerenciar apostas na mega sena de 6 dezenas;
 * Solicite ao usuário informar as dezenas de "azar".
 * 
 * O programa deverã gerar a quantidade de apostas solicitadas, porem,
 * desconsiderar os nũmeros de azar.
 * 
 * Depois de realizadas as apostas, crie um mecanismo que com base
 * no resultado do sorteio confira se houveram apostas vencedoras.
 * 
 * Exiba todas as apostas ao final indicando qual foi a vencedora.
 * 
 * @author fabio
 *
 */



public class Mapper {

	public static void main(String...strings) {
		
		Map<Integer, Integer> listaChave = new HashMap<Integer, Integer>();
		
		listaChave.put(10, 50);
		listaChave.put(20, 500);
		listaChave.put(30, 999);
		listaChave.put(40, 799);
		
		System.out.println(listaChave.get(10));
		
		System.out.println(listaChave.put(10, 99));
		System.out.println(listaChave.get(10));
		
		for(Entry<Integer, Integer> x : listaChave.entrySet()) {
			System.out.println("chave: " + x.getKey() 
							+ " valor: " + x.getValue());
		}
		
		
		
		
		
		System.out.println("computo de numeros");
		Map<Integer, Integer> contNumeros = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < 100000; i++) {
			
			Integer numero = (int) (Math.random() * 100);
			
			contNumeros.put(numero, contNumeros.getOrDefault(numero, 0) + 1);
			
		}
		
		for(Entry<Integer, Integer> x : contNumeros.entrySet()) {
			System.out.println("chave: " + x.getKey() 
							+ " valor: " + x.getValue());
		}
		

	}
}
