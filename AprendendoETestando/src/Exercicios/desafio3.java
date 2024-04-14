package Exercicios;

import java.util.Scanner;

public class desafio3 {

	public static void main(String[] args) {

	
		
		double valor = 400;
		
		
		
	
		
	
		if (valor < 100) {
			System.out.println("Sem desconto");
		}else if (valor <500){
			double desconto = 5.0/100.0;
			double valorComDesconto = valor - (valor * desconto);
			System.out.println(" valor total com desconto de 5% " + valorComDesconto);
		}else if (valor <1000) {
			double desconto = 10.0/100.0;
			double valorComDesconto2 = valor - (valor * desconto);
			System.out.println(" valor total com desconto de 10% " + valorComDesconto2);
		}else if(valor >1000) {
			double desconto = 15.0/100.0;
			double valorComDesconto3 = valor - (valor * desconto);
			System.out.println(" valor total com desconto de 15% " + valorComDesconto3);
		}
		
}
}