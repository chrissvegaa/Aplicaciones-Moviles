package com.example.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class fragdatos extends Fragment implements View.OnClickListener {

    EditText editado;
    Button boton;
    TextView vista;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_fragdatos, container, false);
        editado = view.findViewById(R.id.texto);
        boton = view.findViewById(R.id.boton);
        boton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        vista = getActivity().findViewById(R.id.viresultado);
        String cadena = ((Button)v).getText().toString();
        operaciones operar = new operaciones();
        operar.setDato(Integer.parseInt(editado.getText().toString()));
        if (cadena.equals("doble")){
            boton.setText("triple");
            vista.setText("El doble es: " + operar.doble());
        }
        else
        if (cadena.equals("triple")){
            boton.setText("cuadruple");
            vista.setText("El triple es: " + operar.triple());
        } else
        if (cadena.equals("cuadruple")){
            boton.setText("doble");
            vista.setText("El cuadruple es: " + operar.cuadruple());
        }
    }
}