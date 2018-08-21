package com.example.marcos.capitaisapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Estado e;
    List<Estado> estados = new ArrayList<Estado>();
    TextView output, tViewEstado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        estados.add(new Estado("Rio Grande do Sul", "Porto Alegre"));
        estados.add(new Estado("Rio de Janeiro", "Rio de Janeiro"));
        estados.add(new Estado("Paraná", "Curitiba"));
        estados.add(new Estado("Minas Gerais", "Belo Horizonte"));
        estados.add(new Estado("Amazonas","Manaus"));

        output = (TextView) findViewById(R.id.output);
        output.setText("");
        tViewEstado = (TextView) findViewById(R.id.tViewEstado);
        tViewEstado.setText("Precione \"Start\"");
    }

    public void getEstado(View view) {
        Random r = new Random();
        int index = r.nextInt(5);
        e = estados.get(index);
        tViewEstado.setText(e.getNome());
    }

    public void verificaCapital(View view) {
        EditText input = (EditText) findViewById(R.id.input);
        if(input.getText().length() > 0) {
            if(e.getCapital().equals(input.getText().toString())) {
                output.setText("Certa resposta!");
            }
            else {
                output.setText("Resposta errada. Tente novamente!");
            }
        }
        else {
            Toast msg = Toast.makeText(this, "Informe uma capital!", Toast.LENGTH_SHORT);

            msg.show();
        }
    }
}
