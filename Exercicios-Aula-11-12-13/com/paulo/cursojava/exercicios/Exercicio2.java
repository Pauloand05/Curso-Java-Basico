package com.paulo.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		
		System.out.format("O valor digitado foi: %d", numero);
	}

}
