package br.com.pim.model;

//*Cadastro de livros e suas características*//

import java.util.Date;

public class Livro {

	private String titulo;
	private String autor;
	private String isbn;
	private Date ano;
	private String descricao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Livro(String titulo, String autor, String isbn, Date ano, String descricao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.ano = ano;
		this.descricao = descricao;
	}

}
