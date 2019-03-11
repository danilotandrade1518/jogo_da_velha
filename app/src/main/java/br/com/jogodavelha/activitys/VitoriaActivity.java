package br.com.jogodavelha.activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.jogodavelha.R;
import br.com.jogodavelha.classes.ComputerPlayer;
import br.com.jogodavelha.classes.Player;
import br.com.jogodavelha.classes.PlayerInterface;

public class VitoriaActivity extends Activity {

	private TextView txtVencedor;
	private PlayerInterface perderdor;
	private PlayerInterface vencedor;
	private Button btnJogNovVitoria;
	private ImageView img;
	private Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); 
		setContentView(R.layout.vitoria_layout);

		intent = this.getIntent();
		txtVencedor = (TextView)findViewById(R.id.txtVencedor);		
		perderdor = (PlayerInterface)(intent.getExtras().get("perderdor"));
		img = (ImageView)findViewById(R.id.img_vitoria);

		vencedor = (PlayerInterface)(intent.getExtras().get("vencedor"));
		txtVencedor.setText("Parabéns "+vencedor.getNm_player()+" , você venceu!");

		if(vencedor.getNm_player().equals("Android")){
			img.setImageResource(R.drawable.ic_vitoria_android);
		}else{
			img.setImageResource(R.drawable.ic_vitoria_player);
		}

		btnJogNovVitoria = (Button)findViewById(R.id.btnJogNovVitoria);
		btnJogNovVitoria.setOnClickListener(new OnClickListener() {			
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
		VitoriaActivity.this.finish();

		if(intent.getExtras().get("modo").equals("OnePlayer")){
			Intent i = new Intent(VitoriaActivity.this, JogoActivityOne.class);
			if(vencedor.getNumJogador() == 2){
				ComputerPlayer computerPlayer = (ComputerPlayer)vencedor;
				Player p1 = (Player)perderdor;

				i.putExtra("computerPlayer", computerPlayer);
				i.putExtra("player1", p1);
			}else if(vencedor.getNumJogador() == 1){
				Player p1 = (Player)vencedor;
				ComputerPlayer computerPlayer = (ComputerPlayer)perderdor;

				i.putExtra("computerPlayer", computerPlayer);
				i.putExtra("player1", p1);

			}
			startActivity(i);
		}else if(intent.getExtras().get("modo").equals("TwoPlayer")){
			Intent i = new Intent(VitoriaActivity.this, JogoActivityTwo.class);
			if(vencedor.getNumJogador() == 1){
				Player p1 = (Player)vencedor;
				Player p2 = (Player)perderdor;

				i.putExtra("player1", p1);
				i.putExtra("player2", p2);
			}else if(vencedor.getNumJogador() == 2){
				Player p2 = (Player)vencedor;
				Player p1 = (Player)perderdor;
				i.putExtra("player2", p2);
				i.putExtra("player1", p1);

			}
			startActivity(i);
		}


	}
}
