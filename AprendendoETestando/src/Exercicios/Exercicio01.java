package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		//1. Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		
		int num = leia.nextInt();
	
		
		if (num > 0) {
				System.out.println("O numero é positivo");
		
		
	}   else  { 
			System.out.println("O numero é negativo");
		
		}
		
		leia.close();
		
		
		
		
	}

}
