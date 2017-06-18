package com.wilson.ruapuma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Irpavi2 extends AppCompatActivity {
    private ImageButton detalleirpavi2;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irpavi2);
        detalleirpavi2=(ImageButton)findViewById(R.id.imgBtnDetalleIrpavi2);
        detalleirpavi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirdetalleirpavi();
            }
        });
    }

    private void abrirdetalleirpavi() {
        intent = new Intent(getApplicationContext(),Detalle.class);
        startActivity(intent);
    }
}
