package POOPoliformica;

import java.util.Scanner;

public class testeAnimal {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Dogo cachorro =new Dogo();
		Pocoto Cavalo =new Pocoto();
		Preguica preguica=new Preguica();
		Animal animal = null;
		int op=0;
		
		System.out.println("Qual seu animal voceê gostaria de ter?");
		System.out.println("\n 1- Cachorro \n 2- Cavalo \n 3-Preguica");
		op=scan.nextInt();
		
		switch(op) 
		{
		case 1:
			animal = cachorro;
			System.out.println("Qual seria o nome do seu cachorro?");
			String nome = scan.next();
			System.out.println("Qual a idade do cachorro você gostaria de adotar?");
			int idade =scan.nextInt();
			System.out.println("Qual o som que seu pet faria?");
			String som = scan.next();
			cachorro.Nome(nome);
			cachorro.Idade(idade);
			cachorro.Som(som);
			cachorro.correr();
			break;
		case 2:
			animal = Cavalo;
			System.out.println("Qual seria o nome do seu Cavalo?");
			String Nome = scan.next();
			System.out.println("Qual a idade do cavalo você gostaria de adotar?");
			int Idade =scan.nextInt();
			System.out.println("Qual o som que seu pet faria?");
			String Som = scan.next();
			Cavalo.Nome(Nome);
			Cavalo.Idade(Idade);
			Cavalo.Som(Som);
			Cavalo.correr();
			break;
		case 3:
			animal = preguica;
			System.out.println("Qual seria o nome da sua Preguica?");
			String noome = scan.next();
			System.out.println("Qual a idade da preguica que você gostaria de adotar?");
			int iidade =scan.nextInt();
			System.out.println("Qual o som que seu pet faria?");
			String ssom = scan.next();
			preguica.Nome(noome);
			preguica.Idade(iidade);
			preguica.Som(ssom);
			preguica.Subir();
			break;
			default:
				System.out.println("Opção invalida!!");break;
			
		}
			
			
		}
		
		
		
		
	}


