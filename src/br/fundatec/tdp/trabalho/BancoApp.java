package br.fundatec.tdp.trabalho;

import java.util.Scanner;

public class BancoApp {
	public static void main(String[] args) {
		
		int opcao, opcao2;
		double valor;
		
		ContaCorrente contaCorrente = new ContaCorrente(1000);
		ContaPoupanca contaPoupanca = new ContaPoupanca(1000);
		Scanner entrada = new Scanner(System.in);
		
		do{
			System.out.println("Bem vindo! Deseja adminsitrar sua:");
			System.out.println("(1) Conta Corrente");
			System.out.println("(2) Conta Poupan�a");
			System.out.println("(3) Sair");
			opcao2 = entrada.nextInt();
			
			if(opcao2 == 1){
				System.out.println("Bem vindo � sua Conta Corrente. Deseja:");
				System.out.println("(1) Sacar");
				System.out.println("(2) Depositar");
				System.out.println("(3) Ver saldo");
				System.out.println("(4) Transferir dinheiro para a Conta Poupan�a");
				opcao = entrada.nextInt();
				
				switch (opcao){
					case 1: {
						System.out.println("Qual a contia que deseja sacar?");
						valor = entrada.nextDouble();
						contaCorrente.sacar(valor);
						break;
					}
					case 2: {
						System.out.println("Qual a contia que deseja depositar?");
						valor = entrada.nextDouble();
						contaCorrente.depositar(valor);
						break;
					}
					case 3: {
						contaCorrente.verSaldo();
						break;
					}
					case 4: {
						System.out.println("Qual a contia que deseja transferir?");
						valor = entrada.nextDouble();
						contaCorrente.transfContaPoup(valor);
						break;
					}
					default: {
						System.out.println("Essa opera��o � inv�lida");
					}
				}
			} else if (opcao2 == 2){
				System.out.println("Bem vindo � sua Conta Poupan�a. Deseja:");
				System.out.println("(1) Sacar");
				System.out.println("(2) Depositar");
				System.out.println("(3) Ver saldo");
				System.out.println("(4) Transferir dinheiro para a Conta Corrente");
				opcao = entrada.nextInt();
				
				switch (opcao){
					case 1: {
						System.out.println("Qual a contia que deseja sacar?");
						valor = entrada.nextDouble();
						contaPoupanca.sacar(valor);
						break;
					}
					case 2: {
						System.out.println("Qual a contia que deseja depositar?");
						valor = entrada.nextDouble();
						contaPoupanca.depositar(valor);
						break;
					}
					case 3: {
						contaPoupanca.verSaldo();
						break;
					}
					case 4: {
						System.out.println("Qual a contia que deseja transferir?");
						valor = entrada.nextDouble();
						contaPoupanca.transfContaCorren(valor);
						break;
					}
					default: {
						System.out.println("Essa opera��o � inv�lida");
					}
				}
			}
		} while (opcao2 != 3);
		System.out.println("Volte quando quiser!");
		entrada.close();
		
	}
}
