package br.com.prisciladelima.model;

//*Controle de estoque da livraria*//

public class Estoque {

	private Livro livro;
	private int qtde;
	private double valorUnit;

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getValorUnit() {
		return this.valorUnit;
	}

	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}
	
	public Estoque(Livro livro, int qtde, double valorUnit) {
		super();
		this.livro = livro;
		this.qtde = qtde;
		this.valorUnit = valorUnit;
	}
}
