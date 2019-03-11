package br.com.jogodavelha.classes;

import java.io.Serializable;
import java.util.List;

import br.com.jogodavelha.enums.SimboloJogador;

public class ComputerPlayer implements PlayerInterface, Serializable{
	private String nm_player = "Android";
	private SimboloJogador simboloJogador = SimboloJogador.O;
	private List<Integer> jogadas;
	private String dificuldade;
	private int numJogador = 2;
	
	public int getNumJogador() {
		return numJogador;
	}

	public void setNumJogador(int numJogador) {
		this.numJogador = numJogador;
	}

	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}

	public void setNm_player(String nm_player) {
		this.nm_player = nm_player;
	}

	public String getNm_player() {
		return nm_player;
	}

	public SimboloJogador getSimboloJogador() {
		return simboloJogador;
	}

	public void setSimboloJogador(SimboloJogador simboloJogador) {
		this.simboloJogador = simboloJogador;
	}

	public List<Integer> getJogadas() {
		return jogadas;
	}

	public void setJogadas(List<Integer> jogadas) {
		this.jogadas = jogadas;
	}
	
	@Override
	public boolean equals(Object o) {
		ComputerPlayer p = (ComputerPlayer)o;
		if(p.getNm_player() == this.nm_player){
			return true;
		}else{
			return false;
		}
	}

}
