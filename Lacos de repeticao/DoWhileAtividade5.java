/*Aluna: Nataly Carvalho da Silva 
 * Turma: 55
 * Dia:08/07/2022

Q.5Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
*/

package repeticao;

import java.util.Scanner;

public class DoWhileAtividade5 {
	public static void main(String[] args)
	{
		int numero=0,soma = 0;
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\nDigite um numero: ");
			numero=leia.nextInt();
			
			soma=soma+numero;
			
		}while (numero !=0);
		
		System.out.println("A soma de todos os numero  e: "+soma);
	}
	

}
