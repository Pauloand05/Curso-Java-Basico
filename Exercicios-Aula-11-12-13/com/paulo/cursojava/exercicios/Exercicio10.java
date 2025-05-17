package com.paulo.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celcius: ");
		double grauCelsius = scan.nextDouble();
		
		double grauFarenheit = grauCelsius * 1.8 + 32;
		
		System.out.format("%.2f graus Celcius == %.2f graus Farenheit.", grauCelsius, grauFarenheit);

	}

}
