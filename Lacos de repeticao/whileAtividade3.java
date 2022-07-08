/*Aluna: Nataly Carvalho da Silva 
 * Turma: 55
 * Dia:08/07/2022

Q.3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
*/
package repeticao;

import java.util.Scanner;

public class whileAtividade3 {
	public static void main(String[] args)
	{
		int idade=0,x=0,y=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade:");
		idade=leia.nextInt();
		
		while (idade !=-99)
		{
			System.out.println("\nDigite sua idade:");
			idade=leia.nextInt();
			
			if (idade<=21)
			{
				x++;
			}
			else if(idade>=50)
			{
				y++;
			}
		}
		System.out.println("O total de pessoas com menos de 21 anos e: "+x+" e o total de pessoas com mais de 50 e: "+y);
	}

}
