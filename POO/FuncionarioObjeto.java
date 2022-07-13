package POO;

public class FuncionarioObjeto {
	
	public static void main(String[] args) {
		
  Funcionario funcionario =new Funcionario();
		
		System.out.println("Funcionario");
		funcionario.setNome("Ana");
		funcionario.setcargo("Gerente");
		funcionario.setSexo("Femenino");
		funcionario.setNumero(819900667);
		funcionario.setVenda(10);
		funcionario.estado();
		
	}

}
