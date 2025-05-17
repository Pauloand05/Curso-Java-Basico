package com.paulo.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite dois numeros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.format("%d + %d = %d", num1, num2, num1 + num2);
	}

}
