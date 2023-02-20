package com.projeto.fila;

public class No {
	
	private Object object;
	private No refNo;
	
	public No() {
		super();
	}

	public No(Object object) {
		super();
		this.refNo = null;
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}

	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}
	
}
