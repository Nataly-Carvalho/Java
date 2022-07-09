/*Q.4 Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
*/
package repeticao;

import java.util.Scanner;

public class whileAtividade4 {
	public static void main(String[] args)
	{
		int sexo, mulheres = 0,homens = 0,outros = 0, calmo = 0,agresivo = 0,nervoso = 0,idade, i=0,temperamento,nervoMais = 0,calmaMenos = 0,totalCalmo;
		
		
		Scanner leia= new Scanner(System.in);
		
		while(i!=150)
		{
		
		System.out.println("Qual sua idade?: ");
		idade=leia.nextInt();
		
		System.out.println("Qual seu sexo:");
		System.out.println("Digite 1- Feminino 2-Masculino 3- outros");
		sexo=leia.nextInt();
		
		System.out.println("Você se considera uma pessoa:");
		System.out.println("Digite 1- Calma 2-nervoso 3- agresiva");
		temperamento= leia.nextInt();
		
		if(temperamento==2)
		{
			nervoso++;
			if (sexo==1)
			{
				mulheres++;
			}
		}
		if(temperamento==3)
		{
			agresivo++;
			
			if(sexo==2)
			{
				homens++;
			}
		}
		
		if(temperamento==1)	
		{
			calmo++;
			
			if(sexo==3)
			{
				outros++;
			}
		}
		if (idade>=40 && temperamento==2)
		{
			
			nervoMais++;
		}
		if(idade<=18 && temperamento==1)
		{   
			calmaMenos++;
		}
	
		i++;
	}
		System.out.println("O numero de pessoas calmas: "+calmo);
		System.out.println("O numero de mulheres nervosas: "+mulheres);
		System.out.println("O numero de homens agressivos: "+homens);
		System.out.println("O numero de outros calmos: "+outros);
		System.out.println("O numero de pessoas nervosas com mais de 40 anos: "+nervoMais);
		System.out.println("O numero de pessoas calmas com menos de 18 anos: "+calmaMenos);
	}
}
