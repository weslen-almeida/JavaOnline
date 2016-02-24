package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio07AreaQuadrado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("Calculando a Area de um Quadrado");
		
		System.out.println("Digite o valor do Lado: ");
		double l = scan.nextDouble();
		
		double a = l * l;
		double ad = a*2;
		
		System.out.println("A area do quadrado eh: "+a+ "\n E seu dobro equivale a:" +ad);
	
	
	}	
}
