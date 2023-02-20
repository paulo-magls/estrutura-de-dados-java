package com.projeto.fila;

public class Main {
	public static void main(String[] args) {
		
		Fila minhaFila = new Fila();
		
		minhaFila.enqueue(new No("primeiro"));
		minhaFila.enqueue(new No("segundo"));
		minhaFila.enqueue(new No("terceiro"));
		minhaFila.enqueue(new No("quarto"));
		
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.dequeue());
		
		System.out.println(minhaFila);
		
		minhaFila.enqueue(new No("último"));
		
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.first());
		
		System.out.println(minhaFila);
	}
}
