package br.com.jogodavelha.activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import br.com.jogodavelha.R;
import br.com.jogodavelha.classes.ComputerPlayer;
import br.com.jogodavelha.classes.Player;

public class EmpateActivity extends Activity {

	private Button btnJogNovEmpate;
	private Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); 

		setContentView(R.layout.empate_layout);

		intent = this.getIntent();

		btnJogNovEmpate = (Button)findViewById(R.id.btnJogNovEmpate);
		btnJogNovEmpate.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				jogarNovamente();
			}
		});
	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		jogarNovamente();
	}

	public void jogarNovamente() {
		EmpateActivity.this.finish();

		if(intent.getExtras().get("modo").equals("OnePlayer")){
			Intent i = new Intent(EmpateActivity.this, JogoActivityOne.class);
			ComputerPlayer computerPlayer = (ComputerPlayer)intent.getExtras().get("computerPlayer");
			Player p1 = (Player)intent.getExtras().get("player1");

			i.putExtra("computerPlayer", computerPlayer);
			i.putExtra("player1", p1);

			startActivity(i);
		}else if(intent.getExtras().get("modo").equals("TwoPlayer")){
			Intent i = new Intent(EmpateActivity.this, JogoActivityTwo.class);
			Player p1 = (Player)intent.getExtras().get("player1");
			Player p2 = (Player)intent.getExtras().get("player2");

			i.putExtra("player1", p1);
			i.putExtra("player2", p2);

			startActivity(i);
		}


	}
}
