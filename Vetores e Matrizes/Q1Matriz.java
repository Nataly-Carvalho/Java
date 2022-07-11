/*Aluna: Nataly Carvalho da Silva 
 * Turma: 55
 * Dia:04/07/2022
 * 
 Q3.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.*/
package vetoresEmatrizes;

import java.util.Scanner;

public class Q1Matriz {
	public static void main(String[] args) {
		
		int n1[][] = new int[4][6],n2[][]= new int[4][6];
		int m1[][] = new int[4][6],m2[][]= new int[4][6];
		
		Scanner ler = new Scanner(System.in);
		
		for ( int l=0;l<4;l++)
		{
			for (int c=0;c<6;c++)
			{
				System.out.println("Digite um  numero para n1: ");
				n1[l][c]=ler.nextInt();
				
				System.out.println("Digite um  numero para n2: ");
				n2[l][c]=ler.nextInt();
				
				m2[l][c]+=n1[l][c] - n2[l][c];
				m1[l][c]+=n1[l][c]+ n2[l][c];
			}
		}
		
				
		System.out.println("\nOs valores somados: \n");
		for (int l=0;l<4;l++){
			for(int c=0;c<6;c++){
				System.out.print(m1[l][c]+" ");
			
			}
			System.out.println();
		}
		
		System.out.print("\n\nA diferenca dos valores: \n");
		for ( int l=0;l<4;l++){
			for (int c=0;c<6;c++)
			{
				System.out.print(m2[l][c]+" ");
			}
			System.out.println();
		
		
		}
		}

}
