package POO;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private String sexo;
	private int numero;
	private int venda;
	
	public void estado() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Cargo: "+this.cargo);
		System.out.println("Sexo: "+this.sexo);
		System.out.println("Numero de telefone: "+this.numero);
		System.out.println("Vendas: "+this.venda);
		
	}

	public String setNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setcargo(String cargo) {
		this.cargo = cargo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setVenda(int venda) {
		this.venda = venda;
	}
	

}
