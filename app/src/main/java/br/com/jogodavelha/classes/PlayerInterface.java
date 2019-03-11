package br.com.jogodavelha.classes;

import java.util.List;

import br.com.jogodavelha.enums.SimboloJogador;

public interface PlayerInterface{

	public String getNm_player();
	public SimboloJogador getSimboloJogador();
	public List<Integer> getJogadas();
	public void setJogadas(List<Integer> jogadas);
	public int getNumJogador();
	public void setNm_player(String nm_player);
	public void setSimboloJogador(SimboloJogador simboloJogador);
}
