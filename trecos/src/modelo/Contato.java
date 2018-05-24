package modelo;

public class Contato {
	private String nome;
	private Endereco endereco;
	private String telefone;
	
	public Contato(String pNome, Endereco pEndereco, String pTelefone) {
		this.nome = pNome;
		this.endereco = pEndereco;
		this.telefone = pTelefone;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void mostrar() {
		System.out.println("nome"+nome);
		System.out.println("Cidade: "+endereco.getCidade()+" Rua: "+endereco.getComplemento()+ " cidade: "+endereco.getCidade()
		);
		System.out.println("telefone"+telefone);
		
	}
}
