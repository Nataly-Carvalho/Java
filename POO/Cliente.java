package POO;

public class Cliente {
	
	private String nome;
	private String CPF;
	private String sexo;
	private int numero;
	
	public void estado() {
		System.out.println("Nome: "+this.nome);
		System.out.println("CPF: "+this.CPF);
		System.out.println("Sexo: "+this.sexo);
		System.out.println("Numero de telefone: "+this.numero);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
