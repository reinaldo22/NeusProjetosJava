package modelo;

public class Endereco {
	private String nome_rua;
	private String complemento;
	private String cidade;
	private String estado;
	private String numero;
	
	public Endereco(String pNome,String pComp, String pCid,String pEst, String pNum) {
		this.nome_rua = pNome;
		this.complemento = pComp;
		this.cidade = pCid;
		this.estado = pEst;
		this.numero = pNum;
	}
	
	
	
	public String getNome_rua() {
		return nome_rua;
	}
	public void setNome_rua(String nome_rua) {
		this.nome_rua = nome_rua;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	

}
