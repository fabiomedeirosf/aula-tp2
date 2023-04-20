package br.edu.fatec.aula.imposto;

public class CalculoImposto {

	/**
	 * Função para calcular imposto devido sobre um valor
	 * @param valor atributo que será usado como referência
	 * @return valor do imposto devido
	 */
	public Double calcularImposto(Double valor) {
		
		Double impostoDevido = 0D;
		
		if ( valor > 100) {
			impostoDevido = valor * 0.05;
		}
		
		return impostoDevido;
	}
}
