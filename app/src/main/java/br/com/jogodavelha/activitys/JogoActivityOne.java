package br.com.jogodavelha.activitys;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import br.com.jogodavelha.R;
import br.com.jogodavelha.classes.ComputerPlayer;
import br.com.jogodavelha.classes.Player;
import br.com.jogodavelha.classes.PlayerInterface;
import br.com.jogodavelha.logica.Logica;

public class JogoActivityOne extends Activity {

	private List<Integer> jogadasPlayer1;
	private List<Integer> jogadasComputerPlayer;
	
	private Intent i = null;
	private Player p1;
	private ComputerPlayer computerPlayer;
	private Logica logica;
	private Random gerador;

	private Button b1 = null;
	private Button b2 = null;
	private Button b3 = null;
	private Button b4 = null;
	private Button b5 = null;
	private Button b6 = null;
	private Button b7 = null;
	private Button b8 = null;
	private Button b9 = null;

	private Boolean empate;
	private Boolean vitoria;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.jogo_layout);
		
		b1 = (Button)findViewById(R.id.b1);
		b2 = (Button)findViewById(R.id.b2);
		b3 = (Button)findViewById(R.id.b3);
		b4 = (Button)findViewById(R.id.b4);
		b5 = (Button)findViewById(R.id.b5);
		b6 = (Button)findViewById(R.id.b6);
		b7 = (Button)findViewById(R.id.b7);
		b8 = (Button)findViewById(R.id.b8);
		b9 = (Button)findViewById(R.id.b9);

		i = this.getIntent();

		computerPlayer = (ComputerPlayer)i.getExtras().get("computerPlayer");
		jogadasComputerPlayer = new ArrayList<Integer>();
		computerPlayer.setJogadas(jogadasComputerPlayer);
		
		p1 = (Player)i.getExtras().get("player1");
		jogadasPlayer1 = new ArrayList<Integer>();
		p1.setJogadas(jogadasPlayer1);
		
		logica = new Logica();
		gerador = new Random();

	}

	@Override
	protected void onStart() {
		super.onStart();

		b1.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Boolean para = executaJogadaPlayer(b1);

				if(para == false){
					executaJogadaComputer();
				}
			}
		});

		b2.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Boolean para = executaJogadaPlayer(b2);

				if(para == false){
					executaJogadaComputer();
				}
			}
		});

		b3.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Boolean para = executaJogadaPlayer(b3);

				if(para == false){
					executaJogadaComputer();
				}
			}
		});

		b4.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Boolean para = executaJogadaPlayer(b4);

				if(para == false){
					executaJogadaComputer();
				}
			}
		});

		b5.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Boolean para = executaJogadaPlayer(b5);

				if(para == false){
					executaJogadaComputer();
				}
			}
		});

		b6.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Boolean para = executaJogadaPlayer(b6);

				if(para == false){
					executaJogadaComputer();
				}
			}
		});

		b7.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Boolean para = executaJogadaPlayer(b7);

				if(para == false){
					executaJogadaComputer();
				}
			}
		});

		b8.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Boolean para = executaJogadaPlayer(b8);

				if(para == false){
					executaJogadaComputer();
				}
			}
		});

		b9.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Boolean para = executaJogadaPlayer(b9);

				if(para == false){
					executaJogadaComputer();
				}
			}
		});
	}

	public Boolean executaJogadaPlayer(Button b) {
		Log.i("JogoDaVelha", "1");
		if(b == b1){
			logica.executaJogadaPlayer(b1, p1, 1);
		}else if(b == b2){
			logica.executaJogadaPlayer(b2, p1, 2);
		}else if(b == b3){
			logica.executaJogadaPlayer(b3, p1, 3);
		}else if(b == b4){
			logica.executaJogadaPlayer(b4, p1, 4);
		}else if(b == b5){
			logica.executaJogadaPlayer(b5, p1, 5);
		}else if(b == b6){
			logica.executaJogadaPlayer(b6, p1, 6);
		}else if(b == b7){
			logica.executaJogadaPlayer(b7, p1, 7);
		}else if(b == b8){
			logica.executaJogadaPlayer(b8, p1, 8);
		}else if(b == b9){
			logica.executaJogadaPlayer(b9, p1, 9);
		}
		Log.i("JogoDaVelha", "2");

		verificaVitoria(p1);
		Log.i("JogoDaVelha", "3");
		verificaEmpate();
		Log.i("JogoDaVelha", "4");

		if(vitoria == true){
			vence(p1);
			Log.i("JogoDaVelha", "5");
			return true;

		}else if(empate == true){
			empata();
			Log.i("JogoDaVelha", "6");
			return true;
		}else{
			Log.i("JogoDaVelha", "7");
			return false;
		}
	}

	public void executaJogadaComputer() {
		if(computerPlayer.getDificuldade().equals("Easy")){
			logica.executaJogadaComputerEasy(computerPlayer, p1, this, gerador);

		}else if(computerPlayer.getDificuldade().equals("Medium")){
			logica.executaJogadaComputerMedium(computerPlayer, p1, this, gerador);

		}else if(computerPlayer.getDificuldade().equals("Hard")){
			logica.executaJogadaComputerHard(computerPlayer, p1, this, gerador);

		}

		verificaVitoria(computerPlayer);
		verificaEmpate();

		if(vitoria == true){
			vence(computerPlayer);

		}else if(empate == true){
			empata();
		}
	}

	public void verificaVitoria(PlayerInterface p) {
		vitoria = logica.verificaVitoria(p);
	}
	public void verificaEmpate() {
		empate = logica.verificaEmpate();
	}

	public void vence(PlayerInterface p) {
		this.finish();

		Intent intent = new Intent(JogoActivityOne.this, VitoriaActivity.class);

		intent.putExtra("modo", "OnePlayer");
		if(p == p1){
			intent.putExtra("vencedor", p1);
			intent.putExtra("perderdor", computerPlayer);

		}else if(p == computerPlayer){
			intent.putExtra("vencedor", computerPlayer);
			intent.putExtra("perderdor", p1);

		}

		startActivity(intent);
	}
	public void empata() {
		this.finish();

		Intent intent = new Intent(JogoActivityOne.this, EmpateActivity.class);
		intent.putExtra("modo", "OnePlayer");

		intent.putExtra("player1", p1);
		intent.putExtra("computerPlayer", computerPlayer);

		startActivity(intent);		
	}
}