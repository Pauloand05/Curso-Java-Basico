package com.paulo.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor em metros: ");
		double metros = scan.nextDouble();
		
		double centimetros = 100 * metros;
		
		System.out.format("%.2f metros == %.2f centimentros", metros, centimetros);
	}

}
