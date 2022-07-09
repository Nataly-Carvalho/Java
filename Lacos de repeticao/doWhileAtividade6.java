/*Aluna: Nataly Carvalho da Silva 
 * Turma: 55
 * Dia:08/70/2022

Q.6 Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
*/
package repeticao;

import java.util.Scanner;

public class doWhileAtividade6 {

	public static void main(String[] args) {
		
		int numero = 0, i=0,media = 0,soma = 0;
		Scanner leia= new Scanner(System.in);
	
		do
		{
			System.out.println("Digite um numero: ");
			numero=leia.nextInt();
			if(numero % 3 == 0 && numero !=0)
			{
				soma+=numero;
				i++;
				
			}	
		
		}while(numero!=0);
		media=soma/i;
		System.out.println("A media dos numeros multipos de 3 e de: "+media);
		
		
	}

}
