package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio4Media {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota 1: ");
		double n1 = scan.nextDouble();
		
		System.out.println("Nota 2: ");
		double n2 = scan.nextDouble();
		
		System.out.println("Nota 3: ");
		double n3 = scan.nextDouble();
		
		System.out.println("Nota 4: ");
		double n4 = scan.nextDouble();
		
		System.out.println("A Media eh: " +((n1+n2+n3+n4)/4));

	}

}
