package Exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Usando o operador ternário, crie um programa que recebe dois números inteiros como entrada e exibe o
		// maior deles.
		//seguir as dicas do mano vitor e mano marcio
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite um numero");
		
		int num1 = leia.nextInt();
		
		System.out.println(" digite outro numero");
		
		int num2 = leia.nextInt();
		
		int maiornumero = (num1 > num2) ? num1 : num2;
		
		
		System.out.println("o maior numero é " + maiornumero);
		
	leia.close();
	
		
		
		
		
		
	}

}
