package br.com.pim.model;

public class ItensdePedido extends Pedido{

	private Estoque e;
	private Reservar r;
	private int qtd;
	private double totalItem;
	private double totalPedido;
	

	
	public double somaItem(Estoque e) {
		return totalItem = e.getValorUnit() * qtd;	
	}
	
	double validarEstoque(Estoque e){
		if (qtd<e.getQtde()){
			System.out.println("Estoque indisponível. Reservar produto?");	
			r.setUsuario(r.getUsuario());
			r.setLivro(r.getLivro());
			r.setDataLimite(r.getDataLimite());
		}
		return somaItem(e);
	}
	
	public double totalPedido(Estoque e) {
		return totalPedido = this.totalItem + totalPedido;	
	}
	
		
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
