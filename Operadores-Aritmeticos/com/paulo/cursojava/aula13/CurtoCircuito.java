package com.paulo.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro  = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro;
		boolean resultado2 = verdadeiro && falso;
		System.out.println(resultado1);
		System.out.println(resultado2);
		
	}
}
