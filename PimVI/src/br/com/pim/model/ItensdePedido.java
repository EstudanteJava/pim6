package br.com.pim.model;

public class ItensdePedido extends Pedido{

	private Estoque e;
	
	
	
	public ItensdePedido(Livro livro, boolean disponivel, boolean reservar, int qtdDesejada, double valorTotal) {
		super(livro, disponivel, reservar, qtdDesejada, valorTotal);
		// TODO Auto-generated constructor stub
	}
	public Estoque getE() {
		return e;
	}
	public void setE(Estoque e) {
		this.e = e;
	}
	

}
