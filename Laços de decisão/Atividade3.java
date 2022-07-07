/*Aluna: Nataly Carvalho da Silva 
 * Turma: 55
 * Dia:07/07/2022
 * 
 Q3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto*/

package AulaJava;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args)
	{
		int idade;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite sua idade");
		idade = leia.nextInt();
		
		if (idade>=18)
		{
			System.out.println("Aduto");
		}
		else if (idade>=15 && idade<=17)
		{
			System.out.println("Juvenil");
		}
		else if (idade<=14)
		{
			System.out.println("Infantil");
		}
	}
}
