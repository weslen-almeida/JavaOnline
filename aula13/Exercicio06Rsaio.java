package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio06Rsaio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("Calculando a Area de um Criculo");
		
		System.out.println("Digite o Raio: ");
		double r = scan.nextDouble();
		
		double a = 3.14159 * (r*r);
		
		System.out.println("A area do cirulo eh: "+a);
		
		

	}

}
