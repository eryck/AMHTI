package com.projetos.amhti.View;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar; //Para utlização da Toolbar
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.projetos.amhti.R;

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
}
