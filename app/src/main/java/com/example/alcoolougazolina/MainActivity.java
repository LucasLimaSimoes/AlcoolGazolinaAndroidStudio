package com.example.alcoolougazolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editPrecoAlcool;
    private EditText editPrecoGazolina;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editAlcool);
        editPrecoGazolina = findViewById(R.id.editGazolina);
        textoResultado = findViewById(R.id.textResultado);
    }

    public void calculaPreco(View v){
        Double precoAlcool = Double.parseDouble( editPrecoAlcool.getText().toString()); //pega o preco do alcool informado
        Double precoGazolina = Double.parseDouble(editPrecoGazolina.getText().toString()); //pega o preço da gazolina informado
        Double resultado = precoAlcool/precoGazolina; // faz o calculo da fração

        if(resultado>=0.7){ //verifica melhor opção
            textoResultado.setText("Melhor utilizar gazolina");
        }else{
            textoResultado.setText("Melhor utilizar alcool");
        }

    }
}