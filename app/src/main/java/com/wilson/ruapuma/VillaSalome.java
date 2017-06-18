package com.wilson.ruapuma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class VillaSalome extends AppCompatActivity {
    private ImageButton detallesalome;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villa_salome);
        detallesalome=(ImageButton)findViewById(R.id.imgBtnDetalleVillaSalome);
        detallesalome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detallevillaSalome();
            }
        });
    }

    private void detallevillaSalome() {
        intent=new Intent(getApplicationContext(),Detalle.class);
        startActivity(intent);
    }
}
