/*Aluna: Nataly Carvalho da Silva 
 * Turma: 55
 * Dia:15/07/2022

Q3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/

package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int op=0;
		
		ArrayList <String>ListaEstoque=new ArrayList();
		
		
		
		do {
			System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
			System.out.println("\t\tEstoque");
			System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
			System.out.println("1 -_Deseja adicionar um item no estoque?");
			System.out.println("2 -_Deseja remover um item do estoque?");
			System.out.println("3 -_Deseja atualizar um item do estoque?");
			System.out.println("4 -_Deseja ver o estoque? ");
			System.out.println("0 -_Sair");
			System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
			op =scan.nextInt();
			
			switch(op) 
			{
			case 1:
				scan.nextLine();
				System.out.println("\nQual item deseja adicionar no seu estoque\n");
				String produto = scan.nextLine();
				ListaEstoque.add(produto);
				break;
			case 2:
				scan.nextLine();
				System.out.println("\nQual item deseja remover?\n");
				String produto1 = scan.nextLine();
				ListaEstoque.remove(produto1);
				break;
			case 3:
				scan.nextLine();
				String verificar =scan.nextLine();
				String novo = scan.nextLine();
				System.out.println("\nQual item deseja substituir?\n"+verificar);
				if (ListaEstoque.contains(verificar)) 
				{
					ListaEstoque.remove(verificar);
					ListaEstoque.add(novo);	
				}break;
				
			case 4:
				scan.nextLine();
				System.out.println("\nVoce escolheu a opcao mostar itens\n");
				System.out.println(ListaEstoque);
				break;
			case 0:
				System.out.println("Programa finalizado");

			}
		}while(op!=0);
		
		
	}
	

}
