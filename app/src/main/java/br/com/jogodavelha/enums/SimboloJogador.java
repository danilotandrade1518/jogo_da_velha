package br.com.jogodavelha.enums;

public enum SimboloJogador {

	X(1), O(2); 
	
	private final int valor; 

	SimboloJogador(int valorOpcao){ 
		valor = valorOpcao; 
	} 

	public int getValor(){ 
		return valor; 
	}
}
