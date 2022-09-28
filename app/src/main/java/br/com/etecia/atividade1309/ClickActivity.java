package br.com.etecia.atividade1309;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ClickActivity extends AppCompatActivity {
    TextView txtTitulo, txtAvaliacao, txtDescricao;
    ImageView imgCafe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);

        txtTitulo = findViewById(R.id.txtTitulo);
        txtDescricao = findViewById(R.id.txtDescrever);
        txtAvaliacao = findViewById(R.id.txtRating);
        imgCafe = findViewById(R.id.imgCafe);

        Intent intent = getIntent();

        //As variáveis que irão receber os valores da outra janela.
        String titulo, descricao, categoria, avaliacao;
        int miniatura;

        titulo = intent.getExtras().getString("Titulo");
        descricao = intent.getExtras().getString("Descricao");
        avaliacao = intent.getExtras().getString("avaliacao");
        miniatura = intent.getExtras().getInt("Miniatura");

        txtTitulo.setText(titulo);
        txtDescricao.setText(descricao);
        txtAvaliacao.setText(avaliacao);
        imgCafe.setImageResource(miniatura);



    }

}