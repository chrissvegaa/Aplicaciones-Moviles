package com.example.numeritos;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText textito; // definido como texto editable
    TextView vistita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textito = findViewById(R.id.textito);
        vistita = findViewById(R.id.vistita);

        // Añadimos un TextWatcher para monitorear cambios en tiempo real
        textito.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String textote = editable.toString();

                if (!textote.isEmpty()) {
                    Metodos met = new Metodos();
                    int numero = Integer.parseInt(textote);
                    if (numero >= 0 && numero <= 999999) {
                        String textoEnPalabras = met.convertir(numero);
                        vistita.setText(textoEnPalabras);
                    } else {
                        vistita.setText("Número fuera de rango");
                    }
                } else {
                    vistita.setText("");
                }
            }
        });
    }
}

