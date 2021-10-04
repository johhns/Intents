package com.developer.johhns.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnWeb, btnLlamada, btnMapa, btnFoto, btnCorreo ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWeb     = findViewById( R.id.btnWeb ) ;
        btnLlamada = findViewById( R.id.btnLlamada ) ;
        btnMapa    = findViewById( R.id.btnMaps ) ;
        btnFoto    = findViewById( R.id.btnFoto ) ;
        btnCorreo  = findViewById( R.id.btnLlamada ) ;

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( Intent.ACTION_VIEW , Uri.parse("http://www.bufa.es/google-maps-latitud-longitud") ) );
            }
        });

        btnLlamada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( Intent.ACTION_CALL , Uri.parse( "tel:22728212" ) ) );
            }
        });

        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity( new Intent( Intent.ACTION_VIEW , Uri.parse( "geo:13.565479318599591,-449.115667641163" )) );
            }
        });

        btnFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MediaStore.ACTION_IMAGE_CAPTURE) );
            }
        });

        btnCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent correo = new Intent( Intent.ACTION_SEND );
                correo.setType("text/plain");
                correo.putExtra(Intent.EXTRA_SUBJECT,"Prueba de correo");
                correo.putExtra(Intent.EXTRA_TEXT,"Este es un correo de prueba desde android studio") ;
                correo.putExtra(Intent.EXTRA_EMAIL,new String[] { "johhns@hotmail.com","developer.johhns@gmail.com" }) ;
                startActivity(correo);
            }
        });

    }




}