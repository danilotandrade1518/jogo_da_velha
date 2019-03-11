package br.com.jogodavelha.activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import br.com.jogodavelha.R;

public class SelecionaDificuldadeActivity extends Activity {

	private RadioButton rbEasy;
	private RadioButton rbMedium;
	private RadioButton rbHard;
	private Button btnAvancar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.seleciona_dificuldade_layout);

		btnAvancar = (Button)findViewById(R.id.btnAvancarDificJog);

		rbEasy = (RadioButton)findViewById(R.id.rbEasy);
		rbMedium = (RadioButton)findViewById(R.id.rbMedium);
		rbHard = (RadioButton)findViewById(R.id.rbHard);

		btnAvancar.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				finish();

				Intent intent = new Intent(SelecionaDificuldadeActivity.this, SelecionaNomeJogadoresActivity.class);
				intent.putExtra("modo", "OnePlayer");
				if(rbEasy.isChecked() == true){
					intent.putExtra("dificuldade", "Easy");
				}else if(rbMedium.isChecked() == true){
					intent.putExtra("dificuldade", "Medium");
				}else if(rbHard.isChecked() == true){
					intent.putExtra("dificuldade", "Hard");
				}
				startActivity(intent);				
			}
		});
	}
}
