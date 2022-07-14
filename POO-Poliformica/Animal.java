package POOPoliformica;

public abstract class Animal {
	
	private String AnimalTipo;
	
	public Animal(String AnimalTipo) {
		this.AnimalTipo=AnimalTipo;
	}
	
	abstract public void Nome (String nomeAnimal);
	abstract public void Idade (int idadeAnimal);
	abstract public void Som (String somAnimal);

	public String getAnimalTipo() {
		return AnimalTipo;
	}

	public void setAnimalTipo(String animalTipo) {
		AnimalTipo = animalTipo;
	}
	

}
