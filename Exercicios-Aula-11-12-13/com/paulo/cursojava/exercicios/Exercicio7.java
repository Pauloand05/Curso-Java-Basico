package com.paulo.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o lado do quadrado: ");
		double ladoQuadrado = scan.nextDouble();
		
		double areaQuadrado = ladoQuadrado * 2;
		
		System.out.format("O dobro da area do quadrado e: %.2f", areaQuadrado * 2);
	}

}
