package Exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		// Elabore um programa que simule um caixa eletrônico. O usuário deve informar o
		// valor que deseja sacar.
		// O programa deve calcular o número de notas de cada valor (100, 50, 20, 10, 5,
		// 2, 1) necessárias para
		// compor o valor total.

		Scanner leia = new Scanner(System.in);

		int n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;
		System.out.println("Insira o valor desejado a sacar");
		int dinheiro = leia.nextInt();
		leia.close();
		if (dinheiro != 0 && dinheiro >= 100) {
			n100 = dinheiro / 100;
			dinheiro = dinheiro % 100;
			System.out.println("nota 100 " + n100);
		}
		if (dinheiro != 0 && dinheiro >= 50) {
			n50 = dinheiro / 50;
			dinheiro = dinheiro % 50;
			System.out.println("nota 50 " + n50);
		}
		if (dinheiro >= 20) {
			n20 = dinheiro / 20;
			dinheiro = dinheiro % 20;
			System.out.println("nota 20 " + n20);
		}
		if (dinheiro != 0 && dinheiro >= 10) {
			n10 = dinheiro / 10;
			dinheiro = dinheiro % 10;
			System.out.println("nota 10 " + n10);
		}
		if (dinheiro >= 5) {
			n5 = dinheiro / 5;
			dinheiro = dinheiro % 5;
			System.out.println("nota 5 " + n5);
		}
		if (dinheiro >= 2) {
			n2 = dinheiro / 2;
			dinheiro = dinheiro % 2;
			System.out.println("nota 2 " + n2);
		}
		if (dinheiro >= 1) {
			n1 = dinheiro / 1;
			dinheiro = dinheiro % 1;
			System.out.println("nota 1 " + n1);
		}else {
System.out.println("Saque inválido");
return;
	}
	}
}