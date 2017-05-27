package br.com.pim.model;
import java.util.Scanner;

//*Pedido de compra, consulta de disponibilidade e reserva*//

public class Pedido {

	private Livro livro;
	private Estoque estoque;
	private boolean disponivel;
	private boolean reservar;
	private int qtdDesejada;
	private double valorTotal;
	private Cartao cartao;

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public boolean isDisponivel() {
		if(!isDisponivel()){
			System.out.println("O livro est� indispon�vel no momento, processando reserva");
		}else{
			System.out.println("O livro est� dispon�vel para compra.");
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

	
	public void setCartao(Cartao cartao) {
		
		System.out.println("Digite a operadora do cart�o.");
		System.out.println("Digite o n�mero do cart�o.");
		System.out.println("Digite o c�digo de seguran�a.");
		System.out.println("Digite o vencimento do cart�o formato mm/aa.");
		
		//ser� informado via rest doPost, em produ��o...
	}

}
