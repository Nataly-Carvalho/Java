package POOPoliformica;

public class Dogo extends Animal{
	public Dogo() 
	{
		super("Dogo");
	}
	
	@Override
	public void Nome (String nomeAnimal)
	{
		System.out.println("Nome do cachorro: "+nomeAnimal);
	}
	@Override
	public void Idade (int idadeAnimal)
	{
		System.out.println("A idade do animal é: "+idadeAnimal);
	}
	@Override
	public void Som (String somAnimal)
	{
		System.out.println("Sons de dogo: "+somAnimal);
	}
	public void correr()
	{
		System.out.println("O Dogo corre!");
	}
}
