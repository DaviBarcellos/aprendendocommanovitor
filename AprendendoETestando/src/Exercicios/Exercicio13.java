package Exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// 13. Crie um programa que recebe uma nota de 0 a 10 e converte para um
		// conceito de A a F utilizando a
		// instrução switch-case.
		// A: 9-10
		// B: 8
		// C: 7
		// D: 6
		// E: 5
		// F: restante (default)

		Scanner leia = new Scanner(System.in);
		System.out.println("digite uma nota de 0 a 10");

		int nota = leia.nextInt();
		switch (nota) {

		case 10:

		case 9:
			System.out.println("Nota A");
			break;
		case 8:
			System.out.println("Nota B");
			break;
		case 7:
			System.out.println("Nota C");
			break;
		case 6:
			System.out.println("Nota D");
			break;
		case 5:
			System.out.println("Nota E");
			break;
		default:
			System.out.println("Nota F");
			break;
		}
			leia.close();
		
	}
}