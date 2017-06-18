package com.wilson.ruapuma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Kalajahuira extends AppCompatActivity {
    private ImageButton detallejahuira;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalajahuira);
        detallejahuira=(ImageButton)findViewById(R.id.imgBtnDetallekalajahuira);
        detallejahuira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detallekala();
            }
        });
    }

    private void detallekala() {
        intent=new Intent(getApplicationContext(),Detalle.class);
        startActivity(intent);
    }
}
