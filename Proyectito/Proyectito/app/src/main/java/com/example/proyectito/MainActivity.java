package com.example.proyectito;

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
    String carroscomenta[] = {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
    String carroslista[] = {"carro1","carro2","carro3","carro4","carro5","carro6","carro7","carro8","carro9","carro10"};
    int carrosimagenes[] = {
            R.drawable.carro1, R.drawable.carro3,
            R.drawable.carro3,R.drawable.carro4,
            R.drawable.carro5,R.drawable.carro6,
            R.drawable.carro7,R.drawable.carro8,
            R.drawable.carro9,R.drawable.carro10
    };
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.vistita);
        listView.setOnItemClickListener(this);
        Adaptador adaptadorcito = new Adaptador(getApplicationContext(),carroscomenta,carrosimagenes,carroslista);
        listView.setAdapter(adaptadorcito);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, String.valueOf(position + 1), Toast.LENGTH_SHORT).show();
    }
}