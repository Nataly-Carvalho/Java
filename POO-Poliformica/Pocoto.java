package POOPoliformica;

public class Pocoto extends Animal{
	public Pocoto()
	{	
		super ("Pocoto");
	}
	
	@Override
	public void Nome (String nomeAnimal)
	{
		System.out.println("Nome do Cavalo: "+nomeAnimal);
	}
	@Override
	public void Idade (int idadeAnimal)
	{
		System.out.println("A idade do animal é: "+idadeAnimal);
	}
	@Override
	public void Som (String somAnimal)
	{
		System.out.println("Sons de pocoto: "+somAnimal);
	}
	public void correr()
	{
		System.out.println("O Cavalo corre!");
	}

}
