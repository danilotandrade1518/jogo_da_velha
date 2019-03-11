package br.com.jogodavelha.activitys;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import br.com.jogodavelha.R;
import br.com.jogodavelha.classes.Player;
import br.com.jogodavelha.classes.PlayerInterface;
import br.com.jogodavelha.logica.Logica;

public class JogoActivityTwo extends Activity {

	private List<Integer> jogadasPlayer1;
	private List<Integer> jogadasPlayer2;

	private Player p1;
	private Player p2;
	private Logica logica;

	private TextView txtNmJogador;
	
	private Button b1 = null;
	private Button b2 = null;
	private Button b3 = null;
	private Button b4 = null;
	private Button b5 = null;
	private Button b6 = null;
	private Button b7 = null;
	private Button b8 = null;
	private Button b9 = null;

	private Boolean vezPlayer1 = true;

	private Intent i;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.jogo_layout);

		i = this.getIntent();

		txtNmJogador = (TextView)findViewById(R.id.txtNmJogador);

		p1 = (Player)i.getExtras().get("player1");
		jogadasPlayer1 = new ArrayList<Integer>();
		p1.setJogadas(jogadasPlayer1);

		p2 = (Player)i.getExtras().get("player2");
		jogadasPlayer2 = new ArrayList<Integer>();
		p2.setJogadas(jogadasPlayer2);

		txtNmJogador.setText(p1.getNm_player());

		b1 = (Button)findViewById(R.id.b1);
		b2 = (Button)findViewById(R.id.b2);
		b3 = (Button)findViewById(R.id.b3);
		b4 = (Button)findViewById(R.id.b4);
		b5 = (Button)findViewById(R.id.b5);
		b6 = (Button)findViewById(R.id.b6);
		b7 = (Button)findViewById(R.id.b7);
		b8 = (Button)findViewById(R.id.b8);
		b9 = (Button)findViewById(R.id.b9);

		logica = new Logica();
	}

	@Override
	protected void onStart() {
		super.onStart();

		b1.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				if(vezPlayer1 == true){
					executaJogadaPlayer(p1, b1);

					vezPlayer1 = false;
				}else{
					executaJogadaPlayer(p2, b1);

					vezPlayer1 = true;
				}
			}
		});

		b2.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				if(vezPlayer1 == true){
					executaJogadaPlayer(p1, b2);

					vezPlayer1 = false;
				}else{
					executaJogadaPlayer(p2, b2);

					vezPlayer1 = true;
				}
			}
		});

		b3.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				if(vezPlayer1 == true){
					executaJogadaPlayer(p1, b3);

					vezPlayer1 = false;

				}else{
					executaJogadaPlayer(p2, b3);

					vezPlayer1 = true;
				}
			}
		});

		b4.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				if(vezPlayer1 == true){
					executaJogadaPlayer(p1, b4);

					vezPlayer1 = false;
				}else{
					executaJogadaPlayer(p2, b4);

					vezPlayer1 = true;
				}
			}
		});

		b5.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				if(vezPlayer1 == true){
					executaJogadaPlayer(p1, b5);

					vezPlayer1 = false;
				}else{
					executaJogadaPlayer(p2, b5);

					vezPlayer1 = true;
				}
			}
		});

		b6.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				if(vezPlayer1 == true){
					executaJogadaPlayer(p1, b6);

					vezPlayer1 = false;
				}else{
					executaJogadaPlayer(p2, b6);

					vezPlayer1 = true;
				}
			}
		});

		b7.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				if(vezPlayer1 == true){
					executaJogadaPlayer(p1, b7);

					vezPlayer1 = false;
				}else{
					executaJogadaPlayer(p2, b7);

					vezPlayer1 = true;
				}
			}
		});

		b8.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				if(vezPlayer1 == true){
					executaJogadaPlayer(p1, b8);

					vezPlayer1 = false;
				}else{
					executaJogadaPlayer(p2, b8);

					vezPlayer1 = true;
				}
			}
		});

		b9.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				if(vezPlayer1 == true){
					executaJogadaPlayer(p1, b9);

					vezPlayer1 = false;
					
				}else{
					executaJogadaPlayer(p2, b9);

					vezPlayer1 = true;
				}
			}
		});
	}

	public void executaJogadaPlayer(final Player p, Button b) {
		Log.i("JogoDaVelha", "1");
		if(b == b1){
			logica.executaJogadaPlayer(b1, p, 1);
		}else if(b == b2){
			logica.executaJogadaPlayer(b2, p, 2);
		}else if(b == b3){
			logica.executaJogadaPlayer(b3, p, 3);
		}else if(b == b4){
			logica.executaJogadaPlayer(b4, p, 4);
		}else if(b == b5){
			logica.executaJogadaPlayer(b5, p, 5);
		}else if(b == b6){
			logica.executaJogadaPlayer(b6, p, 6);
		}else if(b == b7){
			logica.executaJogadaPlayer(b7, p, 7);
		}else if(b == b8){
			logica.executaJogadaPlayer(b8, p, 8);
		}else if(b == b9){
			logica.executaJogadaPlayer(b9, p, 9);
		}
		Log.i("JogoDaVelha", "2");

		verifica(p);
		if(p == p1){
			Log.i("JogoDaVelha", "3");
			Log.i("JogoDaVelha", "Aqui "+p2.getNm_player());
			mudaNomeJogador(p2.getNm_player());
		}else if(p == p2){
			Log.i("JogoDaVelha", "4");
			mudaNomeJogador(p1.getNm_player());
		}
	}

	public void mudaNomeJogador(String nm) {
		txtNmJogador.setText(nm);
	}
	
	public void verifica(PlayerInterface p) {
		Boolean vitoria = logica.verificaVitoria(p);
		Boolean empate = logica.verificaEmpate();
		if(vitoria == true){
			this.finish();

			Intent intent = new Intent(JogoActivityTwo.this, VitoriaActivity.class);

			intent.putExtra("modo", "TwoPlayer");
			if(p == p1){
				intent.putExtra("vencedor", p1);
				intent.putExtra("perderdor", p2);

			}else if(p == p2){
				intent.putExtra("vencedor", p2);
				intent.putExtra("perderdor", p1);
			}

			startActivity(intent);
		}else if(empate == true){
			this.finish();

			Intent intent = new Intent(JogoActivityTwo.this, EmpateActivity.class);
			intent.putExtra("modo", "TwoPlayer");

			intent.putExtra("player1", p1);
			intent.putExtra("player2", p2);

			startActivity(intent);

		}
	}
}