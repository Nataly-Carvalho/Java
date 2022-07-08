/*Aluna: Nataly Carvalho da Silva 
 * Turma: 55
 * Dia:08/07/2022

Q.2 Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

package repeticao;

import java.util.Scanner;

public class forAtividade2 {
	public static void main(String[] args)
	{
		int numero,par=0,impar=0;
		Scanner leia = new Scanner(System.in);
		
	
		for(int x=1;x<=5;x++)
		{
			System.out.println("Digite um numero:");
			numero = leia.nextInt();
			
			if(numero % 2 == 0)
			{
				System.out.println("Esse numero e par");
				par++;
			}
			else
			{
				System.out.println("Esse numero e impar");
				impar++;
			}	
		}
		
		System.out.println("O total de numeros pares é: "+par+" e o total de impares é: "+impar);
		
	}

}
