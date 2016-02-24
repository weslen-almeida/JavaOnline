package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio05Metros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Metros em Centimetros");
		
		System.out.println("Digite o metro a ser convertido para cm: ");
		double m = scan.nextDouble();
		
		double r =m*100;
		
		System.out.println("O metro convertido em centimetros fica igual a: " +r);
		
	}

}
