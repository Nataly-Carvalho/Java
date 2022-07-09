/*Aluna: Nataly Carvalho da Silva 
 * Turma: 55
 * Dia:08/07/2022

Q.1 Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
*/

package repeticao;

public class forAtividade1 {
	public static void main(String[] args)
	{
		
		for (int x=1000;x<=1999;x++)
			
		{
			if(x % 11 ==5)
			{
				System.out.println("O resto desse numero dividido por 11 e igual a 5: "+x);
			} 
		}
		
	}
	

}
