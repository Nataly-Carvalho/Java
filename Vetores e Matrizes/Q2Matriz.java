/*Aluna: Nataly Carvalho da Silva 
 * Turma: 55
 * Dia:04/07/2022
 * 
 Q4.Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
 ou seja, diagonal principal.*/

package vetoresEmatrizes;

import java.util.Scanner;

public class Q2Matriz {
	public static void main(String[] args) {
		
		int m[][]= new int[3][3],soma = 0,somaDiagonal = 0;
		Scanner ler = new Scanner (System.in);
		
		for (int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
				
				System.out.println("Digite um numero: ");
				m[l][c]=ler.nextInt();
				
				soma+=m[l][c];
				
		if(l==c) {
			
			somaDiagonal+=m[l][c];
		}
				
			}
			
		}
			System.out.println("A soma e: "+soma);
			System.out.println("A soma diagonal: "+somaDiagonal);
	}
			

}
