package Exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		//5. Desenvolva um programa que peça ao usuário três números e imprima o maior deles
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero");
		int num1 = leia.nextInt();
		
		System.out.println("digite o segundo numero");
		int num2 = leia.nextInt();
		
		System.out.println("digite o terceiro numero");
		int num3 = leia.nextInt();
		
		int maiornumero = num1;
		System.out.println("resultado"+ num1);
		
		if ( num2 > maiornumero) {
			System.out.println("resultado "+ num2);
		} else if (num3 > maiornumero) {
			System.out.println("resultado "+ num3);
		}else {
			System.out.println("tente novamente");
		}
		leia.close();
	}
}
