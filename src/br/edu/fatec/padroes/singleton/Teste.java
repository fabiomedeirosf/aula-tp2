package br.edu.fatec.padroes.singleton;

public class Teste {

	public static void main(String...strings) {
		
		ConexaoSingleton.getInstance().abrirConexao();
		
		ConexaoSingleton c = ConexaoSingleton.getInstance();
		
		c.abrirConexao();
	}
}
