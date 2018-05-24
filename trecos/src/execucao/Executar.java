package execucao;

import modelo.Contato;
import modelo.Endereco;

public class Executar {

	public static void main(String[] args) {
		
	
		
		Endereco meuEndereco = new Endereco("Rua sao feliciano","monte das loveiras","manaus","amazonas","271");
		
		
		
		Contato novoContato = new Contato(" Reinaldo",meuEndereco," 99978888");
		novoContato.mostrar();
		
	}

}
