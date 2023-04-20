package br.edu.fatec.financeira;

public class FrancaBank extends BancoPadrao implements Emprestimo {

	@Override
	public void emprestar(Conta conta, Double valor) {
		
		conta.setValorEmprestimo(conta.getValorEmprestimo() + valor);
		
	}
	
	@Override
	public void deposito(Conta conta, Double valor) {
		
		Double deposito = valor * 1.01;
		
		conta.atualizarSaldo(deposito);
	}
}
