package com.example.ifanidado;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button boton;
    EditText editado;
    ConvertirNumero convertirNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.boton);
        editado = findViewById(R.id.editado);
        boton.setOnClickListener(this);

        convertirNumero = new ConvertirNumero();
    }

    @Override
    public void onClick(View view) {
            int num = Integer.parseInt(editado.getText().toString());
            String letra = convertirNumero.convertir(num);
            Toast.makeText(this, letra, Toast.LENGTH_SHORT).show();
    }
}