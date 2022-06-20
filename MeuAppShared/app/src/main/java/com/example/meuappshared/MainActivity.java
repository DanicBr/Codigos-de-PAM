package com.example.meuappshared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String nomeProduto;
    int codigoProdutos;
    float precoProduto;
    boolean estoque;

    public static final String PREF_NOME = "app_aula_pref";
    //Criando a interface preferences
    SharedPreferences preferences;

    //

    SharedPreferences.Editor dados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences=getSharedPreferences(PREF_NOME,MODE_PRIVATE);
        dados = preferences.edit();
        nomeProduto = "Notebook Asus";
        codigoProdutos = 1234;
        precoProduto =  1550f;
        estoque = true;


    }
}
