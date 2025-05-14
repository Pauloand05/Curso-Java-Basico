package com.paulo.cursojava.aula10;

public class Variaveis {
	
	public static void main(String[] args) {
	
	int idade;
	String nome = "Paulo";
	String nomeDoMeuCachorro = "Totó";
	
//	Aceito mais não é utilizada
	int _idade;
	int $idade;
	String ano2014;
	
//	Não é convenção Java
	String nome_do_meu_cachorro;
	String NomeDoMeuCachorro;
//	String nomeDoMeuCachorro;
	
//	Má prática 
	int a =  10;
	String b = "Paulo";
	
	idade = 20;
	
	System.out.println("Idade: " + idade);
	
	}
}