package br.edu.ifsp.scl.dicesdm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ConfiguracaoActivity extends AppCompatActivity{

    EditText editTextConfig;
    Button salvarConfig;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        editTextConfig = (EditText)findViewById(R.id.numEditText);
        salvarConfig = (Button)findViewById((R.id.salvarConfigButton));
    }

    public void btnSalvaConfig(View view) {
        String qtdenumeros = editTextConfig.getText().toString();

        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("qtdeNumBingo", qtdenumeros);
        startActivity(i);
    }
}
