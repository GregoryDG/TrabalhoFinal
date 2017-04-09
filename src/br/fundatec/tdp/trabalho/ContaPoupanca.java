package br.fundatec.tdp.trabalho;

public class ContaPoupanca {
	private double saldo;

	public ContaPoupanca(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar (double valor){
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque efetuado com sucesso! Seu saldo atual: R$" + this.getSaldo());
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void depositar (double valor){
		this.saldo = this.saldo + valor;
		System.out.println("Seu saldo atual é: R$" + this.getSaldo());
	}
	
	public void verSaldo(){
		System.out.println("Seu saldo é: R$" + getSaldo());
	}

	public void transfContaCorren (double valor){
		if (valor <= this.saldo) {
			this.saldo = (this.saldo - valor);
			System.out.println("Deposito de R$" + valor + " na conta corrente foi executado com sucesso! Foi cobrada uma taxa de transfereência de R&1,00.");
		} else {
			System.out.println("Saldo insufiente para completar a transferência");
		}

	}
}
