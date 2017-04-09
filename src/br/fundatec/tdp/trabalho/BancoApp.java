package br.fundatec.tdp.trabalho;

import java.util.Scanner;

public class BancoApp {
	public static void main(String[] args) {
		
		int opcao, opcao2;
		double valor;
		
		ContaCorrente contaCorrente = new ContaCorrente(800);
		ContaPoupanca contaPoupanca = new ContaPoupanca(500);
		Scanner entrada = new Scanner(System.in);
		
		do{
			System.out.println("Bem vindo! Deseja adminsitrar sua:");
			System.out.println("(1) Conta Corrente");
			System.out.println("(2) Conta Poupança");
			System.out.println("(3) Sair");
			opcao2 = entrada.nextInt();
			
			if(opcao2 == 1){
				System.out.println("Bem vindo à sua Conta Corrente. Deseja:");
				System.out.println("(1) Sacar");
				System.out.println("(2) Depositar");
				System.out.println("(3) Ver saldo");
				System.out.println("(4) Transferir dinheiro para a Conta Poupança");
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
						contaCorrente.verSaldo();
						break;
					}
				}
			}	
		} while (opcao2 != 3);
		System.out.println("Volte quando quiser!");
		entrada.close();
		
	}
}
