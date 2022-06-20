package com.example.shared2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String PREF_NAME = "ARQUIVO";
    public static final String TAG = "meu_app";

    SharedPreferences preferences;
    SharedPreferences.Editor dados;

    String nome, nomeProduto;
    int codigoProduto;
    float precoProduto;
    boolean estoque;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: Rodando ok");

    preferences = getSharedPreferences(PREF_NAME, MODE_PRIVATE);
        Log.i(TAG, "onCreate: Criando o arquivo");

        nome="James";
        nomeProduto = "Notebook Dell";
        precoProduto = 2550f;
        codigoProduto = 123;
        estoque = true;

        int teste = 0;

        dados.putString("nome", nome);
        dados.putString("Produto", nomeProduto);
        dados.putInt("Codigo", codigoProduto);
        dados.putFloat("Preço",precoProduto);
        dados.putBoolean("tem_no_Estoque",estoque);
        dados.apply();


    }
}
