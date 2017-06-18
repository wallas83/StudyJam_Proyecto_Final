package com.wilson.ruapuma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Chasquipampa extends AppCompatActivity {
    private ImageButton detallechasqui;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chasquipampa);
        detallechasqui=(ImageButton)findViewById(R.id.imgBtnDetalleChasqui);
        detallechasqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirchasquidetalle();
            }
        });
    }

    private void abrirchasquidetalle() {
        intent= new Intent(getApplicationContext(),Detalle.class);
        startActivity(intent);
    }
}
