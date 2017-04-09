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
			System.out.println("Saque efetuado com sucesso! Seu saldo atual: R$" + this.getSaldo());
		} else if (valor > this.saldo && valor <= this.saldo + this.chequeEspecial){
			this.chequeEspecial = this.saldo + this.chequeEspecial - valor;
			this.chequeEspecial = this.chequeEspecial - 50;
			System.out.println("Uma quantia do seu cheque especial foi retirada para seu saque com uma taxa de R$50,00!");
			System.out.println("Sua quantia atual no cheque especial é de: R$" + this.getChequeEspecial());
			System.out.println("Seu saldo atual é de: R$" + this.getSaldo());
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void depositar (double valor){
		this.saldo = this.saldo + valor;
		System.out.println("Seu saldo atual é: R$" + this.getSaldo());
	}
	
	public void verSaldo (){
		System.out.println("Seu saldo é: R$" + getSaldo());
	}
	
	public void transfContaPoup (double valor){
		if (valor <= this.saldo) {
			this.saldo = (this.saldo - valor) - 1;
			System.out.println("Deposito de R$" + valor + " na conta poupança foi executado com sucesso! Foi cobrada uma taxa de transfereência de R&1,00.");
		} else {
			System.out.println("Saldo insufiente para completar a transferência");
		}
	}
}
