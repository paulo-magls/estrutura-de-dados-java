package com.projeto.arvorebinaria.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj> {
	
	Integer meuValor;
	
	public Obj(Integer meuValor) {
		super();
		this.meuValor = meuValor;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(meuValor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Obj other = (Obj) obj;
		return Objects.equals(meuValor, other.meuValor);
	}

	@Override
	public int compareTo(Obj outro) {
		int i = 0;
		if(this.meuValor > outro.meuValor) {
			i = 1;
		} else if(this.meuValor < outro.meuValor){
			i = -1;
		}
		return i;
	}

	@Override
	public String toString() {
		return meuValor.toString();
	}
	
}
