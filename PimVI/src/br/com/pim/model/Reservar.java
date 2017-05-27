package br.com.pim.model;

//*Reserva de livro indisponível com data limite para expirar a requisição.*//

import java.util.Date;

public class Reservar {

	private Usuario usuario;
	private Livro livro;
	private int Qtd;
	private Date dataLimite;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public int getQtd() {
		return Qtd;
	}

	public void setQtd(int qtd) {
		Qtd = qtd;
	}

	public Date getDataLimite() {
		return dataLimite;
	}

	public void setDataLimite(Date dataLimite) {
		this.dataLimite = dataLimite;
	}

	public Reservar(Usuario usuario, Livro livro, int qtd, Date dataLimite) {
		super();
		this.usuario = usuario;
		this.livro = livro;
		Qtd = qtd;
		this.dataLimite = dataLimite;
	}

}
