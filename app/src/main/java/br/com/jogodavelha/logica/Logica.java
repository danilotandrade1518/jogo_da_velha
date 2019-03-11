package br.com.jogodavelha.logica;

import java.util.Random;

import android.app.Activity;
import android.util.Log;
import android.widget.Button;
import br.com.jogodavelha.R;
import br.com.jogodavelha.classes.ComputerPlayer;
import br.com.jogodavelha.classes.Player;
import br.com.jogodavelha.classes.PlayerInterface;

public class Logica {

	private int[] jogadas = new int[10];
	private int contadorJogadas = 0;
	private MetodosComputerPlayer metodosComputerPlayer;

	public boolean verificaEmpate() {
		if(contadorJogadas == 9){
			return true;
		}else{
			return false;
		}
	}

	public boolean verificaVitoria(PlayerInterface p) {
		if(p.getJogadas().contains(1) && p.getJogadas().contains(2) && p.getJogadas().contains(3) ||
				p.getJogadas().contains(4) && p.getJogadas().contains(5) && p.getJogadas().contains(6) ||
				p.getJogadas().contains(7) && p.getJogadas().contains(8) && p.getJogadas().contains(9) ||
				p.getJogadas().contains(7) && p.getJogadas().contains(4) && p.getJogadas().contains(1) ||
				p.getJogadas().contains(8) && p.getJogadas().contains(5) && p.getJogadas().contains(2) ||
				p.getJogadas().contains(9) && p.getJogadas().contains(6) && p.getJogadas().contains(3) ||
				p.getJogadas().contains(1) && p.getJogadas().contains(5) && p.getJogadas().contains(9) ||
				p.getJogadas().contains(3) && p.getJogadas().contains(5) && p.getJogadas().contains(7)){

			return true;
		}else{
			return false;
		}
	}

	public void executaJogadaPlayer(Button b, Player p, int num_jogada) {
		Log.i("JogoDaVelha", "11");
		b.setClickable(false);
		Log.i("JogoDaVelha", "12");
		b.setText(p.getSimboloJogador().toString());
		Log.i("JogoDaVelha", "13");
		Log.i("JogoDaVelha", "Aqui: "+p.getJogadas());
		p.getJogadas().add(num_jogada);
		Log.i("JogoDaVelha", "14");
		jogadas[contadorJogadas] = num_jogada;
		Log.i("JogoDaVelha", "15");
		contadorJogadas++;
		Log.i("JogoDaVelha", "16");
	}

	public void jogadaComputer(ComputerPlayer p, int num_jogada, Activity view) {
		Button b = null;
		if(num_jogada == 1){
			b = (Button)view.findViewById(R.id.b1);
		}else if(num_jogada == 2){
			b = (Button)view.findViewById(R.id.b2);
		}else if(num_jogada == 3){
			b = (Button)view.findViewById(R.id.b3);
		}else if(num_jogada == 4){
			b = (Button)view.findViewById(R.id.b4);
		}else if(num_jogada == 5){
			b = (Button)view.findViewById(R.id.b5);
		}else if(num_jogada == 6){
			b = (Button)view.findViewById(R.id.b6);
		}else if(num_jogada == 7){
			b = (Button)view.findViewById(R.id.b7);
		}else if(num_jogada == 8){
			b = (Button)view.findViewById(R.id.b8);
		}else if(num_jogada == 9){
			b = (Button)view.findViewById(R.id.b9);
		}

		b.setClickable(false);
		b.setText(p.getSimboloJogador().toString());
		p.getJogadas().add(num_jogada);
		jogadas[contadorJogadas] = num_jogada;
		contadorJogadas++;
	}

	public void executaJogadaComputerEasy(ComputerPlayer computer,Player player, Activity view, Random gerador) {
		metodosComputerPlayer = new MetodosComputerPlayer();
		int vitoriaAdversario = metodosComputerPlayer.verificaVitoriaAdversaria(player, jogadas);

		if(vitoriaAdversario != 0){
			jogadaComputer(computer, vitoriaAdversario, view);
		}else{
			int numJogada = sorteiaJogada(gerador);
			jogadaComputer(computer, numJogada, view);
		}
	}

	public void executaJogadaComputerMedium(ComputerPlayer computer, Player player, Activity view, Random gerador) {
		metodosComputerPlayer = new MetodosComputerPlayer();
		int vitoria = metodosComputerPlayer.verificaVitoria(computer);
		int vitoriaAdversario = metodosComputerPlayer.verificaVitoriaAdversaria(player, jogadas);

		if(vitoria != 0 && verificaJogadaRepetida(vitoria) != true){
			jogadaComputer(computer, vitoria, view);
		}else if(vitoriaAdversario != 0){
			jogadaComputer(computer, vitoriaAdversario, view);
		}else{
			int numJogada = sorteiaJogada(gerador);
			jogadaComputer(computer, numJogada, view);
		}
	}

	public void executaJogadaComputerHard(ComputerPlayer computer, Player player, Activity view, Random gerador) {
		metodosComputerPlayer = new MetodosComputerPlayer();
		int vitoria = metodosComputerPlayer.verificaVitoria(computer);
		int vitoriaAdversario = metodosComputerPlayer.verificaVitoriaAdversaria(player, jogadas);
		int jogadaPensada = metodosComputerPlayer.jogadaPensada(computer, jogadas);

		if(vitoria != 0 && verificaJogadaRepetida(vitoria) != true){
			jogadaComputer(computer, vitoria, view);
		}else if(vitoriaAdversario != 0){
			jogadaComputer(computer, vitoriaAdversario, view);
		}else if(jogadaPensada != 0){
			jogadaComputer(computer, jogadaPensada, view);
		}else{
			int numJogada = sorteiaJogada(gerador);
			jogadaComputer(computer, numJogada, view);
		}
	}

	public int sorteiaJogada(Random gerador) {
		int numJogada =	gerador.nextInt(9) + 1;	

		Boolean jogadaRepetida = verificaJogadaRepetida(numJogada);

		while(jogadaRepetida == true) {
			numJogada =	gerador.nextInt(9) + 1;	
			jogadaRepetida = verificaJogadaRepetida(numJogada);

		}
		return numJogada;
	}

	public Boolean verificaJogadaRepetida(int numJogada) {
		if(jogadas[0] == numJogada || jogadas[1] == numJogada || jogadas[2] == numJogada || jogadas[3] == numJogada || jogadas[4] == numJogada
				|| jogadas[5] == numJogada || jogadas[6] == numJogada || jogadas[7] == numJogada || jogadas[8] == numJogada){
			return true;
		}else{
			return false;
		}
	}
}
