package com.wilson.ruapuma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainSeleccionRuta extends AppCompatActivity {

    private ImageButton informacion;
    private ImageButton pregunta;
    private  ImageButton cuenta;
    private Button ferroviaria;
    private Button chasqui;
    private Button llojeta;
    private Button irpavi2;
    private Button kalajahuira;
    private Button villasalome;


    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_seleccion_ruta);
        informacion=(ImageButton)findViewById(R.id.imgbtnInformacion);
        informacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {abrirpaginainformacion();
            }
        });
        pregunta=(ImageButton) findViewById(R.id.imgbtnPregunta);
        pregunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirpaginapregunta();
            }
        });
        cuenta=(ImageButton)findViewById(R.id.imgbtnCuenta);
        cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirpaginacuenta();
            }
        });
        ferroviaria=(Button)findViewById(R.id.btnCajaFerroviaria);
        ferroviaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abriferroviaria();
            }
        });
        chasqui=(Button)findViewById(R.id.btnchasquipampa);
        chasqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirchasqui();
            }
        });
        llojeta=(Button)findViewById(R.id.btnincallojeta);
        llojeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirllojeta();
            }
        });
        irpavi2=(Button)findViewById(R.id.btnIrpavi2);
        irpavi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abririrpavi();
            }
        });
        kalajahuira=(Button)findViewById(R.id.btnkalajahuira);
        kalajahuira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirkala();
            }
        });
        villasalome=(Button)findViewById(R.id.btnVillaSalome);
        villasalome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirvillasalome();
            }
        });
    }

    private void abrirllojeta() {

        intent=new Intent(getApplicationContext(),Maps.class);
        intent.putExtra("dato",1);
        startActivity(intent);
    }
    private void abrirvillasalome() {

        intent=new Intent(getApplicationContext(),Maps.class);
        intent.putExtra("dato",2);
        startActivity(intent);

    }

    private void abrirchasqui() {
        intent=new Intent(getApplicationContext(),Maps.class);
          intent.putExtra("dato",3);
        startActivity(intent);
    }

    private void abriferroviaria() {
        intent = new Intent(getApplicationContext(),Maps.class);
        intent.putExtra("dato",4);
        startActivity(intent);
    }

    private void abrirkala() {

        intent=new Intent(getApplicationContext(),Maps.class);
        intent.putExtra("dato",5);
        startActivity(intent);
    }

    private void abririrpavi() {
        intent=new Intent(getApplicationContext(),Maps.class);
        intent.putExtra("dato",6);
        startActivity(intent);
    }




    private void abrirpaginacuenta() {
        intent=new Intent(getApplicationContext(),Cuenta.class);
        startActivity(intent);
    }

    private void abrirpaginapregunta() {
        intent =new Intent(getApplicationContext(),Pregunta.class);
        startActivity(intent);
    }

    private void abrirpaginainformacion() {
        intent=new Intent(getApplicationContext(),Informacion.class);
        startActivity(intent);

    }

}
