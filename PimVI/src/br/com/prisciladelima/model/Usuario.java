package br.com.prisciladelima.model;

import java.util.Date;

public class Usuario {

	private String nome;
	private String enderešo;
	private String telefone;
	private Date dataNasc;

	public Usuario(String nome, String enderešo, String telefone, Date dataNasc, Usuario usuario) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
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
