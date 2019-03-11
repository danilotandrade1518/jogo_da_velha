package br.com.jogodavelha.activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import br.com.jogodavelha.R;

public class SelecionaNumJogadoresActivity extends Activity {

	private Button btnAvancar;
	private RadioButton rbOnePlayer;
	private RadioButton rbTwoPlayer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.seleciona_num_jogadores_layout);

		btnAvancar = (Button)findViewById(R.id.btnAvancarNumJog);
		rbOnePlayer = (RadioButton)findViewById(R.id.rbOnePlayer);
		rbTwoPlayer = (RadioButton)findViewById(R.id.rbTwoPlayer);

		btnAvancar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(rbTwoPlayer.isChecked() == true){
					Intent i = new Intent(SelecionaNumJogadoresActivity.this, SelecionaNomeJogadoresActivity.class);
					i.putExtra("modo", "TwoPlayer");
					startActivity(i);
				}
				if(rbOnePlayer.isChecked() == true){
					Intent i = new Intent(SelecionaNumJogadoresActivity.this, SelecionaDificuldadeActivity.class);
					startActivity(i);
				}
			}
		});
	}
}
