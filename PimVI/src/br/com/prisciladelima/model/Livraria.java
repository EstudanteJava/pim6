package br.com.prisciladelima.model;

//*Cadastro da livraria//

public class Livraria {

	public Livraria() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String nome;
	private String endereco;
	private String site;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

}
