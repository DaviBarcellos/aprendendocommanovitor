package Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//3. Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual
		//dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor
		//não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		
		//fazer a leitura de um valor aleatório 
		
		//identificar em qual dos 5 intervalos o numero está já q é pra considerar o else "fora de intervalo" como um intervalo.
		// como identificar isso? if 0, 25 | 25.01 50 | 50.01, 75 | 75.01, 100
		//talvez fazer a leitura do numero com 4 ifs e 1 else? provavelmente...
		
	   Scanner leia = new Scanner(System.in);
	   System.out.println("Digite um valor");
	   
	   int num = leia.nextInt();
	   
	   if (num >= 0 && num <=25){
	   System.out.println("O numero está entre 0 e 25");
	   }
	   else if(num > 25 && num <=50){
		   System.out.println("O numero está entre 25 e 50");
	   }
	   else if(num > 50 && num <=75) {
		   System.out.println("O numero está entre 50 e 75");
		   
	   }
	   else if (num >75 && num <= 100) {
		   System.out.println("O numero está entre 75 e 100");
	   }
	   else {   
		   System.out.println("fora de intervalo");
	   }
	   leia.close();
	}
	
	   

	   
}
