package Exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// 14. Crie um programa que exibe um menu com opções numeradas de 1 a 3. O usuário deve escolher uma
		//opção, e o programa deve exibir uma mensagem correspondente. Utilize a instrução switch-case.

		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Temos opções variadas de sanduiches, digite 1 para hot dog, 2 para hamburgão e 3 para calota");
		
		int opcao = leia.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("voce optou pelo hot dog, ele chegará a sua mesa em breve");
			break;
		case 2:
			System.out.println("voce optou pelo hamburgão, ele chegará a sua mesa em breve");
			break;
		case 3:
			System.out.println("voce optou pelo calota, ele demorará um pouco mas logo chegará até sua mesa");
			break;
	    default: 
				System.out.println("escolha entre 1 e 3, demais numeros invalidos.");
				break;
				}
		
		leia.close();
		
		
		
		
	}

}
