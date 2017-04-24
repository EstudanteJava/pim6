package br.com.prisciladelima.model;

//*Pedido de compra, consulta de disponibilidade e reserva*//

public class Pedido {

	private Livro livro;
	private Estoque estoque;
	private boolean disponivel;
	private boolean reservar;
	private int qtdDesejada;
	private double valorTotal;

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public boolean isDisponivel() {
		if(!isDisponivel()){
			System.out.println("O livro está indisponível no momento, processando reserva");
		}else{
			System.out.println("O livro está disponível para compra.");
		}
		return disponivel;
		
	}

	public void setDisponivel(boolean disponivel) {
		if (estoque.getQtde() < 1) {
			this.disponivel = false;
		} 

	}

	public boolean isReservar() {
		return reservar;
	}

	public void setReservar(boolean reservar) {
		this.reservar = reservar;
	}

	public int getQtdDesejada() {
		return qtdDesejada;
	}

	public void setQtdDesejada(int qtdDesejada) {
		this.qtdDesejada = qtdDesejada;
		
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		double valorUnit = estoque.getValorUnit();
		valorTotal = valorUnit * getQtdDesejada();

	}

	public Pedido(Livro livro, boolean disponivel, boolean reservar, int qtdDesejada, double valorTotal) {
		super();
		this.livro = livro;
		this.disponivel = disponivel;
		this.reservar = reservar;
		this.qtdDesejada = qtdDesejada;
		this.valorTotal = valorTotal;
	}

}
