/*Aluna: Nataly Carvalho da Silva 
 * Turma: 55
 * Dia:07/07/2022
 * 
 Q.4 Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
package AulaJava;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		double numero;
		Scanner leia =new Scanner(System.in);
		
		System.out.println("Digite um numero");
	    numero = leia.nextInt();
	    
	    if (numero % 2 == 0)
	    {
	    	numero = Math.sqrt(numero);
	    	System.out.printf("O numero é par e a raiz quadrada é: %.2f ",numero);
	    }
	    else
	    {
	    	numero = Math.pow(numero, 2);
	    	System.out.printf("O numero é impar e elevado ao quadrado fica: %.2f ",numero);
	    }
	    

	}

}
