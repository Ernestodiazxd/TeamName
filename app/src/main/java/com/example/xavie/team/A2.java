package com.example.xavie.team;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class A2 extends AppCompatActivity {
    private TextView txtNombre;
    private TextView txtApellido1;
    private TextView txtApellido2;
    private TextView txtEdad;
    private TextView txtSexo;
    private TextView txtAltura;
    private TextView txtColorPelo;
    private TextView txtColorOjos;
    private TextView txtColorFav;
    private ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);

        txtNombre=(TextView)findViewById(R.id.nombre);
        txtApellido1=(TextView)findViewById(R.id.apellido1);
        txtApellido2=(TextView)findViewById(R.id.apellido2);
        txtEdad=(TextView)findViewById(R.id.contEdad);
        txtSexo=(TextView)findViewById(R.id.contSexo);
        txtAltura=(TextView)findViewById(R.id.contAltura);
        txtColorPelo=(TextView)findViewById(R.id.contPelo);
        txtColorOjos=(TextView)findViewById(R.id.contOjos);
        txtColorFav=(TextView)findViewById(R.id.contFav);
        imagen=(ImageView)findViewById(R.id.imagen);

        Bundle bundle = this.getIntent().getExtras();

        txtNombre.setText(bundle.getString("nombre"));
        txtApellido1.setText(bundle.getString("apellido1"));
        txtApellido2.setText(bundle.getString("apellido2"));
        txtEdad.setText(bundle.getString("edad"));
        txtSexo.setText(bundle.getString("sexo"));
        txtAltura.setText(bundle.getString("altura"));
        txtColorPelo.setText(bundle.getString("pelo"));
        txtColorOjos.setText(bundle.getString("ojos"));
        txtColorFav.setText(bundle.getString("fav"));
        imagen.setImageResource(bundle.getInt("imagen"));


    }
}
