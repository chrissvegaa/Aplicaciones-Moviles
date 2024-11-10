package com.example.proyectito;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Adaptador extends BaseAdapter {
    Context contexto;
    String listacarro[];
    String listacomentar[];
    int listaimagenes[];
    LayoutInflater inflater;

    public Adaptador(Context contexto, String[] listacarro, int listaimagenes[], String[] listacomentar) {
        this.contexto = contexto;
        this.listacarro = listacarro;
        this.listaimagenes = listaimagenes;
        this.listacomentar = listacomentar;
        this.inflater = LayoutInflater.from(contexto);
    }

    @Override
    public int getCount() {
        return listacomentar.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.basurita,null);
        TextView textView = convertView.findViewById(R.id.textview);
        TextView textView2 = convertView.findViewById(R.id.textview2);
        ImageView carroimg = convertView.findViewById(R.id.imageicon);
        textView.setText(listacarro[position]);
        textView2.setText(listacomentar[position]);
        carroimg.setImageResource(listaimagenes[position]);
        return convertView;
    }
}
