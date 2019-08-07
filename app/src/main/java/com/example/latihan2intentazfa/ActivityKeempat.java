package com.example.latihan2intentazfa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityKeempat extends AppCompatActivity implements View.OnClickListener {
    Button kekelima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keempat);
        kekelima = (Button)findViewById(R.id.kekelima);
        kekelima.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.kekelima:
                Intent kekelima = new Intent(ActivityKeempat.this,ActivityKelima.class);
                startActivity(kekelima);
                break;
            default:
                break;
        }

    }
}
