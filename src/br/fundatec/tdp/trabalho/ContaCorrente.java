package br.fundatec.tdp.trabalho;

public class ContaCorrente {
	private double saldo, chequeEspecial = 500;

	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public void sacar (double valor){
		if(valor <= this.saldo){
			this.saldo = this.saldo - valor;
			System.out.print("Saque efetuado com sucesso! Seu saldo atual: " + this.getSaldo());
		}
		
	}
	
}
