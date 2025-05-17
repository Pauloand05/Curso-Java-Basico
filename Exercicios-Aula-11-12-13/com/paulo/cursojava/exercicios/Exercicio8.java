package com.paulo.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voce ganha por hora: ");
		double salarioHora = scan.nextDouble();
		
		System.out.println("Numero de horas trabalhadas no mes: ");
		int horaTrabalhada = scan.nextInt();
		
		double salarioMes = salarioHora * horaTrabalhada;
		
		System.out.format("O slario recebido no mes foi de: %.2f reais\n", salarioMes);
	}

}
