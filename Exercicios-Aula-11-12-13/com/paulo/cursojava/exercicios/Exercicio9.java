package com.paulo.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Farenheit: ");
		double grauFarenheit = scan.nextDouble();
		
		double grauCelcius = 5 * (grauFarenheit - 32) / 9;
		
		System.out.format("%.2f graus Farenheit == %.2f graus Celcius.", grauFarenheit, grauCelcius);

	}

}
