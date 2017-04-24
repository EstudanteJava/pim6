package br.com.prisciladelima.model;

import java.util.Date;

public class Usuario {

	private String nome;
	private String endereço;
	private String telefone;
	private Date dataNasc;

	public Usuario(String nome, String endereço, String telefone, Date dataNasc, Usuario usuario) {
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
