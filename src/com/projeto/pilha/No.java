package com.projeto.pilha;

public class No {
	
	private int dado;
	private No refNo = null;
	
	public No() {
		super();
	}

	public No(int dado) {
		super();
		this.dado = dado;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}

	@Override
	public String toString() {
		return "No [dado=" + dado + "]";
	}
	
}
