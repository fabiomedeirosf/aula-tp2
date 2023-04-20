package br.edu.fatec.financeira;

public abstract class BancoPadrao implements Aplicacao{
	
	@Override
	public void deposito(Conta conta, Double valor) {
		
		conta.atualizarSaldo(valor);
		
	}

	@Override
	public Double saque(Conta conta, Double valor) {
		
		if(conta.getSaldo() >= valor) {
			conta.atualizarSaldo(-valor);
			return valor;
		}
		return 0D;
	}
	
}
