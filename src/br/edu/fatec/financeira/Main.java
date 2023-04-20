package br.edu.fatec.financeira;

public class Main {

	public static void main(String...strings) {
		
		Conta c1 = new Conta(100);
		System.out.println("conta: " + c1.getNumero());
		System.out.println("Saldo: " + c1.getSaldo());
		
		Aplicacao aplicacao = new FatecBank();
		aplicacao.deposito(c1, 999.99);
		
		System.out.println("conta: " + c1.getNumero());
		System.out.println("Saldo: " + c1.getSaldo());
		
		Conta c2 = new Conta(200);
		Aplicacao aplicacao2 = new FrancaBank();
		aplicacao2.deposito(c2, 1000.00);
		aplicacao2.deposito(c2, 500.00);
		aplicacao2.saque(c2, 100.00);
		
		for(String s : c2.getExtrato()) {
			System.out.println(s);
		}
		
	}
}

