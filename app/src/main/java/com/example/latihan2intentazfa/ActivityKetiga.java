package com.example.latihan2intentazfa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityKetiga extends AppCompatActivity implements View.OnClickListener {
    Button kekeempat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketiga);
    kekeempat = (Button)findViewById(R.id.kekeempat);
kekeempat.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
switch (view.getId()){
    case R.id.kekeempat:
        Intent kekeempat = new Intent(ActivityKetiga.this,ActivityKeempat.class);
        startActivity(kekeempat);
        break;
        default:
            break;
}
    }
}
