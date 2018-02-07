package com.example.opilane.malumang;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class StartActivity extends AppCompatActivity {

    Button alusta;
    EditText nimi1, nimi2;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Animation animation ()

    ImageView uno, dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        uno.startAnimation(animation1);
        dos.startAnimation(animation1);

        nimi1 = findViewById(R.id.mangija1);
        nimi2 = findViewById(R.id.mangija2);
        alusta = findViewById(R.id.mangi);
        sharedPreferences = getSharedPreferences("nimed", MODE_PRIVATE);
        editor = sharedPreferences.edit();
        alusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void alusta() {
        String n1 = nimi1.getText().toString();
        String n2 = nimi2.getText().toString();
        editor.putString("nimi1", n1);
        editor.putString("nimi", n2);
        editor.commit();
        finish();
    }
}
