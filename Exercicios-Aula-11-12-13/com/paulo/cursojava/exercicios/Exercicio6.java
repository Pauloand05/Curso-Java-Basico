package com.paulo.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o raio do circulo: ");
		double raio = scan.nextDouble();
		
		double areaCircle = 3.14 * Math.pow(raio, 2); 
		
		System.out.format("A area do circulo é de: %.2f m2", areaCircle);
	}

}
