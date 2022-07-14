package POOPoliformica;

public class Preguica extends Animal {
	public Preguica() 
	{
		super("Preguica");
	}

	@Override
	public void Nome (String nomeAnimal)
	{
		System.out.println("Nome da Preguica: "+nomeAnimal);
	}
	@Override
	public void Idade (int idadeAnimal)
	{
		System.out.println("A idade do animal é: "+idadeAnimal);
	}
	@Override
	public void Som (String somAnimal)
	{
		System.out.println("Sons de preguica?????: "+somAnimal);
	}
	public void Subir()
	{
		System.out.println("A preguica sobe em arvores!");
	}
}
