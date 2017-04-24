package br.com.prisciladelima.model;

//*Dados para pagamento da compra*//

import java.util.Date;

public class Pagamento {

	private Cartao cartao;
	private Double valor;
	private Date data;

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Pagamento(Cartao cartao, Double valor, Date data) {
		super();
		this.cartao = cartao;
		this.valor = valor;
		this.data = data;
	}

}
