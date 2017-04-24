package br.com.prisciladelima.model;

import java.util.Date;

//*Cadastro dos cartões de crédito do usuário*//

public class Cartao {

	private String OperadoraCartao;
	private String numCartao;
	private int codSeg;
	private Date Validade;
	
	public Cartao(String operadoraCartao, String numCartao, int codSeg, Date validade) {
		super();
		OperadoraCartao = operadoraCartao;
		this.numCartao = numCartao;
		this.codSeg = codSeg;
		Validade = validade;
	}

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public int getCodSeg() {
		return codSeg;
	}

	public void setCodSeg(int codSeg) {
		this.codSeg = codSeg;
	}

	public Date getValidade() {
		return Validade;
	}

	public void setValidade(Date validade) {
		Validade = validade;
	}

	public String getOperadoraCartao() {
		return OperadoraCartao;
	}

	public void setOperadoraCartao(String operadoraCartao) {
		OperadoraCartao = operadoraCartao;
	}

	
	
	

}
