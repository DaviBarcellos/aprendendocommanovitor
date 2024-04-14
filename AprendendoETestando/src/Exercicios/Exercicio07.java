package Exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		//7. Desenvolva um programa que peça ao usuário uma letra do alfabeto e determine se é uma vogal ou uma
		//consoante. Lembre-se do método .contains() de String
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite uma letra aleatória minuscula");
		
		String letra = leia.nextLine();
		
		if ("aeiou".contains(letra)) {
			System.out.println("é uma vogal");
		} else if  ("bcdfghjklmnpqrstvwxyz".contains(letra))
			System.out.println("é uma consoante");
	 else {
		System.out.println("tente novamente, lembre-se apenas minusculas");

	}
		leia.close();
		

}
	}