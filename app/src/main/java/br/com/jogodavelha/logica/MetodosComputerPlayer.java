package br.com.jogodavelha.logica;

import br.com.jogodavelha.classes.ComputerPlayer;
import br.com.jogodavelha.classes.Player;

public class MetodosComputerPlayer {

	public int verificaVitoria(ComputerPlayer p) {
		if(p.getJogadas().contains(1) && p.getJogadas().contains(2)){
			return 3;
		}else if(p.getJogadas().contains(1) && p.getJogadas().contains(3)){
			return 2;
		}else if(p.getJogadas().contains(2) && p.getJogadas().contains(3)){
			return 1;
		}else if(p.getJogadas().contains(4) && p.getJogadas().contains(5)){
			return 6;
		}else if(p.getJogadas().contains(4) && p.getJogadas().contains(6)){
			return 5;
		}else if(p.getJogadas().contains(5) && p.getJogadas().contains(6)){
			return 4;
		}else if(p.getJogadas().contains(7) && p.getJogadas().contains(8)){
			return 9;
		}else if(p.getJogadas().contains(7) && p.getJogadas().contains(9)){
			return 8;
		}else if(p.getJogadas().contains(8) && p.getJogadas().contains(9)){
			return 7;
		}else if(p.getJogadas().contains(1) && p.getJogadas().contains(4)){
			return 7;
		}else if(p.getJogadas().contains(1) && p.getJogadas().contains(7)){
			return 4;
		}else if(p.getJogadas().contains(4) && p.getJogadas().contains(7)){
			return 1;
		}else if(p.getJogadas().contains(2) && p.getJogadas().contains(5)){
			return 8;
		}else if(p.getJogadas().contains(2) && p.getJogadas().contains(8)){
			return 5;
		}else if(p.getJogadas().contains(5) && p.getJogadas().contains(8)){
			return 2;
		}else if(p.getJogadas().contains(3) && p.getJogadas().contains(6)){
			return 9;
		}else if(p.getJogadas().contains(3) && p.getJogadas().contains(9)){
			return 6;
		}else if(p.getJogadas().contains(6) && p.getJogadas().contains(9)){
			return 3;
		}else if(p.getJogadas().contains(1) && p.getJogadas().contains(5)){
			return 9;
		}else if(p.getJogadas().contains(1) && p.getJogadas().contains(9)){
			return 5;
		}else if(p.getJogadas().contains(5) && p.getJogadas().contains(9)){
			return 1;
		}else if(p.getJogadas().contains(3) && p.getJogadas().contains(5)){
			return 7;
		}else if(p.getJogadas().contains(3) && p.getJogadas().contains(7)){
			return 5;
		}else if(p.getJogadas().contains(5) && p.getJogadas().contains(7)){
			return 3;
		}else{
			return 0;
		}
	}

	public int verificaVitoriaAdversaria(Player p, int[] jogadas) {
		int jogada = 0;
		if(p.getJogadas().contains(1) && p.getJogadas().contains(2)){
			if(verificaJogadaRepetida(3, jogadas) != true){
				jogada = 3;
			}
		}
		if(p.getJogadas().contains(1) && p.getJogadas().contains(3)){
			if(verificaJogadaRepetida(2, jogadas) != true){
				jogada = 2;
			}
		}
		if(p.getJogadas().contains(2) && p.getJogadas().contains(3)){
			if(verificaJogadaRepetida(1, jogadas) != true){
				jogada = 1;
			}
		}
		if(p.getJogadas().contains(4) && p.getJogadas().contains(5)){
			if(verificaJogadaRepetida(6, jogadas) != true){
				jogada = 6;
			}
		}
		if(p.getJogadas().contains(4) && p.getJogadas().contains(6)){
			if(verificaJogadaRepetida(5, jogadas) != true){
				jogada = 5;
			}
		}
		if(p.getJogadas().contains(5) && p.getJogadas().contains(6)){
			if(verificaJogadaRepetida(4, jogadas) != true){
				jogada = 4;
			}
		}
		if(p.getJogadas().contains(7) && p.getJogadas().contains(8)){
			if(verificaJogadaRepetida(9, jogadas) != true){
				jogada = 9;
			}
		}
		if(p.getJogadas().contains(7) && p.getJogadas().contains(9)){
			if(verificaJogadaRepetida(8, jogadas) != true){
				jogada = 8;
			}
		}
		if(p.getJogadas().contains(8) && p.getJogadas().contains(9)){
			if(verificaJogadaRepetida(7, jogadas) != true){
				jogada = 7;
			}
		}
		if(p.getJogadas().contains(1) && p.getJogadas().contains(4)){
			if(verificaJogadaRepetida(7, jogadas) != true){
				jogada = 7;
			}
		}
		if(p.getJogadas().contains(1) && p.getJogadas().contains(7)){
			if(verificaJogadaRepetida(4, jogadas) != true){
				jogada = 4;
			}
		}
		if(p.getJogadas().contains(4) && p.getJogadas().contains(7)){
			if(verificaJogadaRepetida(1, jogadas) != true){
				jogada = 1;
			}
		}
		if(p.getJogadas().contains(2) && p.getJogadas().contains(5)){
			if(verificaJogadaRepetida(8, jogadas) != true){
				jogada = 8;
			}
		}
		if(p.getJogadas().contains(2) && p.getJogadas().contains(8)){
			if(verificaJogadaRepetida(5, jogadas) != true){
				jogada = 5;
			}
		}
		if(p.getJogadas().contains(5) && p.getJogadas().contains(8)){
			if(verificaJogadaRepetida(2, jogadas) != true){
				jogada = 2;
			}
		}
		if(p.getJogadas().contains(3) && p.getJogadas().contains(6)){
			if(verificaJogadaRepetida(9, jogadas) != true){
				jogada = 9;
			}
		}
		if(p.getJogadas().contains(3) && p.getJogadas().contains(9)){
			if(verificaJogadaRepetida(6, jogadas) != true){
				jogada = 6;
			}
		}
		if(p.getJogadas().contains(6) && p.getJogadas().contains(9)){
			if(verificaJogadaRepetida(3, jogadas) != true){
				jogada = 3;
			}
		}
		if(p.getJogadas().contains(1) && p.getJogadas().contains(5)){
			if(verificaJogadaRepetida(9, jogadas) != true){
				jogada = 9;
			}
		}
		if(p.getJogadas().contains(1) && p.getJogadas().contains(9)){
			if(verificaJogadaRepetida(5, jogadas) != true){
				jogada = 5;
			}
		}
		if(p.getJogadas().contains(5) && p.getJogadas().contains(9)){
			if(verificaJogadaRepetida(1, jogadas) != true){
				jogada = 1;
			}
		}
		if(p.getJogadas().contains(3) && p.getJogadas().contains(5)){
			if(verificaJogadaRepetida(7, jogadas) != true){
				jogada = 7;
			}
		}
		if(p.getJogadas().contains(3) && p.getJogadas().contains(7)){
			if(verificaJogadaRepetida(5, jogadas) != true){
				jogada = 5;
			}
		}
		if(p.getJogadas().contains(5) && p.getJogadas().contains(7)){
			if(verificaJogadaRepetida(3, jogadas) != true){
				jogada = 3;
			}
		}
		return jogada;
	}

	public int jogadaPensada(ComputerPlayer p, int[] jogadas) {
		if(p.getJogadas().contains(1) && p.getJogadas().contains(2) == false && p.getJogadas().contains(3) == false){
			if(verificaJogadaRepetida(2, jogadas)==false){
				return 2;		
			}
		}
		if(p.getJogadas().contains(2) && p.getJogadas().contains(1) == false && p.getJogadas().contains(3) == false){
			if(verificaJogadaRepetida(1, jogadas)==false){
				return 1;		
			}
		}
		if(p.getJogadas().contains(3) && p.getJogadas().contains(1) == false && p.getJogadas().contains(2) == false){
			if(verificaJogadaRepetida(2, jogadas)==false){
				return 2;	
			}
		}
		if(p.getJogadas().contains(4) && p.getJogadas().contains(5) == false && p.getJogadas().contains(6) == false){
			if(verificaJogadaRepetida(5, jogadas)==false){
				return 5;		
			}
		}
		if(p.getJogadas().contains(5) && p.getJogadas().contains(6) == false && p.getJogadas().contains(4) == false){
			if(verificaJogadaRepetida(4, jogadas)==false){
				return 4;		
			}
		}
		if(p.getJogadas().contains(6) && p.getJogadas().contains(5) == false && p.getJogadas().contains(4) == false){
			if(verificaJogadaRepetida(5, jogadas)==false){
				return 5;		
			}
		}
		if(p.getJogadas().contains(7) && p.getJogadas().contains(8) == false && p.getJogadas().contains(9) == false){
			if(verificaJogadaRepetida(8, jogadas)==false){
				return 8;		
			}
		}
		if(p.getJogadas().contains(8) && p.getJogadas().contains(7) == false && p.getJogadas().contains(9) == false){
			if(verificaJogadaRepetida(9, jogadas)==false){
				return 9;		
			}
		}
		if(p.getJogadas().contains(9) && p.getJogadas().contains(8) == false && p.getJogadas().contains(7) == false){
			if(verificaJogadaRepetida(7, jogadas)==false){
				return 7;		
			}
		}
		if(p.getJogadas().contains(1) && p.getJogadas().contains(5) == false && p.getJogadas().contains(9) == false){
			if(verificaJogadaRepetida(9, jogadas)==false){
				return 9;		
			}
		}
		if(p.getJogadas().contains(5) && p.getJogadas().contains(1) == false && p.getJogadas().contains(9) == false){
			if(verificaJogadaRepetida(1, jogadas)==false){
				return 1;		
			}
		}
		if(p.getJogadas().contains(9) && p.getJogadas().contains(5) == false && p.getJogadas().contains(1) == false){
			if(verificaJogadaRepetida(5, jogadas)==false){
				return 5;		
			}
		}
		if(p.getJogadas().contains(3) && p.getJogadas().contains(5) == false && p.getJogadas().contains(7) == false){
			if(verificaJogadaRepetida(7, jogadas)==false){
				return 7;		
			}
		}
		if(p.getJogadas().contains(5) && p.getJogadas().contains(3) == false && p.getJogadas().contains(7) == false){
			if(verificaJogadaRepetida(3, jogadas)==false){
				return 3;		
			}
		}
		if(p.getJogadas().contains(7) && p.getJogadas().contains(3) == false && p.getJogadas().contains(5) == false){
			if(verificaJogadaRepetida(5, jogadas)==false){
				return 5;		
			}
		}
		if(p.getJogadas().contains(1) && p.getJogadas().contains(4) == false && p.getJogadas().contains(7) == false){
			if(verificaJogadaRepetida(7, jogadas)==false){
				return 7;		
			}
		}
		if(p.getJogadas().contains(4) && p.getJogadas().contains(1) == false && p.getJogadas().contains(7) == false){
			if(verificaJogadaRepetida(1, jogadas)==false){
				return 1;		
			}
		}
		if(p.getJogadas().contains(7) && p.getJogadas().contains(4) == false && p.getJogadas().contains(1) == false){
			if(verificaJogadaRepetida(4, jogadas)==false){
				return 4;
			}
		}
		if(p.getJogadas().contains(2) && p.getJogadas().contains(5) == false && p.getJogadas().contains(8) == false){
			if(verificaJogadaRepetida(8, jogadas)==false){
				return 8;
			}
		}
		if(p.getJogadas().contains(5) && p.getJogadas().contains(8) == false && p.getJogadas().contains(2) == false){
			if(verificaJogadaRepetida(2, jogadas)==false){
				return 2;
			}
		}
		if(p.getJogadas().contains(8) && p.getJogadas().contains(2) == false && p.getJogadas().contains(5) == false){
			if(verificaJogadaRepetida(5, jogadas)==false){
				return 5;
			}
		}
		if(p.getJogadas().contains(3) && p.getJogadas().contains(6) == false && p.getJogadas().contains(9) == false){
			if(verificaJogadaRepetida(9, jogadas)==false){
				return 9;
			}
		}
		if(p.getJogadas().contains(6) && p.getJogadas().contains(9) == false && p.getJogadas().contains(3) == false){
			if(verificaJogadaRepetida(3, jogadas)==false){
				return 3;
			}
		}
		if(p.getJogadas().contains(9) && p.getJogadas().contains(3) == false && p.getJogadas().contains(6) == false){
			if(verificaJogadaRepetida(6, jogadas)==false){
				return 6;
			}
		}
		return 0;
	}

	public Boolean verificaJogadaRepetida(int numJogada, int[] jogadas) {
		if(jogadas[0] == numJogada || jogadas[1] == numJogada || jogadas[2] == numJogada || jogadas[3] == numJogada || jogadas[4] == numJogada
				|| jogadas[5] == numJogada || jogadas[6] == numJogada || jogadas[7] == numJogada || jogadas[8] == numJogada){
			return true;
		}else{
			return false;
		}
	}
}