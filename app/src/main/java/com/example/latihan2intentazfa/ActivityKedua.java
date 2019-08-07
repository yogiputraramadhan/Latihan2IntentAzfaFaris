package com.example.latihan2intentazfa;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityKedua extends AppCompatActivity implements View.OnClickListener {
Button keketiga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);
        keketiga = (Button)findViewById(R.id.keketiga);
        keketiga.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
switch (view.getId()){
    case R.id.keketiga:
        Intent keketiga= new Intent(ActivityKedua.this,ActivityKetiga.class);
        startActivity(keketiga);
        break;
        default:
            break;
}
    }
}
