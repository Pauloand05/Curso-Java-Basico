package com.paulo.cursojava.aula12;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDadosTeclado {
	
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
//		System.out.println("Digite seu nome completo: ");
//		String nomeCompleto = scan.nextLine();
//		System.out.format("Seu nome completo é: %s\n", nomeCompleto);
//		
//		System.out.print("Digite seu primeiro nome: ");
//		String primeiroNome = scan.nextLine();
//		System.out.format("Seu primeiro nome é: %s\n",primeiroNome);
//		
//		System.out.print("Digite sua idade: ");
//		int idade = scan.nextInt();
//		System.out.format("Sua idade é %d anos",idade);
		
//		System.out.print("Digite sua altura: ");
//		double altura = scan.nextDouble();
//		System.out.format("Sua altura é %.2f\n",altura);
		
		System.out.println("Digite seu primeiro nome, sua idade, sua altura: ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		double altura = scan.nextDouble();
		System.out.format("Primeiro nome: %s\nIdade: %d\nAltura: %.2f", primeiroNome
				, idade, altura);
	}
}

