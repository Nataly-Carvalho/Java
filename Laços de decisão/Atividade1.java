/*Aluna: Nataly Carvalho da Silva 
 * Turma: 55
 * Dia:07/07/2022
 * 
 Q.1-Faça um programa que receba três inteiros e diga qual deles é o maior.
  */
package AulaJava;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número : ");
		n1 = leia.nextInt();
		
		System.out.println("\nDigite o segundo número : ");
		n2 = leia.nextInt();
		
		System.out.println("\nDigite o terceiro  número: ");
		n3 = leia.nextInt();
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("O primeiro número é o maior");
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println("O segundo número é o maior");
		}
		else
		{
			System.out.println("O terceiro número é o maior");
		}

	}

}
