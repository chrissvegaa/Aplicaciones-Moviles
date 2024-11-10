package com.example.combosdinamicos;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Spinner spinnerAlcaldia;
    Spinner spinnerColonia;
    Button boton;
    TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerAlcaldia = findViewById(R.id.spinnerAlcaldia);
        spinnerColonia = findViewById(R.id.spinnerColonia);
        boton = findViewById(R.id.boton);
        textViewResultado = findViewById(R.id.texto);

        boton.setOnClickListener(this);

        DatosAlcaldias datosAlcaldias = new DatosAlcaldias();
        ArrayList<Alcaldia> listaAlcaldias = datosAlcaldias.getListaAlcaldias();

        ArrayList<String> nombresAlcaldias = new ArrayList<>();
        for (Alcaldia alcaldia : listaAlcaldias) {
            nombresAlcaldias.add(alcaldia.getNombre());
        }

        ArrayAdapter<String> adapterAlcaldias = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nombresAlcaldias);
        adapterAlcaldias.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAlcaldia.setAdapter(adapterAlcaldias);

        spinnerAlcaldia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ArrayList<String> colonias = listaAlcaldias.get(position).getColonias();

                ArrayAdapter<String> adapterColonias = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item, colonias);
                adapterColonias.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerColonia.setAdapter(adapterColonias);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
    @Override
    public void onClick(View view) {
        String alcaldiaSeleccionada = spinnerAlcaldia.getSelectedItem().toString();
        String coloniaSeleccionada = spinnerColonia.getSelectedItem().toString();

        String resultado = "Alcaldía: " + alcaldiaSeleccionada + "\nColonia: " + coloniaSeleccionada;
        textViewResultado.setText(resultado);
    }
}