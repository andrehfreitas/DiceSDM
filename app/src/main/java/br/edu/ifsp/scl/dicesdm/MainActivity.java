package br.edu.ifsp.scl.dicesdm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Random usado para simular o lançamento do dado
    private Random geradorRandomico;
    // Componentes visuais
    private TextView resultadoTextView;
    private Button jogarDadoButton;
    private ImageView resultadoImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Após a criação da tela
        geradorRandomico = new Random(System.currentTimeMillis());
        // Recuperando referência para o resultadoTextView do arquivo de layout
        resultadoTextView = findViewById(R.id.resultadoTextView);
        // Recuperando referência para o jogarDadoButton do arquivo de layout
        jogarDadoButton = findViewById(R.id.jogarDadoButton);
        jogarDadoButton.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.jogarDadoButton) {
            int resultado = geradorRandomico.nextInt(6) + 1;
            resultadoTextView.setText("Face sorteada: " + resultado);
        }
    }
}
