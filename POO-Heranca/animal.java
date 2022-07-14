package POO;

public class animal {

	private String nome;
	private int idade;
	private String som;
	
	public void som() {
		System.out.println("Sons de animal");
	}
	
	public void animal(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		som();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

}
