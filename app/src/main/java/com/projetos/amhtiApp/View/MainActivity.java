package com.projetos.amhtiApp.View;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar; //Para utlização da Toolbar
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;

import com.projetos.amhtiApp.R;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.toolbar_main);

        //Titulo na Toolbar
        toolbar.setTitle("Unidades");
        setSupportActionBar(toolbar);

    }

    //Sobreescrita da classe menu do toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Infla o menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    //Açao dos botões da Toolbar

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Valida o Item que foi selecionado
        switch (item.getItemId()){
            case R.id.item_sair:
                deslogarUsuario();
                return true;
            case R.id.item_add_uniade:
                addUnidade();
                return true;
             default:
                 return super.onOptionsItemSelected(item);
        }


    }

    /**
     * Metodo que chamad uma Dialog
     * para cadastro de uma unidade
     */
    private void addUnidade() {
        //Instacia uma alert Dilog
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

        //Configuração da Dialog
        alertDialog.setTitle("Nova Unidade");
        alertDialog.setMessage("Digite o nome da Unidade");
        alertDialog.setCancelable(false); //não permite que click fora para sair

        //Caixa de Texto para a unidade
        final EditText editText = new EditText(MainActivity.this);
        alertDialog.setView(editText);

        //Configuração botões da Dialog
        //Botão positivo
        alertDialog.setPositiveButton("Cadastrar", null);
        //Botão negativo
        alertDialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        //Cria a AlertDialog
        alertDialog.create();
        //Mostra a AlertDialog
        alertDialog.show();
    }


    private void deslogarUsuario() {
        /**
         * PS
         * Ao configurar o firebase
         * configurar aqui o sing out do Usuário
         */
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }


}
