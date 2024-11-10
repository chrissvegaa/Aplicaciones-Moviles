package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    String[] titulos = {"Messi", "Cristiano", "Gavi"};
    String[] descripcion = {"GOAT", "Bicho", "Loco"};
    int[] fotos = {R.drawable.messi, R.drawable.cristiano, R.drawable.gavi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lista);

        Adaptadorcito adaptador = new Adaptadorcito(this, fotos, titulos, descripcion);
        listView.setAdapter(adaptador);

        listView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
