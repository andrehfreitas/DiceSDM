package br.edu.ifsp.scl.dicesdm;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Random;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflar o menu e colocar os itens
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Intent configuracaoIntent = new Intent(this, ConfiguracaoActivity.class);
            startActivity(configuracaoIntent);
            return true;
        }

        if (id == R.id.action_exit){
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnJoga(View view) {
        Bundle dados = getIntent().getExtras();

        if (dados != null) {
            int qtdenumeros = Integer.parseInt(dados.getString("qtdeNumBingo").toString());

            Random random = new Random();
            int numeroram = random.nextInt(qtdenumeros) + 1;
            String numeroramtexto = Integer.toString(numeroram);

            TextView resultText1 = (TextView) findViewById(R.id.resultadoTextView1);
            resultText1.setText("Número sorteado de 1 a " + qtdenumeros);

            TextView resultText2 = (TextView) findViewById(R.id.resultadoTextView2);
            resultText2.setText(numeroramtexto);
        }

        /*ArrayList<String> listaSorteados = new ArrayList<>();
        listaSorteados.add(numeroramtexto);
        TextView resultText3 = (TextView) findViewById(R.id.resultadoTextView3);
        resultText3.setText(listaSorteados.toString());*/
    }
}
