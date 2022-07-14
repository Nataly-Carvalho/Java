package POO;

public class AnimaisObjeto {
	public static void main(String[] args) {
		
		cachorro auau = new cachorro();
		cavalo pocpoc =new cavalo();
		preguica aaa =new preguica();
		
		System.out.println("Cachorro\n");
		auau.setIdade(3);
		auau.setNome("Macelo");
		auau.getSom();
		auau.correr();
		auau.animal();
		
		System.out.println("\nCavalo\n");
		
		pocpoc.correr();
		pocpoc.setNome("Bianca");
		pocpoc.som();
		pocpoc.setIdade(30);
		pocpoc.animal();
		
		System.out.println("\nPrguica\n");
		
		aaa.setIdade(100);
		aaa.setNome("Lucas");
		aaa.som();
		aaa.movimento();
		aaa.animal();
		
		
	
		
	}

}
