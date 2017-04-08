package br.fundatec.tdp.trabalho;

import java.util.Scanner;

public class BancoApp {
	public static void main(String[] args) {
		
		int opcao;
		double valor;
		
		ContaCorrente contaCorrente = new ContaCorrente(800);
		ContaPoupanca contaPoupanca = new ContaPoupanca(500);
		Scanner entrada = new Scanner(System.in);
		
		do{
			System.out.println("Bem vindo! Deseja adminsitrar sua:");
			System.out.println("(1) Conta Corrente");
			System.out.println("(2) Conta Poupança");
			System.out.println("(3) Sair");
			opcao = entrada.nextInt();
			
			if(opcao == 1){
				System.out.println("Bem vindo à sua Conta Corrente. Deseja:");
				System.out.println("(1) Sacar");
				System.out.println("(2) Depositar");
				System.out.println("(3) Ver saldo");
				System.out.println("(4)(5) Transferir dinheiro para a Conta Poupança");
				opcao = entrada.nextInt();
				
				switch (opcao){
					case 1: {
						System.out.println("Qual a contia que deseja sacar?");
						valor = entrada.nextDouble();
						
					}
				}
			}
			
			
			
			
		} while (opcao != 3);
		System.out.println("Volte quando quiser!");
		entrada.close();
		
	}
}
