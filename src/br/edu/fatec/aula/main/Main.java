package br.edu.fatec.aula.main;

import br.edu.fatec.aula.Empregado;
import br.edu.fatec.aula.Gerente;
import br.edu.fatec.aula.imposto.CalculoImposto;
import br.edu.fatec.aula.imposto.ImpostoMG;
import br.edu.fatec.aula.imposto.Pessoa;
import br.edu.fatec.aula.imposto.PessoaFisica;
import br.edu.fatec.aula.imposto.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pf = new PessoaFisica();
		Pessoa pj = new PessoaJuridica();
		
		
		cadastrarPessoa(pf);
		cadastrarPessoa(pj);
				
	}
	
	public static void cadastrarPessoa(Pessoa pessoa) {		
		
		if(pessoa instanceof PessoaJuridica) {
			System.out.println("é juridica");
		}else if(pessoa instanceof PessoaFisica) {
			System.out.println("é fisica");
			PessoaFisica pf = (PessoaFisica) pessoa;
			pf.oi();
		}
	}

}
