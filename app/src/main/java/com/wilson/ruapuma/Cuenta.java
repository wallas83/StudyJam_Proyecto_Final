package com.wilson.ruapuma;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Cuenta extends AppCompatActivity {
    private ImageButton facebook;
    private ImageButton github;
    private ImageButton twitter;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);
        facebook=(ImageButton)findViewById(R.id.imgBtnFacebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirface();
            }
        });
        github=(ImageButton)findViewById(R.id.imgBtnGithub);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirgit();
            }
        });
        twitter=(ImageButton)findViewById(R.id.imgBtnTwitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirtwitter();
            }
        });
    }

    private void abrirtwitter() {
        intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://twitter.com/Wilmen83Wilson?lang=es"));
        startActivity(intent);
    }

    private void abrirgit() {

        intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://github.com/wallas83"));
        startActivity(intent);

    }

    private void abrirface() {

        intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/wilson.huanca.5"));
        startActivity(intent);
    }
}
