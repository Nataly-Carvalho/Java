/*Aluna: Nataly Carvalho da Silva 
 * Turma: 55
 * Dia:04/07/2022
 * 
 Q2.	Um dado é lançado 10 vezes e o valor correspondente é anotado.
 Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
 A seguir determine e imprima a média aritmética dos lançamentos,
 contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/

package vetoresEmatrizes;

import java.util.Scanner;

public class Q2Vetores {
	public static void main(String[] args) {
		int dado[]= new int[10],soma=0,media,maior=0;
		
		 Scanner ler =new Scanner(System.in);
		 
		 for(int i=0;i<10;i++) {
			 
			 System.out.println("Jogue o dado: ");
			 dado[i]= ler.nextInt();
			 
			 while (dado[i]>1 && dado[i]>6)
			 {
				 System.out.println("Jogue novamente: ");
				 dado[i] = ler.nextInt();
			 }
			 
			 if (dado[i]==6) {
				 
				 maior++;
			 }
			 soma+=dado[i];
		 }
		 media=soma/10;
		 System.out.println("A media de lancamento e: "+media);
		 System.out.println("As ocorrências da maior pontuacao foi: "+maior);
		
		
	}

}
