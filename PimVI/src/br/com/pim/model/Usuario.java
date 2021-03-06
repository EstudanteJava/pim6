package br.com.pim.model;

//*Cadastro de usu�rios.*//

import java.util.Date;

public class Usuario {

	private String nome;
	private String endere�o;
	private String telefone;
	private Date dataNasc;

	public Usuario(String nome, String endere�o, String telefone, Date dataNasc, Usuario usuario) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	


}
