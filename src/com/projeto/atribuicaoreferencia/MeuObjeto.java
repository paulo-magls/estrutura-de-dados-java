package com.projeto.atribuicaoreferencia;

public class MeuObjeto {
	
	Integer num;

	public MeuObjeto(Integer num) {
		super();
		this.num = num;
	}
	
	public void setNum(Integer num){
		this.num = num;
	}

	@Override
	public String toString() {
		return this.num.toString();
	}
	
}