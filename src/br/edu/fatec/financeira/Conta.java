package br.edu.fatec.financeira;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {

	private Integer numero;
	
	private Double saldo;
	
	private Double valorEmprestimo;
	
	private List<String> extrato = new ArrayList<String>();
	
	/**
	 * Construtor
	 * @param numero
	 */
	public Conta(Integer numero) {
		this.numero = numero;
		this.saldo = 0D;
	}

	public void atualizarSaldo(Double valor) {
		
		this.saldo += valor;
		
		Date dataAtual = new Date(System.currentTimeMillis());
		
		this.extrato.add(dataAtual + "movimentacao: " + valor);
	}
	
	public void mostrarExtrato() {
		System.out.println("####### EXTRATO ######");
		for(String s : this.extrato) {
			System.out.println(s);
		}
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(Double valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}
	
	public List<String> getExtrato() {
		return extrato;
	}
	
	
	
}
