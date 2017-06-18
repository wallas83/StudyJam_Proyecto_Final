package com.wilson.ruapuma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Incallojeta extends AppCompatActivity {
    private ImageButton detallellojeta;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incallojeta);
        detallellojeta=(ImageButton)findViewById(R.id.imgBtnDetalleIncallojeta);
        detallellojeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paginallojetaDetalle();
            }
        });
    }

    private void paginallojetaDetalle() {
        intent=new Intent(getApplicationContext(),Detalle.class);
        startActivity(intent);
    }
}
