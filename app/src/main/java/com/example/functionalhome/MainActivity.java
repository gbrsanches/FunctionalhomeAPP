package com.example.functionalhome;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent it = new Intent(MainActivity.this, MainActivity.class);
               startActivity(it);
            }
        });

        Button btn_lampada = findViewById(R.id.btn_lampada); //colocando um botão no MainActivity.
        btn_lampada.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent func1 = new Intent(MainActivity.this, Lampadas.class);
                startActivity(func1);
            }
        });

        Button btn_eletrodomestico = findViewById(R.id.btn_eletrodomestico);
        btn_eletrodomestico.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent func2 = new Intent(MainActivity.this, Eletrodomestico.class);
                startActivity(func2);
            }
        });

        Button btn_garagem = findViewById(R.id.btn_garagem);
        btn_garagem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent func3 = new Intent(MainActivity.this, Garagem.class);
                startActivity(func3);
            }
        });

        Button btn_medidor = findViewById(R.id.btn_medidor);
        btn_medidor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent func4 = new Intent(MainActivity.this, Medidor.class);
                startActivity(func4);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
