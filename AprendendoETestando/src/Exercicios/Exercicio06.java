package Exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		//6. Elabore um programa que receba três notas de um aluno e calcule a média. Se a média for maior ou
		//igual a 7, imprima "Aprovado"; caso contrário, imprima "Reprovado".
		
		Scanner leia = new Scanner(System.in);
		System.out.println("primeira nota");
		
		double num1 = leia.nextDouble();
		
		System.out.println("segunda nota");
		
		double num2 = leia.nextDouble();
		
		System.out.println("terceira nota");
		
		double num3 = leia.nextDouble();
		
		double resultado = (num1 + num2 +num3) / 3;
		
		if (resultado >=7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
			leia.close();


		

	}

}
