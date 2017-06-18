package com.wilson.ruapuma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CajaFerroviaria extends AppCompatActivity {
    private ImageButton detalleferro;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caja_ferroviaria);
        detalleferro=(ImageButton)findViewById(R.id.imgBtndetallecajaFerro);
        detalleferro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirdetellaferroviaria();
            }
        });
    }

    private void abrirdetellaferroviaria() {
        intent = new Intent(getApplicationContext(),Detalle.class);
        startActivity(intent);
    }
}
