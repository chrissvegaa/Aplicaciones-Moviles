package com.example.trabajo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String deportescomenta[] ={"cero", "uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};

    String deporteslista[]={"Amlo","Barcelona","Cruzasulito y Blue","Janice Nichole","Kirby","Lana","Mia","Mesiiiiii","Pikachu","Santa"};
    int deporteimagenes [] = {
                R.drawable.amlito, R.drawable.barca,
                R.drawable.cruz, R.drawable.janice,
                R.drawable.kirby, R .drawable.lanita,
                R.drawable.mia, R.drawable.papi,
                R.drawable.pika, R.drawable.santa
                            };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.vistita);
        listView.setOnItemClickListener(this);
        Adaptador adaptadorcito = new Adaptador(getApplicationContext(),deportescomenta,deporteslista,deporteimagenes);
        listView.setAdapter(adaptadorcito);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(this,String.valueOf(position),Toast.LENGTH_SHORT).show();


    }
}