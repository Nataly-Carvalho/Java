/*Aluna: Nataly Carvalho da Silva 
 * Turma: 55
 * Dia:04/07/2022
 * 
 Q1.	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o
  escreva em seguida. Encontre após a maior pontuação e a apresente.*/
package vetoresEmatrizes;

import java.util.Scanner;

public class Q1Vetores {

	public static void main(String[] args) {
		
		int pontuacao[]= new int[5],maior = 0;
		Scanner ler = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Digite um numero: ");
			pontuacao[i]=ler.nextInt();
			
			if (pontuacao[i] > maior){
				
				maior=pontuacao[i];
			}
		}
		System.out.println("O maior valor foi: "+maior);
		
	}

}
