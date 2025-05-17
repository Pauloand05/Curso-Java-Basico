package com.paulo.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		System.out.println("Digite dois valores inteiro em seguida um valor real: ");
		int valorInt = scan.nextInt();
		int valorInt2 = scan.nextInt();
		float valorReal = scan.nextFloat();
		
		double calc1 = (valorInt * 2) * (valorReal / 2);
		double calc2 = (valorInt * 3) + valorReal;
		double calc3 = Math.pow(valorReal, 3);
		
		System.out.format("O produto do dobro do primeiro com metade do segundo = %.2f", calc1);
		System.out.format("A soma do triplo do primeiro com o terceiro = %.2f", calc2);
		System.out.format("O terceiro elevado ao cubo = %.2f", calc3);
	}

}
