package POO;

public class ClienteObjeto {

	public static void main(String[] args) 
	{
		Cliente cadastro =new Cliente();
		
		System.out.println("Cadastro");
		cadastro.setNome("Marcelo");
		cadastro.setCPF("098345676545");
		cadastro.setSexo("Masculino");
		cadastro.setNumero(819900667);
		cadastro.estado();
		
		

	}

}
