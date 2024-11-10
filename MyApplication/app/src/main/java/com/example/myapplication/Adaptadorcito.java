package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptadorcito extends BaseAdapter {
    private Context context;
    private int[] fotos;
    private String[] titulos;
    private String[] descripcion;

    public Adaptadorcito(Context context, int[] fotos, String[] titulos, String[] descripcion) {
        this.context = context;
        this.fotos = fotos;
        this.titulos = titulos;
        this.descripcion = descripcion;
    }

    @Override
    public int getCount() {
        return titulos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.layout, null);
        }

        ImageView imageView = convertView.findViewById(R.id.imageicon);
        TextView titleView = convertView.findViewById(R.id.textview);
        TextView descriptionView = convertView.findViewById(R.id.textview2);

        imageView.setImageResource(fotos[position]);
        titleView.setText(titulos[position]);
        descriptionView.setText(descripcion[position]);

        return convertView;
    }
}
