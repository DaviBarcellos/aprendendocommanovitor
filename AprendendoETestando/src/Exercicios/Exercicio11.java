package Exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// 11. Desenvolva um programa que peça ao usuário para inserir um número de 1 a 12 representando um mês
		//do ano. O programa deve imprimir o número de dias e o nome do mês usando um switch-case.
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 12 para representar um mês do ano");
		
		int mes = leia.nextInt();		
		switch (mes) {
			case 1:
				System.out.println("31 dias - Janeiro");
				break;
			case 2:
				System.out.println("28 dias - Fevereiro (ressalvo ano bissexto que contém 29 dias)");
				break;
			case 3:
				System.out.println("31 dias - Março");
				break;
			case 4:
				System.out.println("30 dias - Abril");
				break;
			case 5:
				System.out.println("31 dias - Maio");
				break;
			case 6:
				System.out.println("30 dias - Junho");
				break;
			case 7:
				System.out.println("31 dias - Julho");
				break;
			case 8:
				System.out.println("31 dias - Agosto");
				break;
			case 9:
				System.out.println("30 dias - Setembro");
				break;
			case 10:
				System.out.println("31 dias - Outubro");
				break;
			case 11:
				System.out.println("30 dias - Novembro");
				break;
			case 12:
				System.out.println("31 dias - Dezembro");
				break;


			default:
				System.out.println("Número inválido. Por favor,"
						+ "Digite um número de 1 a 12");
		
		leia.close();
	}		

}
}
