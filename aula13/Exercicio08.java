package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);	
		System.out.println("Calculando o Salario");
		
		System.out.println("Qual o valor que voce ganha por hora: ");
		double v = scan.nextDouble();
		
		System.out.println("Qual o numero de horas trabalhadas no mes: ");
		double h = scan.nextDouble();
		
		double s = v*h;
				
		System.out.println("Seu Salario mensal eh de: " +s);
	
		
	}

}
