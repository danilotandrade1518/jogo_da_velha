package br.com.jogodavelha.activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import br.com.jogodavelha.R;
import br.com.jogodavelha.classes.ComputerPlayer;
import br.com.jogodavelha.classes.Player;
import br.com.jogodavelha.enums.SimboloJogador;

public class SelecionaNomeJogadoresActivity extends Activity {

	private Button btnAvancar;
	private TextView txtPlayer1;
	private TextView txtPlayer2;
	private TextView txtInformeNomes;

	private Intent intent;
	private String modo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.seleciona_nome_jogadores_layout);

		btnAvancar = (Button)findViewById(R.id.btnAvancarNmJog);
		txtPlayer1 = (EditText)findViewById(R.id.txtNmPlayer1);
		txtPlayer2 = (EditText)findViewById(R.id.txtNmPlayer2);
		txtInformeNomes = (TextView)findViewById(R.id.txtInformeNomes);

		intent = this.getIntent();
		modo = intent.getExtras().get("modo").toString();

		if(modo.equals("OnePlayer")){
			TextView txt = (TextView)findViewById(R.id.textViewPlayer2);
			txtPlayer2.setVisibility(View.INVISIBLE);
			txt.setVisibility(View.INVISIBLE);
			txtInformeNomes.setText("Informe o seu nome:");
		}else{
			txtInformeNomes.setText("Informe o nome dos Jogadores:");
		}

		btnAvancar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(modo.equals("OnePlayer")){
					finish();

					Player p1 = new Player();

					if(txtPlayer1.getEditableText().toString().isEmpty() != true){
						p1.setNm_player(txtPlayer1.getEditableText().toString());
					}
					
					p1.setSimboloJogador(SimboloJogador.X);
					p1.setNumJogador(1);

					ComputerPlayer computerPlayer = new ComputerPlayer();
					computerPlayer.setSimboloJogador(SimboloJogador.O);
					computerPlayer.setDificuldade(intent.getExtras().get("dificuldade").toString());

					Intent i = new Intent(SelecionaNomeJogadoresActivity.this, JogoActivityOne.class);
					i.putExtra("player1", p1);
					i.putExtra("computerPlayer", computerPlayer);

					startActivity(i);				
				}else if(modo.equals("TwoPlayer")){
					if(txtPlayer1.getEditableText().toString().isEmpty() == true || txtPlayer2.getEditableText().toString().isEmpty() == true){
						Toast.makeText(SelecionaNomeJogadoresActivity.this, "Informe o nome dos dois jogadores!", Toast.LENGTH_SHORT).show();
					}else if(txtPlayer1.getEditableText().toString().equals(txtPlayer2.getEditableText().toString())){
						Toast.makeText(SelecionaNomeJogadoresActivity.this, "O nome dos dois jogadores não podem ser iguais!", Toast.LENGTH_SHORT).show();
					}else{
						finish();

						Player p1 = new Player();
						p1.setSimboloJogador(SimboloJogador.X);
						p1.setNm_player(txtPlayer1.getEditableText().toString());
						p1.setNumJogador(1);

						Player p2 = new Player();
						p2.setSimboloJogador(SimboloJogador.O);
						p2.setNm_player(txtPlayer2.getEditableText().toString());
						p2.setNumJogador(2);

						Intent i = new Intent(SelecionaNomeJogadoresActivity.this, JogoActivityTwo.class);
						i.putExtra("player1", p1);
						i.putExtra("player2", p2);

						startActivity(i);	
					}
				}
			}
		});
	}
}
