package com.example.xavie.team;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class A1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
    }

    public void onClickTatiana(View v) {
        Intent intent = new Intent(A1.this, A2.class);

        Bundle b = new Bundle();
        b.putString("nombre", "Tatiana");
        b.putString("apellido1","Morales");
        b.putString("apellido2","González");
        b.putString("edad","24 años");
        b.putString("sexo","Mujer");
        b.putString("altura","1.64m");
        b.putString("pelo","Negro");
        b.putString("ojos","Verde");
        b.putString("fav","Rojo");
        b.putInt("imagen",R.drawable.tatiana);
        intent.putExtras(b);
        startActivity(intent);
    }

    public void onClickMikha(View v) {
        Intent intent = new Intent(A1.this, A2.class);
        Bundle b = new Bundle();
        b.putString("nombre", "Mikhail");
        b.putString("apellido1","Ivanov");
        b.putString("apellido2","");
        b.putString("edad","21 años");
        b.putString("sexo","Hombre");
        b.putString("altura","1.90m");
        b.putString("pelo","Rubio");
        b.putString("ojos","Azul Verdoso");
        b.putString("fav","Azul");
        b.putInt("imagen",R.drawable.mikha);
        intent.putExtras(b);
        startActivity(intent);
    }
    public void onClickMabel(View v) {
        Intent intent = new Intent(A1.this, A2.class);
        Bundle b = new Bundle();
        b.putString("nombre", "Mabel");
        b.putString("apellido1","Devesa");
        b.putString("apellido2","Montes");
        b.putString("edad","19 años");
        b.putString("sexo","Mujer");
        b.putString("altura","1.65m");
        b.putString("pelo","Castaño Oscuro");
        b.putString("ojos","Marrón");
        b.putString("fav","Rojo");
        b.putInt("imagen",R.drawable.mabel);
        intent.putExtras(b);
        startActivity(intent);
    }

    public void onClickIsaac(View v) {
        Intent intent = new Intent(A1.this, A2.class);
        Bundle b = new Bundle();
        b.putString("nombre", "Isaac");
        b.putString("apellido1","Pocostales");
        b.putString("apellido2","Lucena");
        b.putString("edad","24 años");
        b.putString("sexo","Hombre");
        b.putString("altura","1.74m");
        b.putString("pelo","Castaño Oscuro");
        b.putString("ojos","Marrón");
        b.putString("fav","Naranja");
        b.putInt("imagen",R.drawable.isaac);
        intent.putExtras(b);
        startActivity(intent);
    }

    public void onClickDaniel(View v) {
        Intent intent = new Intent(A1.this, A2.class);
        Bundle b = new Bundle();
        b.putString("nombre", "Daniel");
        b.putString("apellido1","Mejias");
        b.putString("apellido2","Rodríguez");
        b.putString("edad","103 años");
        b.putString("sexo","Otro");
        b.putString("altura","1.50m");
        b.putString("pelo","Verde");
        b.putString("ojos","Blancos");
        b.putString("fav","Negro");
        b.putInt("imagen",R.drawable.dani);
        intent.putExtras(b);
        startActivity(intent);
    }

    public void onClickXavi(View v) {
        Intent intent = new Intent(A1.this, A2.class);
        Bundle b = new Bundle();
        b.putString("nombre", "Xavier");
        b.putString("apellido1","Díaz");
        b.putString("apellido2","Mesa");
        b.putString("edad","21 años");
        b.putString("sexo","Hombre");
        b.putString("altura","1.70m");
        b.putString("pelo","Castaño Oscuro");
        b.putString("ojos","Marrón");
        b.putString("fav","Rojo");
        b.putInt("imagen",R.drawable.xavi);
        intent.putExtras(b);
        startActivity(intent);
    }

}

