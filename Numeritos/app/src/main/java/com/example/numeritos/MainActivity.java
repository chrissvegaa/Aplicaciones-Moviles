package com.example.numeritos;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText textito;
    TextView vistita;
    Button botoncito;
    int contador = 0;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textito = findViewById(R.id.textito);
        vistita = findViewById(R.id.vistita);
        botoncito = findViewById(R.id.boton);

        botoncito.setOnClickListener(this);

        // Añadimos un TextWatcher para monitorear cambios en tiempo real
        textito.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // No necesitamos hacer nada aquí
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // No necesitamos hacer nada aquí
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

    @Override
    public void onClick(View view) {
        contador = 0;

        // Cancelar el timer si ya está corriendo
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }

        countDownTimer = new CountDownTimer(999999 * 1000L, 300) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (contador <= 999999) {
                    textito.setText(Integer.toString(contador));
                    Metodos met = new Metodos();
                    String textoEnPalabras = met.convertir(contador);
                    vistita.setText(textoEnPalabras);
                    contador++;
                } else {
                    countDownTimer.cancel();
                }
            }

            @Override
            public void onFinish() {
                contador = 0;
            }
        };
        countDownTimer.start();
    }
}

